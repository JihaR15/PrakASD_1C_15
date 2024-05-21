package P12.Tugas2;

import java.util.Scanner;

public class main15 {
    public static void main(String[] args) throws Exception {

        DoubleLinkedLists15 dll15 = new DoubleLinkedLists15();

        Scanner sc15 = new Scanner(System.in);
        
        while (true) {
            System.out.println("===========================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("===========================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("===========================");

            int pilih = sc15.nextInt();
            sc15.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.print("ID Film: ");
                    String id = sc15.nextLine();
                    System.out.print("Judul Film: ");
                    String judul = sc15.nextLine();
                    System.out.print("Rating Film: ");
                    double rating = sc15.nextDouble();
                    sc15.nextLine();
                    dll15.addFirst(new daftarFilm15(id, judul, rating));
                    System.out.println("Data Film Berhasil Ditambahkan");
                    break;
                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    System.out.print("ID Film: ");
                    String id2 = sc15.nextLine();
                    System.out.print("Judul Film: ");
                    String judul2 = sc15.nextLine();
                    System.out.print("Rating Film: ");
                    double rating2 = sc15.nextDouble();
                    sc15.nextLine();
                    dll15.addLast(new daftarFilm15(id2, judul2, rating2));
                    System.out.println("Data Film Berhasil Ditambahkan");
                    break;
                case 3:
                    System.out.println("Masukkan Data Film Pada Posisi Tertentu");
                    System.out.print("ID Film: ");
                    String id3 = sc15.nextLine();
                    System.out.print("Judul Film: ");
                    String judul3 = sc15.nextLine();
                    System.out.print("Rating Film: ");
                    double rating3 = sc15.nextDouble();
                    sc15.nextLine();
                    System.out.print("Data Film ini akan Masuk di urutan ke-(dimulai dari 1): ");
                    int index = sc15.nextInt();
                    sc15.nextLine();
                    dll15.add(new daftarFilm15(id3, judul3, rating3), (index-1) );;
                    System.out.println("Data Film Berhasil Ditambahkan Pada urutan ke- " + index);
                    break;
                case 4:
                    System.out.println("Data Film Pertama: "+ dll15.getFirst() +"\nBerhasil Dihapus");
                    dll15.removeFirst();
                    break;
                case 5:
                    System.out.println("Data Film Terakhir: "+ dll15.getLast() +"\n Berhasil Dihapus");
                    dll15.removeLast();
                    break;
                case 6:
                    dll15.print();
                    System.out.println("Masukkan Film urutan ke berapa Yang Ingin Dihapus");
                    System.out.print("No: ");
                    int index2 = sc15.nextInt();
                    System.out.println("Data Film Pada urutan ke- " + index2 + " Berhasil Dihapus");
                    dll15.remove(index2-1);
                    break;
                case 7:
                    dll15.print();
                    break;
                case 8:
                    System.out.println("Masukkan ID Film Yang Ingin Dicari");
                    String id4 = sc15.nextLine();
                    dll15.cariID(id4);
                    break;
                case 9:
                    dll15.sortingRating();
                    dll15.print();
                    break;
                case 10:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
            
        }
    }
}
