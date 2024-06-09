package P15;

import java.util.Scanner;

public class GraphMain15 {
    
    public static void main(String[] args) throws Exception {
        Graph15 gedung15 = new Graph15(6);
        Scanner sc15 = new Scanner(System.in);

        gedung15.addEdge(0, 1, 50);
        gedung15.addEdge(0, 2, 100);
        gedung15.addEdge(1, 3, 70);
        gedung15.addEdge(2, 3, 40);
        gedung15.addEdge(3, 4, 60);
        gedung15.addEdge(4, 5, 80);
        gedung15.degree(0);
        gedung15.printGraph();

        gedung15.removeEdge(1,3);
        gedung15.printGraph();
        
        // System.out.println("Masukkan gedung asal dan tujuan (ketik 999 pada keduanya untuk keluar)");
        // while (true) {
        //     System.out.print("Masukkan gedung asal: ");
        //     int asal = sc15.nextInt();
        //     System.out.print("Masukkan gedung tujuan: ");
        //     int tujuan = sc15.nextInt();

        //     if (asal == 999 && tujuan == 999) {
        //         System.out.println("Program berhenti");
        //         break;
        //     }

        //     if (gedung15.isAdjacent(asal, tujuan)) {
        //         System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
        //     } else {
        //         System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak bertetangga");
        //     } 

        // Percobaan 2

        GraphMatriks15 gdg15 = new GraphMatriks15(4);
        gdg15.makeEdge(0, 1, 50);
        gdg15.makeEdge(1, 0, 60);
        gdg15.makeEdge(1, 2, 70);
        gdg15.makeEdge(2, 1, 80);
        gdg15.makeEdge(2, 3, 40);
        gdg15.makeEdge(3, 0, 90);
        gdg15.printGraph();   
        System.out.println("Hasil Setelah penghapusan edge");
        gdg15.removeEdge(2, 1);
        gdg15.printGraph();

    }
    
}
