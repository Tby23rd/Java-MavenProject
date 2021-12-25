import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookImplementationTest {

    @Test
    void retrieve() {

        BookStub testStub = new BookStub();
        BookImplementation testImplementation = new BookImplementation(testStub);
        List<String> f1 = testImplementation.Retrieve();

        assertEquals(2,f1.size());
    }
}