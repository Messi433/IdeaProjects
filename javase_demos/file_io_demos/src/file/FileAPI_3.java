package file;

import java.io.File;

/**
 * file常用API => 判断文件是否存在
 * mac环境测试
 */
public class FileAPI_3 {
    public static void main(String[] args) {
        File f = new File("/Users/messi433/Downloads/test/file1.java");
        File f2 = new File("/Users/messi433/Downloads/test");
        // 判断是否存在
        System.out.println("/Users/messi433/Downloads/test/file.java 是否存在:" + f.exists());
        System.out.println("/Users/messi433/Downloads/test 是否存在:" + f2.exists());
        // 判断是文件还是目录
        System.out.println("/Users/messi433/Downloads/test 文件?:" + f2.isFile());
        System.out.println("/Users/messi433/Downloads/test 目录?:" + f2.isDirectory());
    }
}
