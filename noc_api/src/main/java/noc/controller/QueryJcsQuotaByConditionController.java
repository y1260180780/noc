package noc.controller;

import com.alibaba.fastjson.JSON;
import noc.entity.QueryJcsQuotaByCondition_Response;
import noc.entity.QueryJcsQuotaByCondition_Request;
import noc.service.QueryJcsQuotaByConditionServicr;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryJcsQuotaByConditionController {
    private static Logger logger = LoggerFactory.getLogger(Sre_Controller.class);
    @Autowired
    private QueryJcsQuotaByConditionServicr conditionServicr;

    @PostMapping("/api/v1/lord/queryJcsQuotaByCondition")
    private QueryJcsQuotaByCondition_Response queryJcsQuotaByCondition(@RequestBody QueryJcsQuotaByCondition_Request quotaByCondition_resquest){
        String queryresponse = conditionServicr.queryJcsQuotaByConditionServicr("noc", "K4CrovsZ9IyavRrkwK", quotaByCondition_resquest);
        QueryJcsQuotaByCondition_Response queryJcsQuotaByCondition_response = JSON.parseObject(queryresponse, QueryJcsQuotaByCondition_Response.class);
        logger.info("响应参数"+queryJcsQuotaByCondition_response);
        return queryJcsQuotaByCondition_response;
    }
}
