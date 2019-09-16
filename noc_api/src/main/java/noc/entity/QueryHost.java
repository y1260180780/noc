package noc.entity;

import javafx.beans.DefaultProperty;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Arrays;
@Data
@ToString
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

}
