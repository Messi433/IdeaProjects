package util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.ResourceBundle;

public class JedisPoolUtil {
    private static JedisPool jp;
    private static String host;
    private static int port;
    private static int maxTotal;
    private static int maxIdle;

    //静态代码块,初始化信息静态加载 => 改为配置文件方式加载连接信息
    static {
        JedisPoolConfig jpc = new JedisPoolConfig();
        ResourceBundle rb = ResourceBundle.getBundle("redis");
        host = rb.getString("redis.host");
        port = Integer.parseInt(rb.getString("redis.port"));
        maxTotal = Integer.parseInt(rb.getString("redis.maxTotal"));
        maxIdle = Integer.parseInt(rb.getString("redis.maxIdle"));
        //最大连接数
        jpc.setMaxTotal(maxTotal);
        //最大活动连接数
        jpc.setMaxIdle(maxIdle);
        jp = new JedisPool(jpc, host, port);
    }

    //设置静态方法，方法在类加载时候初始化，且唯一
    public static Jedis getJedis() {
        return jp.getResource();
    }
}
