package wordDomino.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wordDomino.model.WordEntry;
import wordDomino.repostories.WordEntryRepository;
import wordDomino.service.WordEntryService;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class WordEntryServiceImpl implements WordEntryService {

    @Autowired
    private WordEntryRepository wordEntryRepository;

    @Override
    public void addWord(String word) {
        WordEntry wordEntry = new WordEntry();
        wordEntry.setWord(word);
        wordEntry.setDateTime(LocalDateTime.now());
        wordEntryRepository.save(wordEntry);
    }

    @Override
    public List<WordEntry> findAll() {
        return wordEntryRepository.findAll();
    }

}
