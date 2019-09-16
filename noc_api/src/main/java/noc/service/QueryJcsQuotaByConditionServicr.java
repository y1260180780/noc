package noc.service;

import noc.entity.QueryJcsQuotaByCondition_Request;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "QueryJcsQuotaByConditionServicr", url = "http://open.ark.jd.com")
public interface QueryJcsQuotaByConditionServicr {
    //云主机配额查询接口
    @PostMapping("/api/v1/lord/queryJcsQuotaByCondition")
    String queryJcsQuotaByConditionServicr(@RequestHeader("AUTH-APP-ID") String auto_app_id, @RequestHeader("AUTH-TOKEN") String auth_token, @RequestBody QueryJcsQuotaByCondition_Request queryJcsQuotaByCondition_resquest);

}
