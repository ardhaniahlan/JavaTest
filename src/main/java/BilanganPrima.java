import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        System.out.println("Bilangan prima hingga " + n + ":");
        for (int i = 2; i <= n; i++) {
            boolean isPrima = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrima = false;
                    break;
                }
            }
            if (isPrima) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}

