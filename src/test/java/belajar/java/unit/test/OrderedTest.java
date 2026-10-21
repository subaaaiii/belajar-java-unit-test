package belajar.java.unit.test;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OrderedTest {
    private int count = 0;
    @Test
    @Order(1)
    void test3(){
        count++;
        System.out.println(count);
    }

    @Test
    @Order(3)
    void test2(){
        count++;
        System.out.println(count);
    }

    @Test
    @Order(2)
    void test1(){
        count++;
        System.out.println(count);
    }

}
