package P8;

import java.util.Scanner;

public class Utama15 {
    public static void main(String[] args) {
        Scanner scanner15 = new Scanner(System.in);
        Gudang15 gudang = new Gudang15(7);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan tumpukan Barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih Operasi: ");
            int pilihan = scanner15.nextInt();
            scanner15.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode Barang: ");
                    int kode = scanner15.nextInt();
                    scanner15.nextLine();
                    System.out.print("Masukkan Nama Barang: ");
                    String nama = scanner15.nextLine();
                    System.out.print("Masukkan Nama Kategori: ");
                    String kategori = scanner15.nextLine();
                    Barang15 barangBaru = new Barang15(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    System.exit(0); // di jobsheet hanya break saja, jadi otomatis looping lagi, tidak keluar
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi");
            }
        }
    }
}
