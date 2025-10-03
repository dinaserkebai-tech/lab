interface Sortable {
    void sort(int[] array);
}

class QuickSort implements Sortable {
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] > pivot) { // descending
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}

class MergeSort implements Sortable {
    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arr, l + 0, L, 0, n1);
        for (int j = 0; j < n2; j++) R[j] = arr[m + 1 + j];

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] > R[j]) { // descending
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
}

public class Interface11 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};

        Sortable sorter = new QuickSort();
        sorter.sort(arr);
        System.out.print("QuickSort (descending): ");
        for (int i : arr) System.out.print(i + " ");
        System.out.println();

        int[] arr2 = {5, 2, 9, 1, 7};
        sorter = new MergeSort();
        sorter.sort(arr2);
        System.out.print("MergeSort (descending): ");
        for (int i : arr2) System.out.print(i + " ");
    }
}
