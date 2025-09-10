import java.util.HashMap;

public class Task11 {
    public static void main(String[] args) {
        String s = "aabbcaa";
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (char key : freq.keySet()) {
            System.out.println(key + ": " + freq.get(key));
        }
    }
}
