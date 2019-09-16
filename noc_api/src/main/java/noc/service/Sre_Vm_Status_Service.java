package noc.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "Sre-Vm-Status-Service",url = "http://172.19.23.173")
public interface Sre_Vm_Status_Service {
    //根据用户pin查询用户vm总体状态
    @GetMapping("/defined/vm_status")
    public String sre_Vm_Status(@RequestParam("pin") String pin);
}
