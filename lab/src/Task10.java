public class Task10 {
    public static void main(String[] args) {
        String s = "a b\tc\n d";
        String result = s.replaceAll("\\s+", "");
        System.out.println("Result: " + result);
    }
}
