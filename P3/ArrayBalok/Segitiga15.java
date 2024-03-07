package P3.ArrayBalok;

public class Segitiga15 {
    public int alas;
    public int tinggi;

    public Segitiga15(int a, int t) {
        alas = a;
        tinggi = t;
    }
    
    public int hitungLuas() {
        return alas * tinggi / 2;
    }

    public double hitungKeliling(){
        return alas + tinggi + Math.sqrt(alas * alas + tinggi * tinggi);
    }
}
