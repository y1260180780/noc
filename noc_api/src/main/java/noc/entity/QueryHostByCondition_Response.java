package noc.entity;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class QueryHostByCondition_Response {
    private List<QueryHostByCondition_Data_Response> data;
    private List<QueryHostByCondition_Status_Response> status;
    private List<QueryHostByCondition_Trace_Response> trace;
}
