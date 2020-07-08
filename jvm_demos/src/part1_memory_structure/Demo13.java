package part1_memory_structure;

import java.util.ArrayList;
import java.util.List;

/**
 * 演示StringTable 位置
 * 在jdk8下设置 -Xmx1Om -XX:-UseGCOverheadLimit
 * 在jdk6下设置 -XX:MaxPermSize=1Ѳm
 */
public class Demo13 {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList();
        int i = 0;
        try {
            for (int j = 0; j < 260000; j++) {
                list.add(String.valueOf(j).intern());
                i++;
            }
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println(i);
        }
    }
}

