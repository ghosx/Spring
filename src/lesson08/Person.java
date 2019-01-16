package lesson08;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Person {

    private String name;

    public Person() {
        System.out.println("constructor ...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setName ...");
        this.name = name;
    }

    public void init() {
        System.out.println("init...");
    }

    public void destory() {
        System.out.println("destroy...");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
