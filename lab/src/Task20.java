import java.util.*;

public class Task20 {
    public static String[] splitByChar(String s, char delimiter) {
        List<String> parts = new ArrayList<>();
        StringBuilder cur = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == delimiter) {
                parts.add(cur.toString());
                cur.setLength(0);
            } else {
                cur.append(c);
            }
        }
        parts.add(cur.toString());
        return parts.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String s = "apple,banana,orange";
        String[] parts = splitByChar(s, ',');
        System.out.println(Arrays.toString(parts));
    }
}
