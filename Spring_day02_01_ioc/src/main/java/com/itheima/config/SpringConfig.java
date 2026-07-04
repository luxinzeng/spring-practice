package com.itheima.config;//最后面全面取代XML方式的注解开发的最后一步

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration//XML上方的一堆配置
@ComponentScan("com.itheima")//<context:component-scan>
@Import(JDBCConfig.class)//该注解取代了JDBCConfig中的@Component
public class SpringConfig {

}
