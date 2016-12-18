package com.hut.crazyacking.config;

/**
 * Created by crazyacking on 2016/12/17.
 */

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import java.sql.SQLException;

@Configuration
public class DataBaseConfig {

    private static Logger logger = Logger.getLogger(DataBaseConfig.class);

    @Value("${spring.datasource.driverClassName}")
    String driverClassName;
    @Value("${spring.datasource.url}")
    String url;
    @Value("${spring.datasource.username}")
    String username;
    @Value("${spring.datasource.password}")
    String password;

    @Bean
    public DruidDataSource dataSource(){
        driverClassName = "com.mysql.jdbc.Driver";
        url = "jdbc:mysql://119.29.159.210:3306/test?useUnicode=true&characterEncoding=utf-8";
        username = "root";
        password = "";

        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);

        druidDataSource.setInitialSize(24);
        druidDataSource.setMinIdle(24);
        druidDataSource.setMaxActive(1024);
        druidDataSource.setMaxIdle(1024);
        druidDataSource.setMaxWait(60000);
        druidDataSource.setTimeBetweenEvictionRunsMillis(60000);
        druidDataSource.setMinEvictableIdleTimeMillis(30000);
        druidDataSource.setValidationQuery("select 1");
        druidDataSource.setTestWhileIdle(true);
        druidDataSource.setTestOnBorrow(false);
        druidDataSource.setTestOnReturn(false);
        druidDataSource.setPoolPreparedStatements(true);
        druidDataSource.setMaxPoolPreparedStatementPerConnectionSize(20);

        try {
            druidDataSource.setFilters("wall,stat");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return druidDataSource;
    }

    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager(){
        DataSourceTransactionManager dataSourceTransactionManager  = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource());
        return dataSourceTransactionManager;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        sqlSessionFactoryBean.setTypeAliasesPackage("com.hut.crazyacking.model");
        final Resource configLocation = new ClassPathResource("mybatis-config.xml");
        sqlSessionFactoryBean.setConfigLocation(configLocation);
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() throws Exception{
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.hello.mapper");
        mapperScannerConfigurer.setSqlSessionFactory(sqlSessionFactory());
        return mapperScannerConfigurer;
    }

    /*@Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate();
    }*/
}