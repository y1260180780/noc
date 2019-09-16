package noc.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class QueryJcsQuotaByCondition_Trace_Response {
    private String destIp;
    private String id;
    private String srcIp;
    private Long timestamp;
}
