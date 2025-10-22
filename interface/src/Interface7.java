// Interface7.java
import java.util.Arrays;

interface SortableInterface {
    void sort(int[] arr); // Массивті өсу ретімен сұрыптайтын әдіс
}

class BubbleSortAlgo implements SortableInterface {
    public void sort(int[] arr) {
        System.out.println("Sorting using Bubble Sort...");
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

class SelectionSortAlgo implements SortableInterface {
    public void sort(int[] arr) {
        System.out.println("Sorting using Selection Sort...");
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

public class Interface7 {
    public static void main(String[] args) {
        int[] numbers1 = {5, 3, 8, 4, 2};
        int[] numbers2 = {9, 7, 1, 6, 3};

        SortableInterface bubble = new BubbleSortAlgo();
        SortableInterface selection = new SelectionSortAlgo();

        bubble.sort(numbers1);
        selection.sort(numbers2);
    }
}
