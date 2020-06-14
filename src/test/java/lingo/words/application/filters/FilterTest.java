package lingo.words.application.filters;

import lingo.words.domain.model.IFilter;
import lingo.words.application.filters.WordFilter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FilterTest {
    public FilterTest() {
    }

    @Test
    @DisplayName("Filter word length Test")
    public void filterWordLengthTest() {
        IFilter filter = new WordFilter();
        Assertions.assertEquals(true, filter.filter("banaan"));
        Assertions.assertEquals(false, filter.filter("banaanen"));
        Assertions.assertEquals(true, filter.filter("peren"));
        Assertions.assertEquals(false, filter.filter("bana"));
        Assertions.assertEquals(false, filter.filter("banan%"));
        Assertions.assertEquals(false, filter.filter("Banaan"));
    }
}