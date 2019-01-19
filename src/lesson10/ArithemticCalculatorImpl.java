package lesson10;

import org.springframework.stereotype.Component;

@Component
public class ArithemticCalculatorImpl implements ArithemticCalculator {
    @Override
    public int add(int i, int j) {
        int result = i + j;
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        return result;
    }
}
