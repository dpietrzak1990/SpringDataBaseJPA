package wordDomino.service;

import wordDomino.model.WordEntry;

import java.util.List;

/**
 * Created by RENT on 2017-10-27.
 */
public interface WordEntryService {

    List<WordEntry> findAll();
    void addWord(String word);
}
