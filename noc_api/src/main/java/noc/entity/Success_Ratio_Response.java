package noc.entity;

import lombok.Data;
import lombok.ToString;

import java.util.List;
@Data
@ToString
public class Success_Ratio_Response {
    private Integer err_code; //错误码
    private String err_desc;  //错误描述
    private List<Success_Ratio_Response_Data> data;
}
