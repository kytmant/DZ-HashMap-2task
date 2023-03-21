import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordChecker {
    protected List<String> list = new ArrayList<>();

    public boolean WordChecker(String text) {
        String[] words = text.split("\\P{IsAlphabetic}+");
        list = Arrays.asList(words);
        return hasWord(Main.word);
    }

    public boolean hasWord(String searchWord) {
        if (list.contains(searchWord)) {
            return true;
        }
        return false;

    }
}
