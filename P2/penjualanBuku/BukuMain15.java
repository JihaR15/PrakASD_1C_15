package P2.penjualanBuku;

public class BukuMain15 {
    public static void main(String[] args) {
        Buku15 bk1 = new Buku15();

        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;
        int jumlahTerjualBk1 = 14;
        
        bk1.tampilInformasi();
        bk1.terjual(jumlahTerjualBk1); 
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        
        System.out.println("");
        
        Buku15 bk2 = new Buku15("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        int jmlTerjualBk2 = 11;
        bk2.terjual(jmlTerjualBk2); 
        bk2.tampilInformasi();
        
        System.out.println("");
        Buku15 bukuJiha = new Buku15("Jiha", "Jiha Ramdhan", 19, 100, 10000);
        int jmlTerjualBkJiha = 10;
        bukuJiha.terjual(jmlTerjualBkJiha);
        bukuJiha.tampilInformasi();
        bukuJiha.harga();

    }
}
