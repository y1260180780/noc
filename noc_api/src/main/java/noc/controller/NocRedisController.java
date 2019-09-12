package noc.controller;

import com.alibaba.fastjson.JSON;
import noc.entity.QueryHost;
import noc.entity.QueryHostResponse;
import noc.service.RedisService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import java.util.List;

@RestController
@PropertySource({"classpath:application.properties"})
public class NocRedisController {

    @Value("${spring.redis.port}")
    private int port;

    @Value("${spring.redis.host}")
    private String host;

    @Autowired
    private RedisService service;

    @RequestMapping(value = "/redis")
    public QueryHostResponse redis(QueryHost json){
        System.out.println(json);
        QueryHostResponse queryHost = service.redis(json);
        System.out.println(queryHost);
        Jedis jedis = new Jedis("192.168.163.129",6379);
        //对象的封装  存储进Redis数据库
        jedis.set("redis",JSON.toJSONString(queryHost));
        String redis = jedis.get("redis");
        //将json取出，并映射成对象
        QueryHost queryHost1 = JSON.parseObject(redis, QueryHost.class);
        System.out.println(queryHost1);

        return queryHost;
    }
    @Test
    public void testredis(){

        Jedis jedis = new Jedis(host,port);
        System.out.println(jedis);
        List<String> list = jedis.mget("age","name");
        jedis.mset("asd","asdasd");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
