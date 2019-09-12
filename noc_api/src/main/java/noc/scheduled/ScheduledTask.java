package noc.scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import java.util.List;

@Component
public class ScheduledTask {

    @Scheduled(cron = "0 0/2 * * * ? ")//从0分钟开始,每 2分钟执行一次
    public void task1() {
        System.out.println("每2分钟执行一次");
        Jedis jedis = new Jedis("192.168.163.129",6379);
        System.out.println(jedis);
        List<String> list = jedis.mget("age","name");
        jedis.mset("asd","asdasd");
        for (String s : list) {
            System.out.println(s);
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}