import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        System.out.println("Задание 2");
        List<Integer> numbs = new ArrayList<>(List.of(1, 1, 2, 8, 8, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> uniqueEvenNumbers = new HashSet<>();
        for (int num : numbs) {
            if (num % 2 == 0) {
                uniqueEvenNumbers.add(num);
            }
        }
        for (int num : uniqueEvenNumbers) {
            System.out.println(num);
        }

        System.out.println("Задание 3");
        List<String> words = new ArrayList<>(List.of("Привет", "Мир", "Привет", "Hello", "Мир", "World"));
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        System.out.println("Задание 4");
        List<String> terms = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        HashSet<String> uniqueTerms = new HashSet<>();
        HashMap<String, Integer> termCounts = new HashMap<>();
        for (String term : terms) {
            if (uniqueTerms.add(term)) {
                termCounts.put(term, 1);
            } else {
                termCounts.put(term, termCounts.get(term) + 1);
            }
        }
        for (String term : uniqueTerms) {
            System.out.println(termCounts.get(term));
        }
    }
}