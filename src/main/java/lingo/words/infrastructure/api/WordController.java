package lingo.words.infrastructure.api;

import java.net.URI;
import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import lingo.words.application.services.WordService;
import lingo.words.domain.model.Word;

@RestController
public class WordController {
    
    @GetMapping("/words")
    public ResponseEntity<ArrayList<Word>> readdevice(){    	
    	return ResponseEntity.ok(WordService.GetWords());
    } 
}
