package noc.entity;

import lombok.Data;
import lombok.ToString;

import java.util.List;
@Data
@ToString
public class QueryJcsQuotaByCondition_Response {
    private List<QueryJcsQuotaByCondition_Data_Response> data;
    private List<QueryJcsQuotaByCondition_Status_Response> status;
    private List<QueryJcsQuotaByCondition_Trace_Response> trace;
}
