package noc.entity;

import java.io.Serializable;
import java.util.Arrays;

public class QueryHost implements Serializable {
    private Integer[] ids;  //机器id  不必须
    private String tenantName;  //租户英文名，ark默认为jcloud  必须
    private String corpName;   //体系英文名  不必须
    private String depName;     //部门英文名   不必须
    private String pdlName;     //产品线英文名   不必须
    private String ip;      //不必须
    private String[] ips;   //不必须
    private String sn;      //不必须
    private String[] sns;   //不必须
    private String type;    //类型类型：PHYSICAL/VM/ARKJCS CAP containe
    private String name;    //节点英文名   不必须
    private Integer pageIndex;     //表示第几页     不必须
    private Integer pageSize;       //表示每页返回多少条数据，默认10，最大1000   不必须

    public Integer[] getIds() {
        return ids;
    }

    public void setIds(Integer[] ids) {
        this.ids = ids;
    }

    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getPdlName() {
        return pdlName;
    }

    public void setPdlName(String pdlName) {
        this.pdlName = pdlName;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String[] getIps() {
        return ips;
    }

    public void setIps(String[] ips) {
        this.ips = ips;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String[] getSns() {
        return sns;
    }

    public void setSns(String[] sns) {
        this.sns = sns;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "queryHost{" +
                "ids=" + Arrays.toString(ids) +
                ", tenantName='" + tenantName + '\'' +
                ", corpName='" + corpName + '\'' +
                ", depName='" + depName + '\'' +
                ", pdlName='" + pdlName + '\'' +
                ", ip='" + ip + '\'' +
                ", ips=" + Arrays.toString(ips) +
                ", sn='" + sn + '\'' +
                ", sns=" + Arrays.toString(sns) +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", pageIndex=" + pageIndex +
                ", pageSize=" + pageSize +
                '}';
    }

    public QueryHost() {
    }

    public QueryHost(Integer[] ids, String tenantName, String corpName, String depName, String pdlName, String ip, String[] ips, String sn, String[] sns, String type, String name, Integer pageIndex, Integer pageSize) {
        this.ids = ids;
        this.tenantName = tenantName;
        this.corpName = corpName;
        this.depName = depName;
        this.pdlName = pdlName;
        this.ip = ip;
        this.ips = ips;
        this.sn = sn;
        this.sns = sns;
        this.type = type;
        this.name = name;
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
    }
}
