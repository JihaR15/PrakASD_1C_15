package P12.Tugas1;

import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists15 dll15 = new DoubleLinkedLists15();
        Scanner sc15 = new Scanner (System.in);

        while (true) {
            System.out.println("++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Penerima Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++");
            int pilih = sc15.nextInt();
    
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.print("Nomor Antrian: ");
                    int nomorAntrian = sc15.nextInt();
                    System.out.print("Nama Penerima: ");
                    String NamaPenerima = sc15.next();
                    dll15.addLast(new penerima15(nomorAntrian, NamaPenerima));
                    System.out.println("Data Penerima Vaksin Berhasil Ditambahkan");
                    break;
                case 2:
                    if (dll15.isEmpty()) {
                        System.out.println("Antrian Kosong");
                    } else {
                        System.out.println(dll15.head.data.NamaPenerima + " telah selesai divaksinasi");
                        dll15.removeFirst();
                    }
                    break;
                case 3:
                    dll15.print();
                    System.out.println("Sisa Antrian : " + dll15.size());
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        }
    } 
}
