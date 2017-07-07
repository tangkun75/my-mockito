package mymockito;

import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
    public void fun1() {
        System.out.printf("fun1");
    }


    @Test
    public void test1() {
        AppTest mock = mock(AppTest.class);
        doNothing().doThrow(new Exception()).when(mock).fun1();
        try {
            fun1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            fun1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}