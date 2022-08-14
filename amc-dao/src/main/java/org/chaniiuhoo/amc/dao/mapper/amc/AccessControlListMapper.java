package org.chaniiuhoo.amc.dao.mapper.amc;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.chaniiuhoo.amc.component.entity.AccessControlListEntity;
import org.chaniiuhoo.amc.component.table.AccessControlList;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Worthy
 * @version 1.0.0
 * @title AccessControlListMapper
 * @description <TODO description interface purpose>
 * @create 2022/8/7 0:08
 */
@Repository
@Mapper
public interface AccessControlListMapper extends BaseMapper<AccessControlList> {
    @Select(value = "select * from access_control_list")
    List<AccessControlListEntity> selectAll();

}
