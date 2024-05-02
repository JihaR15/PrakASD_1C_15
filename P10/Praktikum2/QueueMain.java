package P10.Praktikum2;

import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("Pilih Menu: ");
        System.out.println("1. Antrion baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc15.nextInt();
        Queue15 antri15 = new Queue15(jumlah);

        int pilih;

        do {
            menu();
            pilih = sc15.nextInt();
            sc15.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("No. Rekening: ");
                    String noRek = sc15.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc15.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = sc15.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc15.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc15.nextDouble();
                    Nasabah15 nb = new Nasabah15(noRek, nama, alamat, umur, saldo);
                    sc15.nextLine();
                    antri15.enqueue(nb);
                    break;
                case 2:
                    Nasabah15 data = antri15.dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) 
                    && data.umur != 0 && data.saldo != 0) {
                        System.out.println("Antrian yang keluar:" + data.norek + " " + data.nama + " " 
                        + data.alamat + " " + data.umur + " " + data.saldo);
                        break;
                    }
                case 3:
                    antri15.peek();
                    break;
                case 4:
                    antri15.print();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
