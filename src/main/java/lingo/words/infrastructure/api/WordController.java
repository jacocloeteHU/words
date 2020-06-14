package lingo.words.infrastructure.api;

import java.util.ArrayList;

import lingo.words.application.services.IWordViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lingo.words.domain.model.Word;

@RestController
public class WordController {
@Autowired
IWordViewService wordService;
    @GetMapping("/words")
    public ResponseEntity<ArrayList<Word>> getWords(){
        return ResponseEntity.ok(wordService.getWords());
    }

    @GetMapping("/words/length/{length}")
    public ResponseEntity<ArrayList<Word>> getWordsByLength(@PathVariable int length){
        return ResponseEntity.ok(wordService.getWordsByLength(length));
    }

    @GetMapping("/word")
    public ResponseEntity<Word> getRandomWord(){
        return ResponseEntity.ok(wordService.getWord());
    }

    @GetMapping("/word/length/{length}")
    public ResponseEntity<Word> getRandomWordByLength(@PathVariable int length){
        return ResponseEntity.ok(wordService.getWordByLength(length));
    }

    @GetMapping("/word/check/{word}")
    public ResponseEntity<Boolean> getRandomWord(@PathVariable String word){
        return ResponseEntity.ok(wordService.checkWord(word));
    }
}
