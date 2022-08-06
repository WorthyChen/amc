package org.chaniiuhoo.amc.common.mapper.amc;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.chaniiuhoo.amc.common.component.entity.AccessControlList;

import java.util.List;

/**
 * @author Worthy
 * @version 1.0.0
 * @title AccessControlListMapper
 * @description <TODO description interface purpose>
 * @create 2022/8/7 0:08
 */
@Mapper
public interface AccessControlListMapper {
    @Select(value = "select * from access_control_list")
    List<AccessControlList> selectAll();
}
