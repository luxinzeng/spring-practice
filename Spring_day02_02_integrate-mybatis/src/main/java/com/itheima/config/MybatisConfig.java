package com.itheima.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

public class MybatisConfig {
//    <!--spring整合mybatis后控制的创建连接用的对象-->
//    <bean class="org.mybatis.spring.SqlSessionFactoryBean">
//        <property name="dataSource" ref="dataSource"/>
//        <property name="typeAliasesPackage" value="com.itheima.domain"/>
//    </bean>
//
//    <!--加载mybatis映射配置的扫描，将其作为spring的bean进行管理-->
//    <bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
//        <property name="basePackage" value="com.itheima.dao"/>
//    </bean>
    @Bean
    public SqlSessionFactoryBean getSqlSessionFactoryBean(@Autowired DataSource dataSource){
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        ssfb.setTypeAliasesPackage("com.itheima.domain");
        ssfb.setDataSource(dataSource);
        return ssfb;
    }

    @Bean
    public MapperScannerConfigurer getMapperScannerConfigurer(){
        System.out.println("===== MapperScannerConfigurer 执行了 =====");
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.itheima.dao");
        return msc;
    }
}
