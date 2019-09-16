package noc.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
@Data
@ToString
public class QueryHostByCondition_DataList_Response {
    private String appName;//部署的应用
    private String assets; //固定资产号
    private String az;//云主机可用区
    private String brand;//品牌
    private String businessNode;
    private String cabinet;//机柜
    private String circulationStatus;//流转状态(0:"未知" 1:"采购" 2:"交付" 3:"闲置" 4:"使用" 5:"调拨" 6:"报修" 7:"报废" 8:"其它")
    private String corpName;//体系名
    private Integer cpuCore;//cpu核，单位GB
    private Long createTime;
    private String createUser;
    private String dataCenter;//机房中文名，监控使用
    private String depName;//部门名
    private Integer diskGb;//硬盘，单位GB
    private Long expiredTime;//过期时间
    private Integer id;
    private String idcShortName;//物理机所属机房，与 idc.jd.com 中一致
    private String idc;//机房英文名，监控使用
    private String ip;
    private String model;//模型
    private String manageIp;//管理IP
    private Integer memoryGb;//内存，单位GB
    private String name;
    private String os;//操作系统
    private String operator;//运营商
    private String public_ip;//公网ip
    private String pdlName;//产品线名
    private String physical_ip;//云主机所属物理机ip
    private String region;
    private String regionName;
    private String rackUIndex;//U位
    private String source;//来源
    private String status;//状态
    private String storageMedia;//存储类型
    private String sn;
    private String subnet;
    private String sysName;//所属系统 sysName = backup-pool-pdlName 表示该系统是备机池
    private String tenantName;//租户名
    private String type;
    private Long updateTime;
    private String updateUser;
    private String usageType;//用途类型 (1:未知 1:公有云 2:私有云 ...)
    private String uuid;//云主机实例ID
    private String vpc;
    private String vpcName;
}
