package P5.SumArray;

import java.util.Scanner;

public class MainSum15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta, Misal 5.9)");
        System.out.print("Masukkan Jumlah Bulan : ");
        int elm = sc15.nextInt();

        Sum15 sm15 = new Sum15(elm);
        System.out.println("=============================");
        for (int i = 0; i < sm15.elemen; i++) {
            System.out.print("Masukkan Keuntungan Bulan ke-" + (i+1) + " : ");
            sm15.keuntungan[i] = sc15.nextDouble();
        }

        System.out.println("=============================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total Kentungan perusahaan selama " + sm15.elemen + 
                            " bulan adalah " + sm15.totalBF(sm15.keuntungan));
        System.out.println("=============================");
        System.out.println("Algoritma Divide and Conquer");
        System.out.println("Total Kentungan perusahaan selama " + sm15.elemen + 
                            " bulan adalah " + sm15.totalDC(sm15.keuntungan, 0, sm15.elemen-1));
    }
    
}
