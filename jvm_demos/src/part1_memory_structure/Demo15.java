package part1_memory_structure;

import java.io.*;

/**
 * -XX:StringTableSize=200000 -XX:+PrintStringTableStatistics
 * 不加参数是268，加参数是401，耗费时间是调整StringTableSize
 */
public class Demo15 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new FileInputStream("linux.words"), "utf-8"))) {
            String line = null;
            long start = System.nanoTime(); //开始时间，纳秒级
            System.nanoTime();
            while (true) {
                line = reader.readLine();
                if (line == null)
                    break;
                line.intern();
            }
            System.out.println("cost:" + (System.nanoTime() - start) / 1000000); //打印花费时间
        }
    }
}
