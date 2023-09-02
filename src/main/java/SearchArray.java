public class SearchArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 10; // Elemen yang ingin dicari

        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("Elemen " + target + " ditemukan pada indeks ke-" + index);
        } else {
            System.out.println("Elemen " + target + " tidak ditemukan dalam array.");
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1; // Mengembalikan -1 jika elemen tidak ditemukan
    }
}
