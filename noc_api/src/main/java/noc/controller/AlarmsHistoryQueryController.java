package noc.controller;

import com.alibaba.fastjson.JSON;
import noc.entity.AlarmsHistoryQueryRequest;
import noc.entity.AlarmsHistoryQueryResponse;
import noc.service.AlarmsHistoryQueryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlarmsHistoryQueryController {
    private static Logger logger =  LoggerFactory.getLogger(Sre_Controller.class);
    @Autowired
    private AlarmsHistoryQueryService historyQueryService;
    @PostMapping("/hawkeye/api/v1/open-api/{tenant}/alarms/history/queryByCondition")
    public AlarmsHistoryQueryResponse alarmsHistoryQuery(@RequestBody AlarmsHistoryQueryRequest historyQueryResquest){
        logger.info("请求参数"+historyQueryResquest);
        String historyQuery = historyQueryService.alarmsHistoryQueryService("noc", "K4CrovsZ9IyavRrkwK",historyQueryResquest);
        AlarmsHistoryQueryResponse alarmsHistoryQueryResponse = JSON.parseObject(historyQuery, AlarmsHistoryQueryResponse.class);
        logger.info("响应参数"+alarmsHistoryQueryResponse);
        return alarmsHistoryQueryResponse;
    }


}
