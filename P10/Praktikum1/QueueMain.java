package P10.Praktikum1;

import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        System.out.print("Masukkan Kapasitan Queue: ");
        int n = sc15.nextInt();

        Queue15 Q15 = new Queue15(n);

        int pilih;

        do{
            menu();
            pilih = sc15.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan data baru: ");
                    int dataMasuk = sc15.nextInt();
                    Q15.enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q15.dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        break;
                    }
                case 3:
                    Q15.print();
                    break;
                case 4:
                    Q15.peek();
                    break;
                case 5:
                    Q15.clear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
