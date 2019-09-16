package noc.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Sre-Success-Ratio-Service",url = "http://172.19.23.173")
public interface Sre_Success_Ratio_Service {
    //查询用户各个域名业务请求成功率
    @GetMapping("/defined/success_ratio")
    public String getSre(@RequestParam("pin") String pin);
}
