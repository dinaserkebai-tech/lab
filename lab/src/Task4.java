public class Task4 {
    public static void main(String[] args) {
        String s = "A man a plan a canal Panama";
        s = s.replaceAll("\\s+", "").toLowerCase();

        int i = 0, j = s.length() - 1;
        boolean isPalindrome = true;

        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Palindrome: " + isPalindrome);
    }
}
