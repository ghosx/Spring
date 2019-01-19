package lesson10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("lesson10/application.xml");
        ArithemticCalculator arithemticCalculator = (ArithemticCalculator) applicationContext.getBean("arithemticCalculatorImpl");
        System.out.println(arithemticCalculator.add(1, 2));
    }
}
