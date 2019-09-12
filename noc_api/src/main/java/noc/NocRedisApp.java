package noc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableFeignClients(basePackages = {"noc"})
@ComponentScan("noc")
@EnableScheduling
public class NocRedisApp {
    public static void main(String[] args) {
        SpringApplication.run(NocRedisApp.class,args);
    }
}
