package org.chaniiuhoo.amc.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.chaniiuhoo.amc.common.utils.DemoUtil;
@SpringBootApplication
@ComponentScan("org.chaniiuhoo")
public class Application {
    public static void main( String[] args) {
        DemoUtil.filter("chen yuhao");

        SpringApplication.run(Application.class, args);

    }
}
