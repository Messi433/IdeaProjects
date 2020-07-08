package baozi;
/*
    生产者(包子铺)类:是1个线程类,可以继承Thread
    1.设置线程任务(run):生产包子
    2.对包子的状态进行判断
        true:有包子 => 包子铺调用wait方法进入等待状态
        false:没有包子 => 包子铺生产包子
    3.增加一些趣味性:交替生产两种包子
        有两种状态(i%2==0)
    4.包子铺生产好了包子 => 修改包子的状态为true => 唤醒吃货线程,让吃货线程吃包子
    5.注意:
        包子铺线程和包子线程关系-- >通信(互斥)
        必须同时同步,保证两个线程只能有1个在执行
        锁对象必须保证唯一 , 可以使用包子对象作为锁对象
        包子铺类和吃货的类就需要把包子对象作为参数传递进来
    6.属性：
    1)需要在成员位置创建一个包子变量
    2)使用带参数构造方法,为这个包子变量赋值
 */
public class BaoZiPu extends Thread{
    private BaoZi bz;
    //构造器,new时传递,线程名称及包子对象
    public BaoZiPu(String name, BaoZi bz) {
        super(name);
        this.bz = bz;
    }
    //重写生产包子的线程
    @Override
    public void run() {
        int count = 0; //包子的数量
        while (true){ //包子铺一直生产包子
            synchronized (bz){ //包子共享变量作为锁对象 =>
                if (bz.flag == true){ //如果有包子 => 自我阻塞,等待让吃货线程唤醒
                    try {
                        bz.wait(); //阻塞
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //如果没有包子 => 生产包子
                System.out.println("包子铺=>生产包子");
                if(count%2 == 0){
                    // 冰皮  五仁
                    bz.pier = "冰皮";
                    bz.xianer = "五仁";
                }else{
                    // 薄皮  牛肉大葱
                    bz.pier = "薄皮";
                    bz.xianer = "牛肉大葱";
                }
                count++;
                bz.flag = true; //
                System.out.println("包子造好了："+bz.pier+bz.xianer+" 吃货来吃吧");
                System.out.println();
                //唤醒等待线程 （吃货）
                bz.notify();
            }
        }
    }
}
