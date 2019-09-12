package noc.service;

import noc.entity.QueryHost;
import noc.entity.QueryHostResponse;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "onlyName",url = "http://114.67.237.153/dse/v1/proxy")
public interface RedisService {
    @GetMapping("")
    public QueryHostResponse redis(QueryHost json);

}
