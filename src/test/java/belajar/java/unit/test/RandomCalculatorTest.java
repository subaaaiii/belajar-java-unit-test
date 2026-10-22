package belajar.java.unit.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;


import java.util.List;
import java.util.Random;


public class RandomCalculatorTest extends AbstractCalculatorTest {

    @Test
        void testRandom(Random random){
            var a = random.nextInt();
            var b = random.nextInt();
            var result = calculator.add(a,b);
            var expect = a+b;
            Assertions.assertEquals(expect, result);
    }
    @DisplayName("Test random repeat")
    @RepeatedTest(
            value = 10,
            name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
    )
    void testRandomRepeat(Random random){
        var a = random.nextInt();
        var b = random.nextInt();
        var result = calculator.add(a,b);
        var expect = a+b;
        Assertions.assertEquals(expect, result);
    }

    @DisplayName("Test random repeat with info")
    @RepeatedTest(
            value = 10,
            name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"

    )
    void testRandomRepeatWithInfo(Random random, RepetitionInfo repetitionInfo, TestInfo info){
        System.out.println(info.getDisplayName()+" ke "+repetitionInfo.getCurrentRepetition()+" dari "+repetitionInfo.getTotalRepetitions());
        var a = random.nextInt();
        var b = random.nextInt();
        var result = calculator.add(a,b);
        var expect = a+b;
        Assertions.assertEquals(expect, result);
    }

    @DisplayName("Test Calculator")
    @ParameterizedTest(name = "{displayName} dengan parameter {0}")
    @ValueSource(ints = {1,2,3,45,67,8})
    void testWithParameter(int value){
        var expected = value + value;
        var result = calculator.add(value, value);
        Assertions.assertEquals(expected, result);
    }

    public static List<Integer> parameterSource (){
        return List.of(1,2,34,56,78);
    }
    @DisplayName("Test Calculator")
    @ParameterizedTest(name = "{displayName} dengan parameter {0}")
    @MethodSource("parameterSource")
    void testWithMethodSource(int value){
        var expected = value + value;
        var result = calculator.add(value, value);
        Assertions.assertEquals(expected, result);
    }




}
