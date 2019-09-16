package noc.entity;

import lombok.Data;
import lombok.ToString;

import java.util.List;
@Data
@ToString
public class QueryJcsQuotaByCondition_Data_Response {
    private Integer currentCount;
    private List<QueryJcsQuotaByCondition_Data_DataList_Response> dataList;
    private Integer totalCount;
    private Integer totalPage;
}
