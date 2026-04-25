import java.util.HashMap;

public class WordFrequency {
    public static void main(String[] args) {

        String sentence = "java is easy and java is powerful";
        String[] words = sentence.split(" ");

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {   // used only for counting
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Print without for loop
        wordCount.forEach((key, value) -> 
            System.out.println(key + " : " + value)
        );
    }
}