package lingo.words;

import lingo.words.application.filters.IFilter;
import lingo.words.application.filters.WordFilter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FilterTest {
    public FilterTest() {
    }

    @Test
    @DisplayName("Filter Set Test")
    public void FilterLengthTest() {
        IFilter filter = new WordFilter();
        Assertions.assertEquals(true, filter.Filter("banaan"));
        Assertions.assertEquals(false, filter.Filter("banaanen"));
        Assertions.assertEquals(true, filter.Filter("peren"));
        Assertions.assertEquals(false, filter.Filter("bana"));
        Assertions.assertEquals(false, filter.Filter("banan%"));
        Assertions.assertEquals(false, filter.Filter("Banaan"));
    }
}