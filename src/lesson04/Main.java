package lesson04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("lesson04/applicationContext.xml");
        Address address = (Address) applicationContext.getBean("address");
        System.out.println(address);
        Address address1 = (Address) applicationContext.getBean("address1");
        System.out.println(address1);
    }
}
