package noc.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class QueryJcsQuotaByCondition_Request {
    private String tenantName;	//租户名，默认jcloud
    private String parentNodeName;//父节点名，如体系：product
    private String parentNodeType;//父节点类型，如体系：corp
    private String region;//地域, 如 cn-north-1
    private Integer pageIndex;//页码，默认1
    private Integer pageSize;//每页数据，默认10，最大1000
}
