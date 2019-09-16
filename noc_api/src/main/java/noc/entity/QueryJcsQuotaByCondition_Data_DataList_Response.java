package noc.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class QueryJcsQuotaByCondition_Data_DataList_Response {
    private Integer cpuCore;
    private Integer cpuCoreAvailable;
    private Integer cpuCoreQuota;
    private String description;
    private Integer diskGb;
    private Integer id;
    private Integer memoryGb;
    private String nodeName;
    private String nodeNameCn;
    private String nodeType;
    private String parentNodeName;
    private String parentNodeType;
    private String region;
    private String tenantName;
}
