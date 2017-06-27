package mymockito;

import java.util.List;

import static org.mockito.Mockito.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
   public static void main(String[] args){
       //mock creation
       List mockedList = mock(List.class);

       //using mock object
       mockedList.add("one");
       mockedList.clear();

       mockedList.
       //verification
       verify(mockedList).add("two");
       verify(mockedList).clear();
   }
}
