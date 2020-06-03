package lingo.words;

import lingo.words.domain.model.Word;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class WordTest {
    public WordTest() {
    }

    @Test
    @DisplayName("Testing Word object")
    public void CreateWord() {
        Word word = new Word("testen");
        lengthWord(word);
        lengthWordmanipulation(word);
    }

    @DisplayName("Testing Word length and size")
    public void lengthWord(Word word) {
        Assertions.assertEquals(6, word.getLength());
        Assertions.assertEquals(6, word.getWord().length());
        //Word word = new Word("testen");
    }

    @DisplayName("Testing Word length/size after manipulation")
    public void lengthWordmanipulation(Word word) {
        word.setWord("testenen");
        Assertions.assertEquals(8, word.getLength());
        Assertions.assertEquals(8, word.getWord().length());
        //Word word = new Word("testen");
    }
}