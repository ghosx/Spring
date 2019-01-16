package lesson01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("lesson01/applicationContext.xml");
        //通过id获取bead
        //HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("hello");
        //通过class类型获取bean，不用强制转换  如果xml中有相同类型的多个Bean 就会报错
        HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);
        helloWorld.hello();
    }
}
