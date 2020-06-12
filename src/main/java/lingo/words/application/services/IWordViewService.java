package lingo.words.application.services;

import lingo.words.domain.model.Word;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;

public interface IWordViewService {
    boolean loadWordsFromSource(String fileName, String fileType) throws IOException, URISyntaxException;

    boolean createWords(ArrayList<String> words);

    Word getWord();

    Boolean checkWord(String word);

    Word getWordByLength(int length);

    ArrayList<Word> getWords();

    ArrayList<Word> getWordsByLength(int length);
}
