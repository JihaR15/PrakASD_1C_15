package P15;

import java.util.Scanner;

public class GraphMain15 {
    
    public static void main(String[] args) throws Exception {
        Graph15 gedung15 = new Graph15(6);
        Scanner sc15 = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update Jarak");
            System.out.println("7. Hitung Edge");
            System.out.println("8. Exit");
            System.out.print("Pilih menu: ");
            int pilihan = sc15.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan gedung asal: ");
                    int asal = sc15.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuan = sc15.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarak = sc15.nextInt();
                    gedung15.addEdge(asal, tujuan, jarak);
                    break;
                case 2:
                    System.out.print("Masukkan gedung asal: ");
                    int asal2 = sc15.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuan2 = sc15.nextInt();
                    gedung15.removeEdge(asal2, tujuan2);
                    break;
                case 3:
                    System.out.print("Masukkan gedung: ");
                    int gedung = sc15.nextInt();
                    gedung15.degree(gedung);
                    break;
                case 4:
                    gedung15.printGraph();
                    break;
                case 5:
                    System.out.print("Masukkan gedung asal: ");
                    int asal3 = sc15.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuan3 = sc15.nextInt();
                    if (gedung15.isAdjacent(asal3, tujuan3)) {
                        System.out.println("Gedung " + (char) ('A' + asal3) + " dan " + (char) ('A' + tujuan3) + " bertetangga");
                    } else {
                        System.out.println("Gedung " + (char) ('A' + asal3) + " dan " + (char) ('A' + tujuan3) + " tidak bertetangga");
                    } 
                    break;
                case 6:
                    System.out.print("Masukkan gedung asal: ");
                    asal = sc15.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = sc15.nextInt();
                    System.out.print("Masukkan jarak baru: ");
                    jarak = sc15.nextInt();
                    gedung15.updateJarak(asal, tujuan, jarak);
                    break;
                case 7:
                    System.out.println("Jumlah Edge: " + gedung15.hitungEdge());
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
        // gedung15.addEdge(0, 1, 50);
        // gedung15.addEdge(0, 2, 100);
        // gedung15.addEdge(1, 3, 70);
        // gedung15.addEdge(2, 3, 40);
        // gedung15.addEdge(3, 4, 60);
        // gedung15.addEdge(4, 5, 80);
        // gedung15.degree(0);
        // gedung15.printGraph();

        // gedung15.removeEdge(1,3);
        // gedung15.printGraph();
        
        // // System.out.println("Masukkan gedung asal dan tujuan (ketik 999 pada keduanya untuk keluar)");
        // // while (true) {
        // //     System.out.print("Masukkan gedung asal: ");
        // //     int asal = sc15.nextInt();
        // //     System.out.print("Masukkan gedung tujuan: ");
        // //     int tujuan = sc15.nextInt();

        // //     if (asal == 999 && tujuan == 999) {
        // //         System.out.println("Program berhenti");
        // //         break;
        // //     }

        // //     if (gedung15.isAdjacent(asal, tujuan)) {
        // //         System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
        // //     } else {
        // //         System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga");
        // //     } 

        // // Percobaan 2

        // GraphMatriks15 gdg15 = new GraphMatriks15(4);
        // gdg15.makeEdge(0, 1, 50);
        // gdg15.makeEdge(1, 0, 60);
        // gdg15.makeEdge(1, 2, 70);
        // gdg15.makeEdge(2, 1, 80);
        // gdg15.makeEdge(2, 3, 40);
        // gdg15.makeEdge(3, 0, 90);
        // gdg15.printGraph();   
        // System.out.println("Hasil Setelah penghapusan edge");
        // gdg15.removeEdge(2, 1);
        // gdg15.printGraph();

        // System.out.println("");
        // gdg15.degree(0);
        // System.out.println("");
        // gdg15.degree(1);
        // System.out.println("");
        // gdg15.degree(2);
        // System.out.println("");
        // gdg15.degree(3);
    }
    
}
