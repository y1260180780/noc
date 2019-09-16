package noc.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AlarmsHistoryQuery_Trace_Response {
    private String dst;
    private String id;
    private String src;
    private Long timestamp;
}
