interface SortableAsc {
    void sort(int[] array);
}

class BubbleSort implements SortableAsc {
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

class SelectionSort implements SortableAsc {
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}

public class Interface7 {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 9, 1, 5, 6};
        int[] arr2 = arr1.clone();

        SortableAsc bubble = new BubbleSort();
        bubble.sort(arr1);

        SortableAsc selection = new SelectionSort();
        selection.sort(arr2);

        System.out.print("Bubble Sort: ");
        for (int num : arr1) System.out.print(num + " ");
        System.out.println();

        System.out.print("Selection Sort: ");
        for (int num : arr2) System.out.print(num + " ");
    }
}
