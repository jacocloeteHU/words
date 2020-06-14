package lingo.words.application.factories;

import lingo.words.domain.model.Word;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FactoryTest {
    @Autowired
    WordFactory wordFactory;
    public FactoryTest() {
    }

    @Test
    @DisplayName("WordFactory List Creation Test")
    public void wordFactoryTest() {
        ArrayList<Word> wWords = wordFactory.createWordList(getWordString());
        Assertions.assertEquals(3, wWords.size());
    }

    public ArrayList<String> getWordString() {
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