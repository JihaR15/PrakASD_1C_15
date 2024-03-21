package P5.Faktorial;

import java.util.Scanner;

public class MainFaktorial15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        System.out.println("=============================");
        System.out.print("Masukkan jumlah elemen: ");
        int iJml = sc15.nextInt();
        

        Faktorial15[] fk15 = new Faktorial15[10];
        for (int i = 0; i < iJml; i++) {
            fk15[i] = new Faktorial15();
            System.out.print("Masukkan nilai data ke-" + (i+1) + ": ");
            int iNilai = sc15.nextInt();
            fk15[i].nilai = iNilai;
        }

        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println(
                "Hasil penghitungan faktorial menggunakan Brute Force adalah " + 
                fk15[i].faktorialBF(fk15[i].nilai));
        }

        System.out.println("HASIL - DIVIDE AND CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.println(
                "Hasil penghitungan faktorial menggunakan Divide and Conquer adalah " + 
                fk15[i].faktorialDC(fk15[i].nilai));
        }
    }
}
