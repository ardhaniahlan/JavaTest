public class PengurutanArray {
    public static void main(String[] args) {
        int[] arr = {100, 20, 15, 30, 5 ,75, 40};

        System.out.println("\nArray sebelum diurutkan:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("\nArray setelah diurutkan:");
        printArray(arr);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Tukar elemen arr[i] dan arr[i + 1]
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
