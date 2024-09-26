import java.util.Scanner;

public class tugaskedua08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int usia;
        String kategori;

        System.out.print("Masukkan usia: ");
        usia = sc.nextInt();

        if (usia > 0 && usia < 13) {
            System.out.println("usia Anak");
        }
        else if (usia > 12 && usia < 20) {
            System.out.println("usia Remaja");
        }
        else if (usia > 19 && usia < 65) {
            System.out.println("usia Dewasa");
        }
        else if (usia > 64) {
            System.out.println("usia Lansia");
        }
        else {
            System.out.println("input tidak valid");
        }
    }
}