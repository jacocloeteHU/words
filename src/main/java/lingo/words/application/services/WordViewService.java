package lingo.words.application.services;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

import lingo.words.domain.model.IWordSource;
import lingo.words.domain.model.Word;
import lingo.words.application.factories.WordFactory;
import lingo.words.domain.services.IWordService;
import lingo.words.infrastructure.source.FileWordSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordViewService implements IWordViewService {
	@Autowired
	IWordService wordService;
	@Autowired
	WordFactory wordFactory;
	@Override
	public boolean loadWordsFromSource(String fileName, String fileType) throws IOException, URISyntaxException {
		IWordSource fileSource = fileSource = new FileWordSource(fileName, fileType);
		ArrayList<String> words = fileSource.readWords();
		return createWords(words);
	}

	@Override
	public boolean createWords(ArrayList<String> words) {
		ArrayList<Word> wordsList = wordFactory.createWordList(words);
		wordService.clear();
		wordService.addList(wordsList);
		return true;	
	}

	@Override
	public Word getWord() {
		Random rand = new Random();
		ArrayList<Word> wordsList = wordService.getAll();
		return wordsList.get(rand.nextInt(wordsList.size()));
	}

	@Override
	public Boolean checkWord(String word) {
		Word testWord = new Word(word);
		ArrayList<Word> wordsList = wordService.getAll();
		return wordsList.contains(testWord);
	}

	@Override
	public Word getWordByLength(int length) {
		Random rand = new Random();
		ArrayList<Word> wordsList = wordService.getAll();
		wordsList = (ArrayList<Word>) wordsList.stream().filter(x -> x.getLength() == length).collect(Collectors.toList());
		return wordsList.get(rand.nextInt(wordsList.size()));
	}
	
	@Override
	public ArrayList<Word> getWords() {
		ArrayList<Word> wordsList = wordService.getAll();
		return wordsList;
	}

	@Override
	public ArrayList<Word> getWordsByLength(int length) {
		ArrayList<Word> wordsList = wordService.getAll();
		return (ArrayList<Word>) wordsList.stream().filter(x -> x.getLength() == length).collect(Collectors.toList());
	}
}