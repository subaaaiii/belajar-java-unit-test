package belajar.java.unit.test;

import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.Queue;

@DisplayName("A Queue")
public class QueueTest {

    private Queue<String> queue;

    @Nested
    @DisplayName("When New")
    public class whenNew{
        @BeforeEach
        void setUp(){
            queue = new LinkedList<>();
        }

        @Test
        @DisplayName("When offer 1, size must be 1")
        void offerOne(){
            queue.offer("Eko");
            Assertions.assertEquals(1, queue.size());
        }
        @Test
        @DisplayName("When offer 2, size must be 2")
        void offerTwo(){
            queue.offer("Eko");
            queue.offer("Eka");
            Assertions.assertEquals(2, queue.size());
        }
    }
}
