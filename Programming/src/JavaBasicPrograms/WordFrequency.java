package JavaBasicPrograms;

import java.util.ArrayList;
import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Bannana");
        words.add("Apple");
        words.add("Orrange");
        words.add("Bannana");
        words.add("Apple");
        HashMap<String, Integer> wordFrequency = new HashMap<>();
        System.out.println(wordFrequency);
        for (String word : words) {
            if (wordFrequency.containsKey(word)) {
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            } else {
                wordFrequency.put(word, 1);
            }
        }
        System.out.println(wordFrequency);
    }
}
