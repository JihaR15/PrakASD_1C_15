package P2.penjualanBuku;

public class Buku15 {
    String judul, pengarang, status = "Stok Tersedia";
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Halaman : " + halaman);
        System.out.println("Stok : " + stok );
        System.out.println("Status : " + status);
        System.out.println("Harga : " + harga);
    }
    
    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
            if (stok <= 0) {
                stok = 0;
                status = "Stok Sudah habis";
            }
        }
    }
    
    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }
}

