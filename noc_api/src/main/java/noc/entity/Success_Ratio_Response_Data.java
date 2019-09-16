package noc.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Success_Ratio_Response_Data {
    private String pin;
    private String domain;
    private float percent;
    private String create_time;

}
