package P2.penjualanBuku;

public class Buku15 {
    String judul, pengarang, status;
    int halaman, stok, harga, terjual;

    void tampilInformasi() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Halaman : " + halaman);
        System.out.println("Terjual : " + terjual);
        System.out.println("Stok : " + stok );
        if (stok > 0) {
            status = "Stok Tersedia";
        } else {
            status = "Stok Habis";
        }
        System.out.println("Status : " + status);
        System.out.println("Harga : " + harga);

    }

    void harga(){
        System.out.println("Harga Total : " + hitungHargaTotal(terjual));
        System.out.println("Diskon : " + hitungDiskon(terjual));
        System.out.println("Total Bayar : " + hitungHargaBayar(terjual));
    }
    
    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
            terjual = jml;
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



    public Buku15(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    public int hitungHargaTotal(int jml){
        return jml * harga;
    }

    public double hitungDiskon(int jml){
        int hargaTotal = hitungHargaTotal(jml);
        double diskon = 0.0;

        if (hargaTotal > 150000) {
            diskon = 0.12; 
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            diskon = 0.05; 
        } else {
            diskon = 0.0;
        }
    
        return diskon;
    }

    public int hitungHargaBayar(int jml){
        int hargaTotal = hitungHargaTotal(jml);
        double diskon = hitungDiskon(jml);
        double totalDiskon = hargaTotal * diskon;
        return (int) (hargaTotal - totalDiskon);
    }

}
