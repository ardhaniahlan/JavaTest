import java.util.Scanner;

public class SegitigaBintang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = scanner.nextInt();

        for (int i = 1; i <= tinggi; i++) {
            // Mencetak spasi untuk membuat pola segitiga
            for (int j = tinggi - i; j >= 1; j--) {
                System.out.print(" ");
            }

            // Mencetak bintang
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Pindah ke baris berikutnya
            System.out.println();
        }

        scanner.close();
    }
}
