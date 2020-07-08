import domain.Student;

import java.util.HashSet;

/**
 * 自定义类型对象，若对象属性相同，必须重写hashCode() equals(),否则默认这两个元素对象不同，不会去重
 */
public class HashSetTest2 {
    public static void main(String[] args) {
//创建集合对象 该集合中存储 Student类型对象
        HashSet<Student> stuSet = new HashSet<Student>(); //存储
        Student stu = new Student("于谦", 43);
        stuSet.add(stu);
        stuSet.add(new Student("郭德纲", 44));
        stuSet.add(new Student("于谦", 43));
        stuSet.add(new Student("郭麒麟", 23));
        stuSet.add(stu);
        for (Student stu2 : stuSet) {
            System.out.println(stu2);
        }

    }
}
