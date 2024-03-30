package P6.LatihanPraktikum;

public class MainHotel15 {
    public static void main(String[] args) {
        HotelService15 service = new HotelService15();

        service.tambah(new Hotel15("Grand Mercure Malang Mirama", "Malang", 1200000, (byte) 5));
        service.tambah(new Hotel15("Harris Hotel & Conventions", "Malang", 800000, (byte) 4));
        service.tambah(new Hotel15("Atria Hotel", "Malang", 500000, (byte) 4));
        service.tambah(new Hotel15("Hotel Montana", "Malang", 100000, (byte) 2));
        service.tambah(new Hotel15("Ibis Styles", "Malang", 300000, (byte) 3));
        
        System.out.println("=============================");
        System.out.println("Daftar Hotel sebelum sorting:");
        service.tampilAll();

        System.out.println("\n==================================================");
        System.out.println("Sorting menggunakan Bubble Sort berdasarkan harga: (ASC)");
        service.bubbleSort();
        service.tampilAll();

        System.out.println("\n=======================================================");
        System.out.println("Sorting menggunakan Selection Sort berdasarkan bintang: (DESC)");
        service.selectionSort();
        service.tampilAll();
    }
}
