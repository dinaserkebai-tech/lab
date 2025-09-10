import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";

        char[] ca = a.toLowerCase().toCharArray();
        char[] cb = b.toLowerCase().toCharArray();

        Arrays.sort(ca);
        Arrays.sort(cb);

        boolean isAnagram = Arrays.equals(ca, cb);
        System.out.println("Anagram: " + isAnagram);
    }
}
