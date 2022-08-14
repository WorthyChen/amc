package org.chaniiuhoo.amc.component.table;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @author Worthy
 * @version 1.0.0
 * @class AccessControlList
 * @description <TODO description class purpose>
 * @create 2022/8/14 19:32
 */
@Data
public class AccessControlList{

    @TableId
    private int id;

    private String object;

    private String relation;

    private String user;

    private Timestamp createTime;

    private Timestamp updateTime;
}
