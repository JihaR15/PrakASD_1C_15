package P10.Tugas;

import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("Pilih Menu: ");
        System.out.println("1. Antrion baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Antrian terbelakang");
        System.out.println("5. Cek Posisi Pembeli (Berdasarkan Nama)");
        System.out.println("6. Cek Semua Antrian");
        System.out.println("7. Cek Semua Data Pembeli");
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int kapasitas = sc15.nextInt();
        Queue15 antri15 = new Queue15(kapasitas);

        int pilih;

        do {
            menu();
            pilih = sc15.nextInt();
            sc15.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    String nama = sc15.nextLine();
                    System.out.print("Masukkan No. HP: ");
                    String noHP = sc15.nextLine();
                    Pembeli15 pil = new Pembeli15(nama, noHP);
                    antri15.enqueue(pil);
                    break;
                case 2:
                    Pembeli15 data = antri15.dequeue();
                    if (!"".equals(data.nama) && !"".equals(data.noHP)) {
                        System.out.println("Antrian yang keluar: " + data.nama + " " + data.noHP);
                        break;
                    }
                case 3:
                    antri15.peek();
                    break;
                case 4:
                    antri15.peekRear();
                    break;
                case 5:
                    System.out.print("Masukkan Nama: ");
                    String nama2 = sc15.nextLine();
                    antri15.peekPosition(nama2);
                    break;
                case 6:
                    antri15.print();
                    break;
                case 7:
                    antri15.daftarPembeli();
                    break;
            }
                    
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);

    }
}
