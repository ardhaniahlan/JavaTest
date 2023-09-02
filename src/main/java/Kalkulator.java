import java.util.Scanner;
// Pseucode Kalkulator
//Input angka1
//        Input operator
//        Input angka2
//
//        If operator == '+':
//        hasil = angka1 + angka2
//        Else If operator == '-':
//        hasil = angka1 - angka2
//        Else If operator == '*':
//        hasil = angka1 * angka2
//        Else If operator == '/':
//        If angka2 != 0:
//        hasil = angka1 / angka2
//        Else:
//        Output "Pembagian oleh nol tidak diperbolehkan."
//        Else:
//        Output "Operasi tidak valid."
//
//        Output hasil


public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan operasi (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        double hasil;

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Pembagian oleh nol tidak diperbolehkan.");
                    return;
                }
                break;
            default:
                System.out.println("Operasi tidak valid.");
                return;
        }

        System.out.println("Hasil: " + hasil);

        scanner.close();
    }
}

