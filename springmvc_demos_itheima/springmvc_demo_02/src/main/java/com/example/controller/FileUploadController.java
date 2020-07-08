package com.example.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("upload")
public class FileUploadController {
    /**
     * 传统方式，利用upload组件完成上传
     *
     * @param request
     * @return
     */
    @RequestMapping("/fileupload1")
    public String fileUpload1(HttpServletRequest request) throws Exception {
        /**
         * 1.获取上传文件路径
         */
        //获取上传文件路径
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        //判断路径是否存在
        File file = new File(path);
        if (!file.exists()) {//文件路径不存在
            //创建该文件夹
            file.mkdirs();
        }
        /**
         * 2.解析request对象，并获取上传文件项
         */
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        //解析request
        List<FileItem> fileItems = upload.parseRequest(request);
        for (FileItem item : fileItems) {
            //判断当前项目是否为上传文件项
            if (item.isFormField()) {
                /*说明为普通表单项*/
            } else {
                /*说明为上传文件项*/
                //获取上传文件名
                String filename = item.getName();
                //把文件名称设置成唯一值UUID
                //设置为随机的UUID并将字符串中的'-'替换为''
                String uuid = UUID.randomUUID().toString().replace("_", "");
                //字符串拼接->设置新的filename
                filename = uuid + "_" + filename;
                //完成文件上传
                item.write(new File(path, filename));
                //删除临时文件
                item.delete();
            }
        }
        return "success";
    }

    /**
     * SpringMVC方式
     *
     * @param upload
     * @return
     */
    @RequestMapping("/fileupload2")
    public String fileUpload2(HttpServletRequest request, MultipartFile upload) throws Exception {
        /**
         * 1.获取上传文件路径
         */
        //获取上传文件路径
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        //判断路径是否存在
        File file = new File(path);
        if (!file.exists()) {//文件路径不存在
            //创建该文件夹
            file.mkdirs();
        }
        //获取上传文件名
        String filename = upload.getOriginalFilename();
        //把文件名称设置成唯一值UUID
        //设置为随机的UUID并将字符串中的'-'替换为''
        String uuid = UUID.randomUUID().toString().replace("_", "");
        //字符串拼接->设置新的filename
        filename = uuid + "_" + filename;
        //完成文件上传
        upload.transferTo(new File(file, filename));
        return "success";
    }

    /**
     * SpringMVC跨服务器方式的文件上传 *
     * @param upload
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/fileupload3")
    public String fileupload3(MultipartFile upload) throws Exception {
        System.out.println("SpringMVC跨服务器方式的文件上传...");
        // 定义图片服务器的请求路径
        String path = "http://localhost:9090/uploads/";
        // 获取到上传文件的名称
        String filename = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase(); // 把文件的名称唯一化
        filename = uuid + "_" + filename;
        // 向图片服务器上传文件
        // 创建客户端对象
        Client client = Client.create();
        // 连接图片服务器
        WebResource webResource = client.resource(path + filename); // 上传文件
        webResource.put(upload.getBytes());
        return "success";
    }
}

