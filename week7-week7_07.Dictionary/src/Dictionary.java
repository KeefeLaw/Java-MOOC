import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private Map<String, String> dictionary;

    public Dictionary() {
        this.dictionary = new HashMap<String, String>();
    }

    // returning the translation of its parameter. If the word is unknown, it returns null
    public String translate(String word) {
        return dictionary.getOrDefault(word, null);
    }

    // adding a new translation to the dictionary
    public void add(String word, String translation) {
        dictionary.put(word, translation);
    }

    // returns the amount of words in the dictionary
    public int amountOfWords() {
        return dictionary.size();
    }

    // returning strings which stand for a content list of your dictionary in the form "key = value"
    public ArrayList<String> translationList() {
        ArrayList<String> list = new ArrayList<String>();
        for (String s : dictionary.keySet()) {
            list.add(s + " = " + dictionary.get(s));
        }
        return list;
    }
}
