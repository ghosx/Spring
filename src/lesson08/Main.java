package lesson08;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("lesson08/application.xml");
        Person person = (Person) classPathXmlApplicationContext.getBean("person");
        System.out.println(person);
        classPathXmlApplicationContext.close();
    }
}
