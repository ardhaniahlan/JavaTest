import java.util.Scanner;

public class PersegiBintang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi persegi: ");
        int panjangSisi = scanner.nextInt();

        for (int i = 1; i <= panjangSisi; i++) {
            for (int j = 1; j <= panjangSisi; j++) {
                // Cek apakah kita berada di baris atau kolom pertama, terakhir
                if (i == 1 || i == panjangSisi || j == 1 || j == panjangSisi) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println(); // Pindah ke baris berikutnya setelah mencetak satu baris
        }

        scanner.close();
    }
}






