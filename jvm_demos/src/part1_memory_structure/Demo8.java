package part1_memory_structure;


import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

/**
 * 演示元空间内存溢出
 * -XX:MapxMetaspaceSize=8m
 */
public class Demo8 extends ClassLoader {
    // 可以用来加载类的二进制字节码
    public static void main(String[] args) {
        int j = 0;
        try {
            Demo8 test = new Demo8();
            for (int i = 0; i < 10000; i++, j++) {
                // ClassWriter作用是生成类的二进制字节码
                ClassWriter cw = new ClassWriter(0);
                //版本号，public, 类名，包名，父类，接口
                cw.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, "Class" + i, null, "java/lang/object", null);
                //返回byte[]
                byte[] code = cw.toByteArray();
                //执行了类的加载
                test.defineClass("Class" + i, code, 0, code.length); // Class 对象
            }
        } finally {
            System.out.println(j);
        }
    }
}
