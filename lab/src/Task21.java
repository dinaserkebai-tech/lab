public class Task21 {
    public static int countWords(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        return s.split("\\s+").length;
    }
    public static void main(String[] args) {
        System.out.println(countWords("  Hello   world  from Java "));
    }
}
