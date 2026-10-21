package belajar.java.unit.test;

import belajar.java.unit.test.resolver.RandomParameterResolver;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

@Extensions(
        {
                @ExtendWith(RandomParameterResolver.class)
        })
public class AbstractCalculatorTest {
    protected Calculator calculator = new Calculator();

}
