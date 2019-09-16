package noc.controller;

import com.alibaba.fastjson.JSON;
import noc.entity.Success_Ratio_Response;
import noc.entity.Vm_Status_Response;
import noc.service.Sre_Success_Ratio_Service;
import noc.service.Sre_Vm_Status_Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Sre_Controller {
    private static Logger logger =  LoggerFactory.getLogger(Sre_Controller.class);

    @Autowired
    private Sre_Success_Ratio_Service sreService;

    @Autowired
    private Sre_Vm_Status_Service status_service;

    @GetMapping(value = "/defined/success_ratio")
    public Success_Ratio_Response getSre(@RequestParam("pin") String pin){
        String sre = sreService.getSre(pin);
        logger.info("请求参数："+pin);
        Success_Ratio_Response success_ratio_response = JSON.parseObject(sre, Success_Ratio_Response.class);
        logger.info("响应参数："+success_ratio_response);
        return success_ratio_response;
    }

    @GetMapping(value = "/defined/vm_status")
    public Vm_Status_Response sre_Vm_Status(@RequestParam("pin") String pin){
        String sre_vm_status = status_service.sre_Vm_Status(pin);
        logger.info("请求参数："+sre_vm_status);
        Vm_Status_Response vm_status_response = JSON.parseObject(sre_vm_status, Vm_Status_Response.class);
        logger.info("请求参数："+vm_status_response);
        return vm_status_response;
    }

}
