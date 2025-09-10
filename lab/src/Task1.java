import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String input = "Java is great and Java is powerful";
        String[] words = input.toLowerCase().split("\\s+");
        Set<String> set = new LinkedHashSet<>(Arrays.asList(words));

        for (String w : set) {
            System.out.print(w + " ");
        }
    }
}
