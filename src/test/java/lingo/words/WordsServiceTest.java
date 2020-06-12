package lingo.words;

import lingo.words.application.services.IWordViewService;
import lingo.words.domain.model.Word;
import lingo.words.domain.services.IWordService;
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
public class WordsServiceTest {
    @Autowired
    IWordViewService WordViewService;
    @Autowired
    IWordService wordService;
    public WordsServiceTest() {
    }

    @Test
    @DisplayName("Words Service Get words Test")
    public void wordsServiceTest() {
        WordViewService.createWords(getWordString());
        Assertions.assertEquals(3, WordViewService.getWords().size());
    }

    @Test
    @DisplayName("WordsController Add to list Test")
    public void wordsServiceAddingToListTest() {
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("pinda"));
        words.add(new Word("choco"));
        words.add(new Word("alade"));
        wordService.clear();
        wordService.addList(words);
        Assertions.assertEquals(3, WordViewService.getWords().size());
    }

    @Test
    @DisplayName("WordsController Add to list Test")
    public void wordsServiceWordByLength() {
        Assertions.assertEquals(5, WordViewService.getWordByLength(5).getLength());
        Assertions.assertNotEquals(6, WordViewService.getWordByLength(5).getLength());
        Assertions.assertNotEquals(7, WordViewService.getWordByLength(5).getLength());
    }

    @Test
    @DisplayName("WordsController Add to list Test")
    public void wordsServiceWord() {
        Assertions.assertNotNull(WordViewService.getWord());
    }

    @Test
    @DisplayName("WordsController Add to list Test")
    public void wordsServiceWordsByLength() {
        Assertions.assertEquals(5, WordViewService.getWordsByLength(5).get(0).getLength());
        Assertions.assertNotEquals(6, WordViewService.getWordsByLength(5).get(0).getLength());
        Assertions.assertNotEquals(7, WordViewService.getWordsByLength(5).get(0).getLength());
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