package kr.co.ch02;

import kr.co.ch02.config.AppConfig;
import kr.co.ch02.sub1.Hello;
import kr.co.ch02.sub1.Welcome;
import kr.co.ch02.sub2.Computer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    날짜 : 2025/09/15
    이름 : 한탁원
    내용 : Spring IoC/DI 실습하기
 */
public class App {
    public static void main(String[] args) {

        // 기존 객체 생성 방식
        Hello hello = new Hello();
        Welcome welcome = new Welcome();

        hello.show();
        welcome.show();

        // Ioc(제어의 역전)

        // 스프링 컨테이너 생성
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // 객체 가져오기
        Hello helloBean = context.getBean(Hello.class);
        Welcome welcomeBean = (Welcome) context.getBean("wc");
        helloBean.show();
        welcomeBean.show();

        Computer com = (Computer) context.getBean("computer");
        com.show();
    }
}
