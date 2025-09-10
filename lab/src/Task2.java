public class Task2 {
    public static void main(String[] args) {
        String input = "Java programming language";
        String[] words = input.split("\\s+");

        String longest = "";
        for (String w : words) {
            if (w.length() > longest.length()) longest = w;
        }
        System.out.println("Longest word: " + longest);
    }
}
