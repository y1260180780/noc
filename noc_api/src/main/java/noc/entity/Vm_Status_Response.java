package noc.entity;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Vm_Status_Response {
    private Integer err_code; //错误码
    private String err_desc;  //错误描述
    private List<Vm_Status_Response_Data> data; //返回数据
}
