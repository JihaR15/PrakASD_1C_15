package P3.LatihanPraktikum;
import java.util.Scanner;

public class mahasiswa15 {
    String nama, nim, jenis_kelamin;
    double ipk;

    public static void inputDataMhs(mahasiswa15[] mhs) {
        Scanner sc15 = new Scanner(System.in);
        for (int i = 0; i < mhs.length; i++) {
            mhs[i] = new mahasiswa15();
            System.out.println("== Masukkan data mahasiswa ke-" + (i + 1) + " ==");
            System.out.print("Masukkan Nama: ");
            mhs[i].nama = sc15.next();
            System.out.print("Masukkan NIM: ");
            mhs[i].nim = sc15.next();
            System.out.print("Masukkan Jenis Kelamin: ");
            mhs[i].jenis_kelamin = sc15.next();
            System.out.print("Masukkan IPK: ");
            mhs[i].ipk = sc15.nextDouble();
        }
        System.out.println("");
    }

    public static void tampilkanDataMHS(mahasiswa15[] mhs){
        for (int i = 0; i < mhs.length; i++) {
            System.out.println("== Data Mahasiswa ke-" + (i+1) );
            System.out.println("Nama: " + mhs[i].nama);
            System.out.println("NIM: " + mhs[i].nim);
            System.out.println("Jenis Kelamin: " + mhs[i].jenis_kelamin);
            System.out.println("IPK: " + mhs[i].ipk);
        }
        System.out.println("");
    }

    public static double hitungRataIpk(mahasiswa15[] mhs) {
        double totalIpk = 0;
        for (int i = 0; i < mhs.length; i++) {
            totalIpk += mhs[i].ipk;
        }
        return totalIpk / mhs.length;
    }

    public static void tampilkanDataMaxIpk(mahasiswa15[] mhs) {
        double maxIpk = mhs[0].ipk;
        int indexMax = 0;
        for (int i = 1; i < mhs.length; i++) {
            if (mhs[i].ipk > maxIpk) {
                maxIpk = mhs[i].ipk;
                indexMax = i;
            }
        }
        System.out.println("\n== Data Mahasiswa dengan IPK terbesar:");
        System.out.println("Nama: " + mhs[indexMax].nama);
        System.out.println("NIM: " + mhs[indexMax].nim);
        System.out.println("Jenis Kelamin: " + mhs[indexMax].jenis_kelamin);
        System.out.println("IPK: " + mhs[indexMax].ipk);
        System.out.println("");
    }

}
