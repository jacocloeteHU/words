package lingo.words;

import lingo.words.application.services.WordService;
import lingo.words.domain.model.Word;
import lingo.words.domain.services.DomainServices;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class WordsService {

    public WordsService() {
    }

    @Test
    @DisplayName("Words Service Get words Test")
    public void WordsServiceTest() {
        WordService.CreateWords(GetWordString());
        Assertions.assertEquals(3, WordService.GetWords().size());
    }

    @Test
    @DisplayName("WordsController Add to list Test")
    public void WordsServiceAddingToListTest() {
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("pinda"));
        words.add(new Word("choco"));
        words.add(new Word("alade"));
        DomainServices.WordService().Clear();
        DomainServices.WordService().AddList(words);
        Assertions.assertEquals(3, WordService.GetWords().size());
    }

    @Test
    @DisplayName("WordsController Add to list Test")
    public void WordsServiceWordByLength() {
        Assertions.assertEquals(5, WordService.GetWordByLength(5).getLength());
        Assertions.assertNotEquals(6, WordService.GetWordByLength(5).getLength());
        Assertions.assertNotEquals(7, WordService.GetWordByLength(5).getLength());
    }

    @Test
    @DisplayName("WordsController Add to list Test")
    public void WordsServiceWord() {
        Assertions.assertNotNull(WordService.GetWord());
    }

    @Test
    @DisplayName("WordsController Add to list Test")
    public void WordsServiceWordsByLength() {
        Assertions.assertEquals(5, WordService.GetWordsByLength(5).get(0).getLength());
        Assertions.assertNotEquals(6, WordService.GetWordsByLength(5).get(0).getLength());
        Assertions.assertNotEquals(7, WordService.GetWordsByLength(5).get(0).getLength());
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