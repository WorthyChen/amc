package org.chaniiuhoo.amc.api.config.datasource;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {
    @Bean(name = "amc")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.amc")
    public DataSource dataSourceAMC() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "ds2")
    @ConfigurationProperties(prefix = "spring.datasource.test2")
    public DataSource dataSource2() {
        return DataSourceBuilder.create().build();
    }
}
