package lingo.words;

import lingo.words.application.factories.WordFactory;
import lingo.words.domain.model.Word;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class FactoryTest {

    public FactoryTest() {
    }

    @Test
    @DisplayName("WordFactory List Creation Test")
    public void WordFactoryTest() {
        ArrayList<Word> wWords = WordFactory.CreateWordList(GetWordString());
        Assertions.assertEquals(3, wWords.size());
    }

    public ArrayList<String> GetWordString() {
        ArrayList<String> sWords = new ArrayList<String>();
        sWords.add("banaan");
        sWords.add("appel");
        sWords.add("._peer");
        sWords.add("peren");
        sWords.add("peren$");
        sWords.add("Bananen");

        return sWords;
    }

}