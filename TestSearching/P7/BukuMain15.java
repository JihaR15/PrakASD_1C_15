package TestSearching.P7;

import java.util.Scanner;

public class BukuMain15 {
    public static void main(String[] args) {
        Scanner s15 = new Scanner(System.in);
        Scanner s115 = new Scanner(System.in);

        PencarianBuku15 data = new PencarianBuku15();
        int jumBuku = 5;

        // System.out.println("========================================");
        // System.out.println("Masukkan data Buku secara Urut dari KodeBuku Terkecil : ");
        // for (int i = 0; i < jumBuku; i++) {
        //     System.out.println("----------------------------------------");
        //     System.out.print("Kode Buku \t: ");
        //     String kodeBuku = s15.nextLine();
        //     System.out.print("Judul Buku \t: ");
        //     String judulBuku = s115.nextLine();
        //     System.out.print("Tahun Terbit \t: ");
        //     int tahunTerbit = s15.nextInt();
        //     System.out.print("Pengarang \t: ");
        //     String pengarang = s115.nextLine();
        //     System.out.print("Stock \t\t: ");
        //     int stock = s15.nextInt();

        //     Buku15 m = new Buku15(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
        //     data.tambah(m);
        // }

        // dari inputan diganti ke isi langsung di sourcce code nya pakai parameter

        Buku15 m = new Buku15("20215", "Algoritma", 2019, "Wahyuni", 5);
        Buku15 m1 = new Buku15("20214", "Big Data", 2020, "Susilo", 3);
        Buku15 m2 = new Buku15("20212", "Algoritma", 2021, "Supriadi", 3);
        Buku15 m3 = new Buku15("20211", "Web Programming", 2022, "Pustaka Adi", 3);
        Buku15 m4 = new Buku15("20210", "Etika Mahasiswa", 2023, "Darmawan Adi", 3);

        data.tambah(m);
        data.tambah(m1);
        data.tambah(m2);
        data.tambah(m3);
        data.tambah(m4);
        
        System.out.println("========================================");
        System.out.println("Data Keseluruhan Buku : ");
        data.tampil();

        System.out.println("========================================");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku yang ingin dicari : ");
        System.out.print("Kode Buku : ");
        // int cari = s15.nextInt();
        String cari = s15.nextLine();
        System.out.println("Menggunakan Sequential Search");
        // int posisi = data.FindSeqSearch(cari);
        int posisi = data.FindSeqSearchString(cari);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

        // PERCOBAAN 1 : pertanyaan 3

        Buku15 dataBuku = data.FindBuku(cari);
        dataBuku.tampilDataBuku();

        // PERCOBAAN 2

        System.out.println("========================================");
        System.out.println("Menggunakan Binary Search");
        // posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        posisi = data.FindBinarySearchString(cari, 0, jumBuku - 1);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("========================================");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Judul yang ingin dicari : ");
        String cari2;
        
        // kalau judul buku yang diinputkan ternyata di data nya ada lebih dari satu,
        // maka akan muncul peringatan 
        // dan program akan menanyakan lagi judul buku yang ingin dicari
            
        while (true) { 
            System.out.print("Judul Buku : "); 
            cari2 = s15.nextLine(); 
    
            if (data.duplikatJudul(cari2)) {
                System.out.println("Data yang Anda cari ada lebih dari satu!!");               
            } else {
                break;
            }
            
        }

        System.out.println("Menggunakan Sequential Search");
        int posisi2 = data.FindSeqSearchJudul(cari2);
        data.TampilPosisiJudul(cari2, posisi2);
        data.TampilDatajudul(cari2, posisi2);  

        System.out.println("========================================");
        System.out.println("Data diurutkan terlebih dahulu untuk menggunakan Binary Search");
        data.insertionSort();
        data.tampil();

        System.out.println("========================================");
        System.out.println("Menggunakan Binary Search");
        posisi2 = data.FindBinarySearchJudul(cari2);
        data.TampilPosisiJudul(cari2, posisi2);
        data.TampilDatajudul(cari2, posisi2);

    }
}
