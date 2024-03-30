package P6.LatihanPraktikum;

public class Hotel15 {
    String nama, kota;
    int harga;
    byte bintang;

    public Hotel15(String n, String k, int h, byte b){
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    public void tampilInformasi(){
        System.out.println("==========================");
        System.out.println("Nama Hotel\t: " + nama);
        System.out.println("Lokasi\t\t: " + kota);
        System.out.println("Harga\t\t: " + harga);
        System.out.println("Bintang\t\t: " + bintang);
    }
}
