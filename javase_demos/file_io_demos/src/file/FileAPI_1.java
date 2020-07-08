package file;

import java.io.File;

/**
 * file常用API => 获取文件的api
 */
public class FileAPI_1 {
    public static void main(String[] args) {
        //文件路径
        File f = new File("d:/aaa/bbb.java");
        System.out.println("文件绝对路径:" + f.getAbsolutePath());
        System.out.println("文件构造路径:" + f.getPath());
        System.out.println("文件名称:" + f.getName());
        System.out.println("文件长度:" + f.length() + "字节");
        //目录路径
        File f2 = new File("d:/aaa");
        System.out.println("目录绝对路径:" + f2.getAbsolutePath());
        System.out.println("目录构造路径:" + f2.getPath());
        System.out.println("目录名称:" + f2.getName());
        System.out.println("目录长度:" + f2.length());
    }
}
