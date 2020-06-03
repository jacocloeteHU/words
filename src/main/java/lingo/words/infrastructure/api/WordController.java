package lingo.words.infrastructure.api;

import java.net.URI;
import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import lingo.words.application.services.WordService;
import lingo.words.domain.model.Word;

@RestController
public class WordController {

    @GetMapping("/words")
    public ResponseEntity<ArrayList<Word>> GetWords(){
        return ResponseEntity.ok(WordService.GetWords());
    }

    @GetMapping("/words/length/{length}")
    public ResponseEntity<ArrayList<Word>> GetWordsByLength(@PathVariable int length){
        return ResponseEntity.ok(WordService.GetWordsByLength(length));
    }

    @GetMapping("/word")
    public ResponseEntity<Word> GetRandomWord(){
        return ResponseEntity.ok(WordService.GetWord());
    }

    @GetMapping("/word/length/{length}")
    public ResponseEntity<Word> GetRandomWordByLength(@PathVariable int length){
        return ResponseEntity.ok(WordService.GetWordByLength(length));
    }
}
