package P6;

public class MainBuku15 {
    public static void main(String[] args) {
        Buku15 m = new Buku15(20215, "Algoritma", 2019, "Wahyuni", 5);
        Buku15 m1 = new Buku15(20214, "Big Data", 2020, "Susilo", 3);
        Buku15 m2 = new Buku15(20213, "Desain UI", 2021, "Supriadi", 6);
        Buku15 m3 = new Buku15(20211, "Web Programming",2022, "Pustaka Adi", 2);
        Buku15 m4 = new Buku15(20211, "Etika Mahasiswa", 2023, "Darmawan Adi", 1);
        DaftarBuku15 listBuku = new DaftarBuku15();
        listBuku.tambah(m);
        listBuku.tambah(m1);
        listBuku.tambah(m2);
        listBuku.tambah(m3);
        listBuku.tambah(m4);

        System.out.println("==========================");
        System.out.println("Data sebelum diurutkan");
        listBuku.tampil();

        System.out.println("==========================");
        System.out.println("Data setelah diurutkan secara Asc berdasarkan stock");
        listBuku.bubbleSort();
        listBuku.tampil();

        // Percobaan 2

        System.out.println("==========================");
        System.out.println("Data Setelah diurutkan secara Desc berdasarkan stock Menggunakan Selection Sort");
        listBuku.selectionSort();
        listBuku.tampil();

        // Percobaan 3

        System.out.println("==========================");
        System.out.println("Data Setelah diurutkan secara Desc berdasarkan stock Menggunakan Insertion Sort");
        listBuku.insertionSort();
        listBuku.tampil();
    }
}
