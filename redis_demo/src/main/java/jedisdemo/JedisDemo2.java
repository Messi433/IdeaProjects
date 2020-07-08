package jedisdemo;

import redis.clients.jedis.Jedis;
import util.JedisPoolUtil;

/**
 * 模拟业务：限制用户调用API次数
 */
public class JedisDemo2 {
    public static void main(String[] args) {
        //多线程模拟多用户
        Mythread mt1 = new Mythread("初级用户", 10);
        Mythread mt2 = new Mythread("高级用户", 30);
        mt1.start();
        mt2.start();
    }
}

/**
 * 业务类
 */
class MyService {
    private String id;
    private int num;

    //构造函数，不同用户传入 => 不同的id、不同的调用次数
    public MyService(String id, int num) {
        this.id = id;
        this.num = num;
    }

    //控制单元
    public void service() {
        Jedis jedis = JedisPoolUtil.getJedis();
        String value = jedis.get("compid:" + id);
        try {
            if (value == null) {
                //不存在，创建该值,初始值为最大整形-10，自增10次后数据溢出
                jedis.setex("compid:" + id, 30, Long.MAX_VALUE - num + "");
            } else {
                //执行业务
                Long val = num - (Long.MAX_VALUE - jedis.incr("compid:" + id));
                business(id, val);
            }
        } catch (Exception e) {
            System.out.println(id + "  调用次数达到上限，请升级会员级别");
            return;
        } finally {
            jedis.close();
        }
    }

    //业务执行
    public void business(String id, Long val) {
        System.out.println("用户 " + id + " MyService......执行" + val + "次");
    }
}

/**
 * 线程类
 */
class Mythread extends Thread {
    MyService ms;

    //构造函数，new一个线程对象 =>对应其用户性质、调用次数
    public Mythread(String id, int num) {
        this.ms = new MyService(id, num);
    }

    @Override
    public void run() {
        while (true) {
            ms.service();
            try {
                //这里可以改成随机数
                Thread.sleep(300L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
