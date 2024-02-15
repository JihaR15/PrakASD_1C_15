package P1;

public class fungsi15 {
    private static int[][] stock = {
        {1, 10, 5, 15, 7},
        {2, 6, 11, 9, 12},
        {3, 2, 10, 10, 5},
        {4, 5, 7, 12, 9}
    };

    private static int[] harga = {75000, 50000, 60000, 10000};

    public static void main(String[] args) {
        System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual:");
        for (int i = 0; i < stock.length; i++) {
            int totalPendapatan = hitungPendapatanPerCabang(stock[i]);
            System.out.println("Cabang " + stock[i][0] + ": " + totalPendapatan);
        }

        System.out.println("\nJumlah Stock setiap bunga pada cabang Royal Garden 4 sebelum minus:");
        int[] stokCabang4 = StokPerCabang(4);
        System.out.println("Aglonema: " + stokCabang4[0]);
        System.out.println("Keladi: " + stokCabang4[1]);
        System.out.println("Alocasia: " + stokCabang4[2]);
        System.out.println("Mawar: " + stokCabang4[3]);

        kurangiStokBungaMati(stokCabang4);

        System.out.println("\nJumlah Stock setiap bunga pada cabang Royal Garden 4 setelah minus:");
        System.out.println("Aglonema: " + stokCabang4[0]);
        System.out.println("Keladi: " + stokCabang4[1]);
        System.out.println("Alocasia: " + stokCabang4[2]);
        System.out.println("Mawar: " + stokCabang4[3]);

    }

    public static int hitungPendapatanPerCabang(int[] stokCabang) {
        int totalPendapatan = 0;
        for (int i = 1; i < stokCabang.length; i++) {
            totalPendapatan += stokCabang[i] * harga[i - 1];
        }
        return totalPendapatan;
    }

    public static int[] StokPerCabang(int cabang) {
        int[] stokPerCabang = new int[4];
        for (int i = 0; i < stock.length; i++) {
            if (stock[i][0] == cabang) {
                for (int j = 1; j < stock[i].length; j++) {
                    stokPerCabang[j - 1] = stock[i][j];
                }
                break;
            }
        }
        return stokPerCabang;
    }

    public static void kurangiStokBungaMati(int[] stokCabang) {
        // Rincian pengurangan stok karena bunga mati
        int[] penguranganStok = {-1, -2, 0, -5};
        for (int i = 0; i < stokCabang.length; i++) {
            stokCabang[i] += penguranganStok[i];
        }
    }


}
