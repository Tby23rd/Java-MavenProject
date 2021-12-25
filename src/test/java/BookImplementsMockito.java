import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class BookImplementsMockito {

    @Captor
    ArgumentCaptor <String> ss;

    //pretend the bookstub does not exist
    @Mock
    BookService bookMockTest;

    @InjectMocks
    BookImplementation implementationmockInject;

    //create test
    @Test
    public void retrieveTest(){
        List<String> bks =
                //case sensitive
        Arrays.asList("PHP","Java for Dummies","Java for Experts", "HTML");
        Mockito.when(bookMockTest.retrieveBooks()).thenReturn(bks);
        //create a new list
        List<String> ff = implementationmockInject.Retrieve();

        assertEquals(2,ff.size());
    }
    @Test
    public void retrieveEmpty(){

        List<String> bks = Arrays.asList();
        Mockito.when(bookMockTest.retrieveBooks()).thenReturn(bks);
        List<String> ff = implementationmockInject.Retrieve();

        assertEquals(0,ff.size());

    }
@Test
    public void deleteTest(){
    List<String> bks =
            //case sensitive
            Arrays.asList("PHP","Java for Dummies","Java for Experts", "HTML");
    Mockito.when(bookMockTest.retrieveBooks()).thenReturn(bks);
    implementationmockInject.delete();
    Mockito.verify(bookMockTest).deleteBooks("PHP");
    Mockito.verify(bookMockTest,Mockito.times(1)).deleteBooks("PHP");
    Mockito.verify(bookMockTest,Mockito.never()).deleteBooks("Java for Dummies");


}

    @Test
    public void captorTest(){
    List<String> bks = Arrays.asList("PHP","Java for Dummies","Java for Experts", "HTML");
    Mockito.when(bookMockTest.retrieveBooks()).thenReturn(bks);
    implementationmockInject.delete();
    Mockito.verify(bookMockTest).deleteBooks("PHP");
    Mockito.verify(bookMockTest,Mockito.times(2)).deleteBooks(ss.capture());
    assertEquals("HTML",ss.getValue());
    }
}
