package part1_memory_structure;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * -XX:StringTableSize=200000 -XX:+PrintStringTableStatistics
 * 不加参数是268，加参数是401，耗费时间是调整StringTableSize
 */
public class Demo16 {
    public static void main(String[] args) throws IOException {
        List<String> address = new ArrayList<>();
        System.in.read();
        for (int i = 0; i < 10; i++) { //循环10次 => 保证有10次重复单词读取
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream("linux.words"), "utf-8"))) {
                String line = null;
                long start = System.nanoTime(); //开始时间，纳秒级
                System.nanoTime();
                while (true) {
                    line = reader.readLine();
                    if (line == null)
                        break;
                    //address.add(line);
                    // 先字符串入串池，返回串池中的str，串池外的元素会被垃圾回收 => 重复元素不会入串池，会被垃圾回收，性能优化
                    address.add(line.intern());

                }
                System.out.println("cost:" + (System.nanoTime() - start) / 1000000); //打印花费时间
            }
        }
        System.in.read();
    }
}

