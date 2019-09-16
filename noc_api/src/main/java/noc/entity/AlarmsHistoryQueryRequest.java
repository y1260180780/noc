package noc.entity;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class AlarmsHistoryQueryRequest {
    private Long end;
    private Long start;
    private Long uptStart;// 支持按更新时间查询报警历史
    private Long uptEnd;
    private List<String> prods; // 产品线列表
    private String eventType;// HawkeyeAlarm（报警历史概要）,HawkeyeAlarmSnapshot（报警历史详情）
    private Integer pageSize;
    private Integer pageNumber;
}
