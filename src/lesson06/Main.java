package lesson06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("lesson06/application.xml");
        DataSource dataSource = (DataSource) applicationContext.getBean("data");
        System.out.println(dataSource);

    }
}
