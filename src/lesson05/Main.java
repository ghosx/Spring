package lesson05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("lesson05/applicationContext.xml");
        Car car = (Car) applicationContext.getBean("car");
        Car car1 = (Car) applicationContext.getBean("car");
        System.out.println(car == car1);
    }
}
