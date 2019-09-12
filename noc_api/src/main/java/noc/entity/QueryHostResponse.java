package noc.entity;

import java.io.Serializable;

public class QueryHostResponse implements Serializable {
    private String appName;
    private String az;
    private String corpName;
    private Long createTime;
    private String createUser;
    private String dataCenter;
    private String depName;
    private Integer diskGb;
    private Integer id;
    private String idc;
    private String ip;
    private String name;
    private String os;
    private String pdlName;
    private String region;
    private String regionName;
    private String source;
    private String status;
    private String subnet;
    private String sysName;
    private String tenantName;
    private String type;
    private Long updateTime;
    private String updateUser;
    private String uuid;
    private String vpc;
    private String vpcName;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAz() {
        return az;
    }

    public void setAz(String az) {
        this.az = az;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getDataCenter() {
        return dataCenter;
    }

    public void setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Integer getDiskGb() {
        return diskGb;
    }

    public void setDiskGb(Integer diskGb) {
        this.diskGb = diskGb;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdc() {
        return idc;
    }

    public void setIdc(String idc) {
        this.idc = idc;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getPdlName() {
        return pdlName;
    }

    public void setPdlName(String pdlName) {
        this.pdlName = pdlName;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubnet() {
        return subnet;
    }

    public void setSubnet(String subnet) {
        this.subnet = subnet;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getVpc() {
        return vpc;
    }

    public void setVpc(String vpc) {
        this.vpc = vpc;
    }

    public String getVpcName() {
        return vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public QueryHostResponse(String appName, String az, String corpName, Long createTime, String createUser, String dataCenter, String depName, Integer diskGb, Integer id, String idc, String ip, String name, String os, String pdlName, String region, String regionName, String source, String status, String subnet, String sysName, String tenantName, String type, Long updateTime, String updateUser, String uuid, String vpc, String vpcName) {
        this.appName = appName;
        this.az = az;
        this.corpName = corpName;
        this.createTime = createTime;
        this.createUser = createUser;
        this.dataCenter = dataCenter;
        this.depName = depName;
        this.diskGb = diskGb;
        this.id = id;
        this.idc = idc;
        this.ip = ip;
        this.name = name;
        this.os = os;
        this.pdlName = pdlName;
        this.region = region;
        this.regionName = regionName;
        this.source = source;
        this.status = status;
        this.subnet = subnet;
        this.sysName = sysName;
        this.tenantName = tenantName;
        this.type = type;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
        this.uuid = uuid;
        this.vpc = vpc;
        this.vpcName = vpcName;
    }

    public QueryHostResponse() {
    }

    @Override
    public String toString() {
        return "queryHostResponse{" +
                "appName='" + appName + '\'' +
                ", az='" + az + '\'' +
                ", corpName='" + corpName + '\'' +
                ", createTime=" + createTime +
                ", createUser='" + createUser + '\'' +
                ", dataCenter='" + dataCenter + '\'' +
                ", depName='" + depName + '\'' +
                ", diskGb=" + diskGb +
                ", id=" + id +
                ", idc='" + idc + '\'' +
                ", ip='" + ip + '\'' +
                ", name='" + name + '\'' +
                ", os='" + os + '\'' +
                ", pdlName='" + pdlName + '\'' +
                ", region='" + region + '\'' +
                ", regionName='" + regionName + '\'' +
                ", source='" + source + '\'' +
                ", status='" + status + '\'' +
                ", subnet='" + subnet + '\'' +
                ", sysName='" + sysName + '\'' +
                ", tenantName='" + tenantName + '\'' +
                ", type='" + type + '\'' +
                ", updateTime=" + updateTime +
                ", updateUser='" + updateUser + '\'' +
                ", uuid='" + uuid + '\'' +
                ", vpc='" + vpc + '\'' +
                ", vpcName='" + vpcName + '\'' +
                '}';
    }
}
