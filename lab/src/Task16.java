public class Task16 {
    public static void main(String[] args) {
        String s = "Hello World";
        char[] arr = s.toCharArray();
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        String rev = new String(arr);
        System.out.println("Reversed: " + rev);
    }
}
