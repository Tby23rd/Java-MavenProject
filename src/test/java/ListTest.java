import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.Assert.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ListTest {

    @Mock
    List  listTest;
    @Test
    public void listSizeTest(){
        Mockito.when(listTest.size()).thenReturn(2);
        assertEquals(2,listTest.size());
    }
    @Test
    public void listSizeGet(){
        Mockito.when(listTest.get(0)).thenReturn("Hey");
        assertEquals("Hey",listTest.get(0));
    }
}
