package com.example.spring.framework.di;

        import org.springframework.context.annotation.ComponentScan;
        import org.springframework.context.annotation.Configuration;

/**
 * 使用@Configuration声明当前类是一个配置类
 * 使用@ComponentScan，自动扫描包名下所有使用@Service 、@Component 、@Repository
 * 和@Controller 的类，并注册为Bean
 *
 * Author: 王俊超
 * Date: 2017-07-10 08:01
 * All Rights Reserved !!!
 */
@Configuration
@ComponentScan("com.example.spring.framework.di")
public class DiConfig {

}
