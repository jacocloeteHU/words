package lingo.words.domain.services;

public class DomainServices  {
	static final IWordService wordService = new WordService();
	
    public static IWordService WordService()
    {
        return wordService;
    }
}
