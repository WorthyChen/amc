package org.chaniiuhoo.amc.component.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;


/**
 * @author Worthy
 * @version 1.0.0
 * @class AccessControlList
 * @description <TODO description class purpose>
 * @create 2022/8/71:44
 */


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccessControlListEntity {

    private int id;

    private String object;

    private String relation;

    private String user;

    private Timestamp createTime;

    private Timestamp updateTime;
}
