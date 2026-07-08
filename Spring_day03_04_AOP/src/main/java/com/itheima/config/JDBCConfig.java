package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
@Configuration
public class JDBCConfig {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String userName;
    @Value("${jdbc.password}")
    private String password;

//    @PostConstruct  // ← 添加这个方法
//    public void init() {
//        System.out.println("========== JDBCConfig 被加载了 ==========");
//        System.out.println("driver: " + driver);
//        System.out.println("url: " + url);
//        System.out.println("username: " + userName);
//        System.out.println("password: " + password);
//        System.out.println("==========================================");
//    }

    @Bean("dataSource")
    public DataSource getDataSource(){
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(password);
        return ds;
    }
}
