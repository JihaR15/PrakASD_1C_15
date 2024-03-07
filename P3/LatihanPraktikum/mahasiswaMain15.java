package P3.LatihanPraktikum;

public class mahasiswaMain15 {
    public static void main(String[] args) {
        mahasiswa15[] mhs = new mahasiswa15[3];
        
        mahasiswa15.inputDataMhs(mhs);
        mahasiswa15.tampilkanDataMHS(mhs);

        System.out.println("Rata-rata IPK: " + mahasiswa15.hitungRataIpk(mhs));
        mahasiswa15.tampilkanDataMaxIpk(mhs);
    }
}
