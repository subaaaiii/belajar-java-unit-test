package belajar.java.unit.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

public class MockTest {
    @Test
    void testMock(){
        List<String> list = Mockito.mock(List.class);

        Mockito.when(list.get(0)).thenReturn("Eko");

        Assertions.assertEquals(list.get(0), "Eko");

        Mockito.verify(list, Mockito.times(1)).get(0);
    }


}
