package P5.SumArray;

import java.util.Scanner;

public class MainSum15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        System.out.println("============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
        System.out.println("============================================================");

        System.out.print("Masukkan Jumlah Perusahaan : ");
        int jumlahPerusahaan = sc15.nextInt();

        Sum15[] sm15 = new Sum15[jumlahPerusahaan];

        for (int i = 0; i < sm15.length; i++) {
            System.out.println("=============================");
            System.out.println("Perusahaan ke-" + (i + 1));
            System.out.print("Masukkan Jumlah Bulan : ");
            int elm = sc15.nextInt();

            sm15[i] = new Sum15(elm);
            System.out.println("=============================");
            for (int j = 0; j < elm; j++) {
                System.out.print("Masukkan Keuntungan Bulan ke-" + (j+1) + " : ");
                sm15[i].keuntungan[j] = sc15.nextDouble();
        }

        }

        System.out.println("\n========================================");
        System.out.println("HASIL PERHITUNGAN KEUNTUNGAN PERUSAHAAN");
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.println("=====================================");
            System.out.println("Perusahaan ke-" + (i + 1) + ":");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total Kentungan perusahaan selama " + sm15[i].elemen + 
                                " bulan adalah " + sm15[i].totalBF(sm15[i].keuntungan));
            System.out.println("-------------------------------------------------------");
            System.out.println("Algoritma Divide and Conquer");
            System.out.println("Total Kentungan perusahaan selama " + sm15[i].elemen + 
            " bulan adalah " + sm15[i].totalDC(sm15[i].keuntungan, 0, sm15[i].elemen-1));
        }
    }  
}
