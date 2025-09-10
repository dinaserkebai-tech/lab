public class Task14 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }

        System.out.println("Жұп индекстердегі элементтердің қосындысы = " + sum);
    }
}
