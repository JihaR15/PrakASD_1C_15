package P1;
import java.util.Scanner;

public class pemilihan15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===================================");
        System.out.print("Masukkan Nilai Tugas : ");
        int tugas = sc15.nextInt();
        System.out.print("Masukkan Nilai Kuis : ");
        int kuis = sc15.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        int uts = sc15.nextInt();
        System.out.print("Masukkan Nilai UAS : ");
        int uas = sc15.nextInt();
        System.out.println("===================================");

        if (tugas > 100 || kuis > 100 || uts > 100 || uas > 100 || tugas < 0 || kuis < 0 || uts < 0 || uas < 0) {
            System.out.println("Nilai Tidak Valid");
        } else {
            double akhir = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);
            System.out.println("Nilai Akhir : " + akhir);
            String huruf = " ";
            if (80 < akhir && akhir <= 100) {
                huruf = "A";
            } else if (73 < akhir && akhir <= 80) {
                huruf = "B+";
            } else if (65 < akhir && akhir <= 73) {
                huruf = "B";
            } else if (60 < akhir && akhir <= 65) {
                huruf = "C+";
            } else if (50 < akhir && akhir <= 60) {
                huruf = "C";
            } else if (39 < akhir && akhir <= 50) {
                huruf = "D";
            } else if (akhir <= 39) {
                huruf = "E";
            } else {
                System.out.println("Nilai Tidak Valid");
            }

            System.out.println("Nilai Huruf : " + huruf);
            System.out.println("===================================");

            if (huruf == "A" || huruf == "B+" || huruf == "B" || huruf == "C+" || huruf == "C") {
                System.out.println("SELAMAT ANDA LULUS");
            } else if (huruf == "D" || huruf == "E") {
                System.out.println("MAAF ANDA TIDAK LULUS");

            }

        }

        System.out.println("===================================");
    }
}
