package jedisdemo;

import com.sun.xml.internal.fastinfoset.util.StringIntMap;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Map;

public class JedisDemo1 {
    public static void main(String[] args) {
        String testList = "test_list";
        String testString = "test_String";
        String testHash = "test_hash";
        //建立连接
        Jedis jedis = new Jedis("127.0.0.1",6379);
//        jedis.del("test","test_list1");
        //关闭连接
        jedis.close();
    }
    public static void hashAdd(Jedis jedis,String test){
        jedis.hset(test,"f1","v1");
        jedis.hset(test,"f2","v2");
        jedis.hset(test,"f3","v3");
        Map<String, String> stringMaps = jedis.hgetAll(test);
        System.out.println(stringMaps);
    }
    public static void stringAdd(Jedis jedis,String test){
        jedis.set(test,"HelloWorld");
        System.out.println(jedis.get(test));
    }
    public static void listAdd(Jedis jedis,String test){
        jedis.lpush(test,"a","b","c");
        jedis.rpush(test,"d");
        List<String> strs = jedis.lrange(test,0,-1);
        System.out.println(strs);
    }
}
