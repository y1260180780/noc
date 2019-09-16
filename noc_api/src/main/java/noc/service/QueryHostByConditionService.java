package noc.service;

import com.alibaba.fastjson.JSON;
import noc.entity.QueryHost;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "QueryHostByCondition-Service", url = "http://open.ark.jd.com")
public interface QueryHostByConditionService {
    //根据条件查询host集合
    @PostMapping("/api/v1/lord/queryHostByCondition")
    public String queryHostByCondition(@RequestHeader("AUTH-APP-ID") String auto_app_id, @RequestHeader("AUTH-TOKEN") String auth_token,@RequestBody QueryHost queryHost);

}
