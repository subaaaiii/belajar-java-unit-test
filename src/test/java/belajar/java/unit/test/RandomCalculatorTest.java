package belajar.java.unit.test;

import org.junit.jupiter.api.*;


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
}
