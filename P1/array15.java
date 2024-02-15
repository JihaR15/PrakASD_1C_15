package P1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class array15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);

        double[][] sks = new double[2][8];// sks awal // sks setelah dikali
        String[][] matkulHuruf = new String[2][8]; // nama matkul // nilai huruf
        double[][] nilai = new double[2][8]; // nilai matkul // nilai setara

        DecimalFormat df = new DecimalFormat("#.00");

        sks[0][0] = 2;
        sks[0][2] = 2;
        sks[0][1] = 2;
        sks[0][3] = 3;
        sks[0][4] = 2;
        sks[0][5] = 2;
        sks[0][6] = 3;
        sks[0][7] = 2;

        matkulHuruf[0][0] = "Pancasila";
        matkulHuruf[0][1] = "KTI";
        matkulHuruf[0][2] = "CTPS";
        matkulHuruf[0][3] = "MATDAS";
        matkulHuruf[0][4] = "BING";
        matkulHuruf[0][5] = "DASPRO";
        matkulHuruf[0][6] = "PRAKDASPRO";
        matkulHuruf[0][7] = "K3";

        System.out.println("Program Menghitung Nilai Semester");

        for (int i = 0; i < matkulHuruf[0].length; i++) {
            System.out.print("Masukkan Nilai Angka untuk MK " + matkulHuruf[0][i] + ": ");
            nilai[0][i] = sc15.nextInt();

            if (nilai[0][i] > 80 && nilai[0][i] <= 100) {
                nilai[1][i] = 4.0;
                matkulHuruf[1][i] = "A";
            } else if (nilai[0][i] > 73 && nilai[0][i] <= 80) {
                nilai[1][i] = 3.5;
                matkulHuruf[1][i] = "B+";
            } else if (nilai[0][i] > 65 && nilai[0][i] <= 73) {
                nilai[1][i] = 3.0;
                matkulHuruf[1][i] = "B";
            } else if (nilai[0][i] > 60 && nilai[0][i] <= 65) {
                nilai[1][i] = 2.5;
                matkulHuruf[1][i] = "C+";
            } else if (nilai[0][i] > 50 && nilai[0][i] <= 60) {
                nilai[1][i] = 2.0;
                matkulHuruf[1][i] = "C";
            } else if (nilai[0][i] > 39 && nilai[0][i] <= 50) {
                nilai[1][i] = 1.0;
                matkulHuruf[1][i] = "D";
            } else if (nilai[0][i] <= 39) {
                nilai[1][i] = 0.0;
                matkulHuruf[1][i] = "E";
            }

            sks[1][i] = nilai[1][i] * sks[0][i];
        }

        System.out.println("===================================");
        System.out.println("Hasil konversi Nilai");
        System.out.println("===================================");

        System.out.printf("%-30s %-20s %-20s %-20s %-20s %-20s\n", "Mata kuliah", "Nilai Angka", "Nilai Huruf",
                "Bobot Nilai ", "SKS", "N x SKS");
        System.out.println(
                "------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < matkulHuruf[0].length; i++) {
            System.out.printf("%-30s %-20s %-20s %-20s %-20s %-20s\n", matkulHuruf[0][i], df.format(nilai[0][i]),
                    matkulHuruf[1][i], df.format(nilai[1][i]), df.format(sks[0][i]), df.format(sks[1][i]));
        }

        System.out.println("===================================");

        double ip = 0, jmlhSKS = 0;
        for (int i = 0; i < sks[0].length; i++) {
            ip += sks[1][i];
            jmlhSKS += sks[0][i];
        }

        ip /= jmlhSKS;

        System.out.println("IP semester : " + df.format(ip));

    }
}
