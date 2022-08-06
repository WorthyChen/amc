package org.chaniiuhoo.amc.api.config.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;


@Configuration
@MapperScan(basePackages = {"org.chaniiuhoo.amc.common.mapper.amc"},
        sqlSessionTemplateRef = "amcSqlSessionTemplate")
public class AMCDataSourceConfig {
    @Autowired
    @Qualifier("amc")
    private DataSource amc;

    @Bean(name = "amcSqlSessionFactory")
    @Primary
    public SqlSessionFactory amcSqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(amc);
        //配置驼峰映射
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setMapUnderscoreToCamelCase(true);
        factoryBean.setConfiguration(configuration);

        return factoryBean.getObject();
    }

    

    @Bean(name = "amcTransactionManager")
    @Primary
    public DataSourceTransactionManager amcTransactionManager() {
        return new DataSourceTransactionManager(amc);
    }


    /**
     * @author Worthy
     * @description <TODO description method purpose>
     * @param sqlSessionFactory
     * @return SqlSessionTemplate
     * @create 2022/8/7 1:22
     */
    @Bean(name = "amcSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate amcSqlSessionTemplate(
            @Qualifier("amcSqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory); // 使用上面配置的Factory
    }
}
