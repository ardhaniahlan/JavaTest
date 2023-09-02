import java.util.Scanner;

public class SegitigaAngka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = scanner.nextInt();

        for (int i = 1; i <= tinggi; i++) {
            // Mencetak spasi untuk membuat pola segitiga
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }

            // Mencetak angka dari 1 hingga tinggi
            for (int k = 1; k <= (tinggi - i + 1); k++) {
                System.out.print(k + " ");
            }

            // Mencetak angka berkurang dari tinggi-1 hingga 1
            for (int l = tinggi - i; l >= 1; l--) {
                System.out.print(l + " ");
            }

            // Pindah ke baris berikutnya
            System.out.println();
        }

        scanner.close();
    }
}
