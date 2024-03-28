package P6;

public class Buku15 {
    int kodeBuku, tahunTerbit, stock;
    String judul, pengarang;

    public Buku15(int KodeBuku, String judul, int tahunTerbit, String pengarang, int stock) {
        this.kodeBuku = KodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    public void tampilInformasi() {
        System.out.println("==========================");
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Judul Buku : " + judul);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Stock : " + stock);
    }
}


