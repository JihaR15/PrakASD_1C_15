package TestSearching.P7;

import java.util.Scanner;

public class BukuMain15 {
    public static void main(String[] args) {
        Scanner s15 = new Scanner(System.in);
        Scanner s115 = new Scanner(System.in);

        PencarianBuku15 data = new PencarianBuku15();
        int jumBuku = 5;

        System.out.println("========================================");
        System.out.println("Masukkan data Buku secara Urut dari KodeBuku Terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("----------------------------------------");
            System.out.print("Kode Buku \t: ");
            int kodeBuku = s15.nextInt();
            System.out.print("Judul Buku \t: ");
            String judulBuku = s115.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s15.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s115.nextLine();
            System.out.print("Stock \t\t: ");
            int stock = s15.nextInt();

            Buku15 m = new Buku15(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        System.out.println("========================================");
        System.out.println("Data Keseluruhan Buku : ");
        data.tampil();

        System.out.println("========================================");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku yang ingin dicari : ");
        System.out.print("Kode Buku : ");
        int cari = s15.nextInt();
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

        // PERCOBAAN 1 : pertanyaan 3

        Buku15 dataBuku = data.FindBuku(cari);
        dataBuku.tampilDataBuku();

        // PERCOBAAN 2

        System.out.println("========================================");
        System.out.println("Menggunakan Binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

    }
}
