package file;

import java.io.File;
import java.io.IOException;

/**
 * file常用API => 创建、删除API
 */
public class FileAPI_4 {
    public static void main(String[] args) throws IOException {
        // 文件的创建
        File f = new File("aaa.txt");
        System.out.println(f);
        System.out.println("是否存在:" + f.exists()); // false
        System.out.println("是否创建:" + f.createNewFile()); // true
        System.out.println("是否存在:" + f.exists()); // true

        // 目录的创建
        File f2 = new File("newDir");
        System.out.println(f2);
        System.out.println("是否存在:" + f2.exists());// false
        System.out.println("是否创建:" + f2.mkdir());    // true
        System.out.println("是否存在:" + f2.exists());// true

        // 创建多级目录
        File f3 = new File("newDira//newDirb");
        System.out.println(f3.mkdir());// false
        File f4 = new File("newDira//newDirb");
        System.out.println(f4.mkdirs());// true
        System.out.println(f3);
        System.out.println(f4);

        // 文件的删除
        System.out.println(f.delete());// true

        // 目录的删除
        System.out.println(f2.delete());// true
        System.out.println(f4.delete());// f4和f3同名，f3被删除，所以f4 => false
    }
}
