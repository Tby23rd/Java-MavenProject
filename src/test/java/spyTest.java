import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)

public class spyTest {


    @Test
    public void spyTesting(){
        List<String> listSpy = spy(ArrayList.class);
        listSpy.add("Rosa");
        listSpy.add("Jonah");

        verify(listSpy).add("Rosa");
        verify(listSpy).add("Jonah");

        assertEquals(2,listSpy.size());
        assertEquals("Rosa", listSpy.get(0));
    }
}
