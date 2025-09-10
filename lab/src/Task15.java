import java.util.Arrays;

public class Task15 {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 7, 5};

        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) minIndex = i;
            if (arr[i] > arr[maxIndex]) maxIndex = i;
        }

        // Swap
        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;

        System.out.println("Нәтиже: " + Arrays.toString(arr));
    }
}
