package lingo.words.application.services;

import lingo.words.application.controllers.IWordController;
import lingo.words.application.controllers.WordController;

public class ControllersService {
	static final IWordController wordController = new WordController();
	
    public static IWordController GetWordController()
    {
        return wordController;
    }
}
