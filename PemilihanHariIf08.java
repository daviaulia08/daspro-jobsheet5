import java.util.Scanner;

public class PemilihanHariIf08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int angka;
        char hari;

        System.out.print("Masukkan hari ke: ");
        angka = sc.nextInt();

        if (angka > 0 && angka < 6) {
            System.out.println("Weekday"); 
        }
        else if (angka > 5 && angka < 8) {
            System.out.println("Weekend"); 
        }
        else {
            System.out.println("Invalid Number");
        }
    }
}
