package lesson02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("lesson02/application.xml");
        Car car = (Car)applicationContext.getBean("car");
        System.out.print(car);
//        Person person = applicationContext.getBean(Person.class);
        Person person = (Person)applicationContext.getBean("person");
        System.out.println(person);
    }
}
