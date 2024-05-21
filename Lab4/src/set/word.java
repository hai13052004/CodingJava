import java.util.HashSet;

public class word {
    public static void main(String[] args) {
        HashSet<String> uniqueWords = new HashSet<>();

    
        uniqueWords.add("apple");
        uniqueWords.add("banana");
        uniqueWords.add("cherry");
        uniqueWords.add("date");
        uniqueWords.add("apple");

     
        System.out.println("Số lượng từ duy nhất: " + uniqueWords.size());

    
        System.out.println("Các từ duy nhất trong HashSet:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}