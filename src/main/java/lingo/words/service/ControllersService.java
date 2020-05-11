package lingo.words.service;

import lingo.words.controllers.IWordController;
import lingo.words.controllers.WordController;

public class ControllersService {
	static final IWordController wordController = new WordController();
	
    public static IWordController GetWordController()
    {
        return wordController;
    }
}
