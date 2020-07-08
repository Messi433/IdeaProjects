package com.example.controller;

import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

/**
 * @Classname WebServiceTestController
 * @Description TODO
 * @Date 2020/6/23 14:26
 * @Author 曹珂
 */
@Controller
@RequestMapping("/webservice")
public class WebServiceTestController {
    @RequestMapping("/test")
    public void testInterfaces(HttpServletRequest request) throws Exception {
        //传入中文参数并设置编码格式
        String param = "{\"url\":\"中文\"}";
        param = URLEncoder.encode(param, "UTF-8");
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL("http://10.68.2.40:8080/callPlatformService/publicHealthInterface/getTJCheckItemInfos");
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(new OutputStreamWriter(conn.getOutputStream(), "UTF-8"));
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
            //解析json对象
            JSONObject jsStr = JSONObject.fromObject(result);
            System.out.println(jsStr.get("firstName"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
