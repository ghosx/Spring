package lesson07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("lesson07/application.xml");
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car);

    }
}
