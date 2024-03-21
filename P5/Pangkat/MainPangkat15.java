package P5.Pangkat;

import java.util.Scanner;

public class MainPangkat15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        System.out.println("=============================");
        System.out.print("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc15.nextInt();

        Pangkat15[] png15 = new Pangkat15[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = sc15.nextInt();
            System.out.print("Masukkan nilai pemangkat: ");
            int pangkat  = sc15.nextInt();
            png15[i] = new Pangkat15(nilai, pangkat);
        }

        System.out.println("HASIL PANGKAT - BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png15[i].nilai + 
            " pangkat " + png15[i].pangkat + 
            " adalah " + png15[i].pangkatBF(png15[i].nilai, png15[i].pangkat));
        }
        System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Hasil dari " + png15[i].nilai + 
            " pangkat " + png15[i].pangkat + 
            " adalah " + png15[i].pangkatDC(png15[i].nilai, png15[i].pangkat));
        }
    }
}
