package kr.co.ch02.config;

import kr.co.ch02.sub1.Hello;
import kr.co.ch02.sub1.Welcome;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"kr.co.ch02"})
public class AppConfig{

    @Bean
    public Hello hello(){
        return new Hello();
    }

    @Bean(name = "wc")
    public Welcome welcome(){
        return new Welcome();
    }

}
