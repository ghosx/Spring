package lesson10;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    //    @Before("execution(public int lesson10.ArithemticCalculatorImpl.add(int,int))")
//    这里没有导入aspjectj相关包,没法运行
    public void beforeMethod() {
        System.out.println("before method");
    }
}
