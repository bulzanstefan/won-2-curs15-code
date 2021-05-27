package ro.fasttrackit.curs15.recursive;

public class WordLenght {

    public int len(String word) {
        if (word == null || "".equals(word)) {
            return 0;
        } else {
            return len(word.substring(1)) + 1;
        }
    }

    public String rev(String word) {
        if (word == null || "".equals(word)) {
            return "";
        } else {
            return word.charAt(word.length() - 1) + rev(word.substring(0, word.length() - 1));
        }
    }
}
