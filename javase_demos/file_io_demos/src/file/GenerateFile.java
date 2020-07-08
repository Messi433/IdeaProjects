package file;

import java.io.File;

/**
 * 文件的创建方式 => 构造方法
 */
public class GenerateFile {
    public static void main(String[] args) {
        // 文件路径名
        String pathname = "D:\\aaa.txt";
        File file1 = new File(pathname);
        System.out.println(file1); //D:\aaa.txt

        // 文件路径名
        String pathname2 = "D:\\aaa\\bbb.txt";
        File file2 = new File(pathname2);
        System.out.println(file2); // D:\aaa\bbb.txt
        // 通过父路径和子路径字符串
        String parent = "d:\\aaa";
        String child = "bbb.txt";
        File file3 = new File(parent, child);
        System.out.println(file3); //d:\aaa/bbb.txt => win是反斜杠，linux是正斜杠

        // 通过父级File对象和子路径字符串
        File parentDir = new File("d:\\aaa");
        String child2 = "bbb.txt";
        File file4 = new File(parentDir, child2);
        System.out.println(file4); //d:\aaa/bbb.txt => win是反斜杠，linux是正斜杠

    }
}
