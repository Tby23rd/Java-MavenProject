import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

public class hamCrestTest {

    //have to add it as a dependency in the xml

    @Test
            public void scoreTest(){
        List<Integer> scores = Arrays.asList(99,100,101,105);
        assertThat(scores, hasSize(4));
        assertThat(scores, hasItems(100,101));
        assertThat(scores,everyItem(greaterThan(90)));
        assertThat(scores,everyItem(greaterThan(200)));
    }

}
