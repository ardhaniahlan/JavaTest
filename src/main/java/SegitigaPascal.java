import java.util.Scanner;

public class SegitigaPascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga Pascal: ");
        int tinggi = scanner.nextInt();

        for (int i = 0; i < tinggi; i++) {
            // Mencetak spasi untuk membuat pola segitiga
            for (int j = tinggi - i; j > 1; j--) {
                System.out.print(" ");
            }

            int nilai = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(nilai + " ");
                nilai = nilai * (i - j) / (j + 1);
            }

            // Pindah ke baris berikutnya
            System.out.println();
        }

        scanner.close();
    }
}
