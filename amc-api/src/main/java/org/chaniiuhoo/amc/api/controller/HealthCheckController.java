package org.chaniiuhoo.amc.api.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/health")
public class HealthCheckController {

    @GetMapping("/check")
    @ApiOperation("健康检查")
    public Object healthCheck() {
        System.out.println("ok!");
        return "health check success!";
    }
}
