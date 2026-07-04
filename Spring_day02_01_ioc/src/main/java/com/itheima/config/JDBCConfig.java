package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//config:Config 类（通常叫 配置类）在Spring中就是专门用来管理第三方Bean的
//专门用于第三方配置，在bean中无法写入property
//@Component//四
public class JDBCConfig {
    @Bean("dataSource")//通过注解的方式，引入第三方的依赖
    public DruidDataSource getDataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/learn_demo1");
        ds.setUsername("root");
        ds.setPassword("root");
        return ds;
    }
}
