package noc.service;

import noc.entity.AlarmsHistoryQueryRequest;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "AlarmsHistoryQueryService" , url = "http://open.ark.jd.com/hawkeye")
public interface AlarmsHistoryQueryService {
    //报警历史查询接口
    @PostMapping("/api/v1/open-api/{tenant}/alarms/history/queryByCondition")
    String alarmsHistoryQueryService(@RequestHeader("AUTH-APP-ID") String auto_app_id, @RequestHeader("AUTH-TOKEN") String auth_token, @RequestBody AlarmsHistoryQueryRequest historyQueryResquest);
}
