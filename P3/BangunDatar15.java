package P3;

import P3.ArrayBalok.Segitiga15;
import P3.AOBpersegiPanjang.PersegiPanjang15;

public class BangunDatar15 {
    Segitiga15[] segitigas;
    PersegiPanjang15[] persegiPanjangs;

    void tambahSgt(Segitiga15[] segitiga) {
        this.segitigas = segitiga;
    }

    void tambahPp(PersegiPanjang15[] persegiPanjang) {
        this.persegiPanjangs = persegiPanjang;
    }

    void tampilBangunDatar(){
        for (int i = 0; i < persegiPanjangs.length; i++) {
            System.out.println("Persegi Panjang ke-" + i + "\nPanjang: " + persegiPanjangs[i].panjang + ", lebar: " + persegiPanjangs[i].lebar);
        }
        System.out.println("=====================");
        for (int i = 0; i < segitigas.length; i++) {
            System.out.println("Segitiga ke-" + i + "\nPanjang: " + segitigas[i].alas + ", lebar: " + segitigas[i].tinggi);
        }
    }
}
