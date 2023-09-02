import java.util.Scanner;

public class DeretFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah suku deret Fibonacci yang ingin ditampilkan: ");
        int jumlahSuku = scanner.nextInt();

        if (jumlahSuku < 1) {
            System.out.println("Jumlah suku deret harus lebih besar dari 0.");
        } else {
            System.out.println("Deret Fibonacci dengan " + jumlahSuku + " suku:");
            cetakDeretFibonacci(jumlahSuku);
        }

        scanner.close();
    }

    public static void cetakDeretFibonacci(int n) {
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
    }
}
