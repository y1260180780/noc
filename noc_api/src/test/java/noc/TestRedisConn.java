package noc;

import com.alibaba.fastjson.JSON;
import noc.entity.QueryHost;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import java.util.List;
@Configuration
@Component
@PropertySource({"classpath:application.properties"})
public class TestRedisConn {
    @Value("${spring.redis.port}")
    private int port;

    @Value("${spring.redis.host}")
    private String host;

    @Test
    public void testredisconn(){
        System.out.println(host);
        System.out.println(port);
        Jedis jedis = new Jedis(host,port);
//        Jedis jedis = new Jedis("192.168.163.129",6379);
        System.out.println(jedis);
        List<String> list = jedis.mget("age","name");
        jedis.mset("asd","asdasd");
        for (String s : list) {
            System.out.println(s);
        }
    }

    @Test
    public void testrediscah(){
        Jedis jedis = new Jedis("192.168.163.129",6379);
        QueryHost queryHost = new QueryHost();
        queryHost.setCorpName("A");
        queryHost.setDepName("B");
        queryHost.setIds(new Integer[]{1,5,9});
        queryHost.setIp("C");
        queryHost.setIps(new String[]{"A","B"});
        queryHost.setName("D");
        queryHost.setPageIndex(7);
        queryHost.setPageSize(9);
        queryHost.setSn("E");
        queryHost.setSns(new String[]{"R","y"});
        queryHost.setTenantName("O");
        queryHost.setPdlName("P");
        queryHost.setType("T");
        jedis.set("redis",JSON.toJSONString(queryHost));
        String redis = jedis.get("redis");
        QueryHost queryHost1 = JSON.parseObject(redis, QueryHost.class);
        System.out.println(queryHost1);

    }
}
