import java.util.Scanner;

public class modifikasi08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka : ");
        int angka = sc.nextInt();

        // Menggunakan ternary operator
        String hasil = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + " termasuk bilangan " + hasil);
    }
}
