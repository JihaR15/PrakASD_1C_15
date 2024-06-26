package P8;

import java.util.Scanner;

public class Gudang15 {
    Barang15[] tumpukan;
    int size;
    int top;
    static Scanner sc15 = new Scanner(System.in);

    public Gudang15(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang15[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang15 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang15 ambilBarang(){
        if (!cekKosong()) {
            Barang15 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " berhasil diambil dari Gudang");
            System.out.println("Kode unik dalam biner: " + konversiDesimaKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang15 lihatBarangTeratas() {
        if (!cekKosong()) { // di jobsheet isEmpty, saya ganti cekKosong
            Barang15 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public void tampilkanBarang(){
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang: ");

            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, 
                tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong. ");
        }
    }

    // Percobaan 2
    public String konversiDesimaKeBiner(int kode) {
        StackKonversi15 stack = new StackKonversi15();
        while (kode != 0){
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()){
            biner += stack.pop();
        }
        return biner;
    }

    //Latihan Praktikum
    public Barang15 lihatBarangTerbawah(){
        if (!cekKosong()) {
            Barang15 barangTerbawah = tumpukan[0]; // Barang terbawah berada di indeks 0
            System.out.println("Barang terbawah: " + barangTerbawah.nama);
            return barangTerbawah;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang15 cariBarang(){
        if (!cekKosong()) {
            System.out.print("Masukkan kode Barang: ");
            int kode = sc15.nextInt();
            for (int i = top; i >= 0; i--) {
                if (tumpukan[i].kode == kode) {
                    System.out.println("Barang dengan kode " + kode + " ditemukan: " + tumpukan[i].nama);
                    return tumpukan[i];
                }
            }
            System.out.println("Barang dengan kode " + kode + " tidak ditemukan.");
            return null;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }

    }
}
