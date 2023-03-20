import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordChecker {
    protected List<String> list = new ArrayList<>();

    public boolean WordChecker(String text) {
        String[] words = text.split("\\P{IsAlphabetic}+");
        list = Arrays.asList(words);
        return hasWord();
    }

    public boolean hasWord() {
        if (list.contains(Main.word)) {
            return true;
        }
        return false;

    }
}
