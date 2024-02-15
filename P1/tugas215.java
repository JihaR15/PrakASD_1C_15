package P1;

import java.util.Scanner;

public class tugas215 {

    static Scanner sc15 = new Scanner(System.in);
    public static void main(String[] args) {

        
        System.out.println("========================");
        System.out.println("Program Menghitung Rumus");
        System.out.println("========================");

        // System.out.println("Masukkan Kecepatan : ");
        // double kecepatan = sc15.nextInt();
        // System.out.println("Masukkan Jarak : ");
        // double jarak = sc15.nextInt();
        // System.out.println("Masukkan Waktu : ");
        // double waktu = sc15.nextInt();

        System.out.println("1. Kecepatan");
        System.out.println("2. Jarak");
        System.out.println("3. Waktu");
        System.out.println("========================");
        System.out.print("Masukkan Pilihan : ");
        double pil = sc15.nextInt();
        System.out.println("========================");

        if (pil == 1) {
            System.out.println("Kecepatannya yaitu : " + kecepatan());
        } else if (pil == 2) {
            System.out.println("Jaraknya yaitu : " + jarak());
        } else if (pil == 3) {
            System.out.println("Waktunya yaitu : " + waktu());
        }
    }

    public static double kecepatan() {
        System.out.print("Masukkan Jarak : ");
        double jarak = sc15.nextInt();
        System.out.print("Masukkan Waktu : ");
        double waktu = sc15.nextInt();

        double kecepatan = jarak / waktu;
        return kecepatan;
    }

    public static double jarak() {
        System.out.print("Masukkan Kecepatan : ");
        double kecepatan = sc15.nextInt();
        System.out.print("Masukkan Waktu : ");
        double Waktu = sc15.nextInt();

        double jarak = kecepatan * Waktu;
        return jarak;
    }

    public static double waktu() {
        System.out.print("Masukkan Jarak : ");
        double jarak = sc15.nextInt();
        System.out.print("Masukkan Kecepatan : ");
        double kecepatan = sc15.nextInt();

        double waktu = jarak / kecepatan;
        return waktu;
    }
}
