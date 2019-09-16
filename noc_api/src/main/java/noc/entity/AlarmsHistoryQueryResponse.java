package noc.entity;

import lombok.Data;
import lombok.ToString;

import java.util.List;
@Data
@ToString
public class AlarmsHistoryQueryResponse {
    private List data;
    private Integer size;
    private List status;
    private List<AlarmsHistoryQuery_Trace_Response> trace;
}
