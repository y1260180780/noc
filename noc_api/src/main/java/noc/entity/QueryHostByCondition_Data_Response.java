package noc.entity;

import lombok.Data;
import lombok.ToString;

import java.util.List;
@Data
@ToString
public class QueryHostByCondition_Data_Response {
    private Integer currentCount; //当前机器数量
    private List<QueryHostByCondition_DataList_Response> datalist;
    private Integer totalCount;//机器总数
    private Integer totalPage;//总页数
}
