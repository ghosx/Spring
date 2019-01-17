package lesson09;

import lesson09.controller.UserController;
import lesson09.repository.UserRepository;
import lesson09.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("lesson09/applicationContext.xml");
        TestObject testObject = (TestObject) applicationContext.getBean("testObject");
        System.out.println(testObject);

        UserController userController = (UserController) applicationContext.getBean("userController");
        System.out.println(userController);

        UserRepository userRepository = (UserRepository) applicationContext.getBean("UserRepository");
        System.out.println(userRepository);

        UserService userService = (UserService) applicationContext.getBean("userService");
        System.out.println(userService);

    }

}
