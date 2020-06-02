package lingo.words;

import lingo.words.application.factories.WordFactory;
import lingo.words.domain.model.Word;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class factoryTest {
    private final WordsApplicationTests wordsApplicationTests;

    public factoryTest(WordsApplicationTests wordsApplicationTests) {
        this.wordsApplicationTests = wordsApplicationTests;
    }

    @Test
    @DisplayName("WordFactory List Creation Test")
    public void WordFactoryTest() {
        ArrayList<Word> wWords = WordFactory.CreateWordList(wordsApplicationTests.GetWordString());
        Assertions.assertEquals(3, wWords.size());
    }
}