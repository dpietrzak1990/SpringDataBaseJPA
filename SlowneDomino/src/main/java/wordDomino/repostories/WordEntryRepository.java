package wordDomino.repostories;

import org.springframework.data.jpa.repository.JpaRepository;
import wordDomino.model.WordEntry;

public interface WordEntryRepository extends JpaRepository<WordEntry,Long> {
}
