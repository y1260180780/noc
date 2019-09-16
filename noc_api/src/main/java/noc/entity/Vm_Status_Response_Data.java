package noc.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Vm_Status_Response_Data {
    private String pin;  //用户pin
    private Integer status;     //用户vm总体状态
    private String create_time;   //创建时间
}
