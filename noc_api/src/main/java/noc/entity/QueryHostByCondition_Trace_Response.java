package noc.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class QueryHostByCondition_Trace_Response {
    private String destIp;
    private String id;
    private String srcIp;
    private Long timestamp;
}
