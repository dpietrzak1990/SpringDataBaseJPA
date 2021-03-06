package wordDomino.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wordDomino.model.WordEntry;
import wordDomino.service.WordEntryService;

import java.util.List;
@RestController
@RequestMapping("/api/word-entry")
public class WordEntryController {

    @Autowired
    private WordEntryService wordEntryService;

    @GetMapping
    public List<WordEntry> findAll() {
        return wordEntryService.findAll();
    }

    @PutMapping("/{word}")
    public void addWord(@PathVariable String word) {
        wordEntryService.addWord(word);
    }

}
