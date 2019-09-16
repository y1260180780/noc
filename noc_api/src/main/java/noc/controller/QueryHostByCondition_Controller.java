package noc.controller;

import com.alibaba.fastjson.JSON;
import noc.entity.QueryHost;
import noc.entity.QueryHostByCondition_Response;
import noc.service.QueryHostByConditionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class QueryHostByCondition_Controller {
    private static Logger logger =  LoggerFactory.getLogger(Sre_Controller.class);

    @Autowired
    private QueryHostByConditionService conditionService;

    @PostMapping("/api/v1/lord/queryHostByCondition")
    public QueryHostByCondition_Response queryHostByCondition(@RequestBody QueryHost queryHost){
        logger.info("请求参数"+queryHost);
        String json = conditionService.queryHostByCondition("noc","K4CrovsZ9IyavRrkwK",queryHost);
        QueryHostByCondition_Response queryHostByCondition_response = JSON.parseObject(json, QueryHostByCondition_Response.class);
        logger.info("相应参数"+queryHostByCondition_response);
        return queryHostByCondition_response;
    }


}
