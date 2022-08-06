package org.chaniiuhoo.amc.api;

import lombok.extern.slf4j.Slf4j;
import org.chaniiuhoo.amc.common.mapper.amc.AccessControlListMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

import java.sql.Timestamp;
import java.util.stream.Collectors;

/**
 * @author Worthy
 * @version 1.0.0
 * @class Test
 * @description <TODO description class purpose>
 * @create 2022/8/71:47
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
@Profile("local")
@Slf4j
public class Test {


    @Autowired
    private AccessControlListMapper accessControlListMapper;


    @org.junit.Test
    public void testMybatis() {
        //System.out.println(accessControlListMapper.selectAll().stream().map(accessControlList -> accessControlList.getCreatTime()).collect(Collectors.toList()));
        System.out.println(accessControlListMapper.selectAll());

    }
}
