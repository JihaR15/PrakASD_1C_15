package P3;

import P3.AOBpersegiPanjang.PersegiPanjang15;
import P3.ArrayBalok.Segitiga15;

public class BangunMain15 {
    public static void main(String[] args) {
        Segitiga15 sg1 = new Segitiga15(5, 10);
        Segitiga15 sg2 = new Segitiga15(10, 15);
        Segitiga15 sg3 = new Segitiga15(15, 20);
        PersegiPanjang15 pp1 = new PersegiPanjang15(5, 10);
        PersegiPanjang15 pp2 = new PersegiPanjang15(2, 8);
        PersegiPanjang15 pp3 = new PersegiPanjang15(10, 15);
        
        Segitiga15[] s = new Segitiga15[3];
        PersegiPanjang15[] p = new PersegiPanjang15[3];

        s[0] = sg1;
        s[1] = sg2;
        s[2] = sg3;
        p[0] = pp1;
        p[1] = pp2;
        p[2] = pp3;

        BangunDatar15 bd = new BangunDatar15();
        bd.tambahSgt(s);
        bd.tambahPp(p);
        bd.tampilBangunDatar();
    }
}
