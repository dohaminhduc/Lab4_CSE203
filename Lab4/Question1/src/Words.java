import java.util.*;
import java.util.TreeMap;

public class Words {
    private String word;
    private String meaning;
    private TreeMap<String, String> treeMap = new TreeMap<>();
    private static final Scanner sc = new Scanner(System.in);
    public Words(){}

    public Words(String meaning, String word, TreeMap<String, String> treeMap) {
        this.meaning = meaning;
        this.word = word;
        this.treeMap = treeMap;
    }
    public void SetWord() {
        System.out.println("How many words would you like to use? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            treeMap.put("Word"+i, "Meaning"+i);
            System.out.println("Word"+i+": "+treeMap.get("Word"+i));
        }
    }
    public void CheckWord() {
        String findWord = sc.next();
        if(treeMap.get(word).equals(findWord)) {
            System.out.println("Word found");
        } else {
            System.out.println("Word not found");
        }
    }
    public void FindMeaning() {
        System.out.println("Enter the word you want to find its meaning: ");
        String mean = sc.next();
        if (treeMap.get(meaning).equals(mean)) {
            System.out.println(treeMap.get(word));
        } else {
            System.out.println("Cannot find the valid word");
        }
    }
    public void DisplayDictionary() {
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


