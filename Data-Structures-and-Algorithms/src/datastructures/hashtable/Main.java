package datastructures.hashtable;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static Character firstNonRepeatingChar(String word) {
        Map<Character, Long> characterMap = word
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Optional<Character> result = word
                .chars()
                .mapToObj(c -> (char) c)
                .filter(c -> characterMap.get(c) == 1)
                .findFirst();

        return result.orElse(null);
    }

    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();

        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

        myHashTable.printTable();

        System.out.println(myHashTable.keys());
        System.out.println(firstNonRepeatingChar("leetcode"));
    }
}
