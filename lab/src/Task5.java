public class Task5 {
    public static void main(String[] args) {
        String str = "hello world";
        String sub = "world";

        int index = -1;
        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub)) {
                index = i;
                break;
            }
        }
        System.out.println("Index: " + index);
    }
}
