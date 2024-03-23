package P5.LatihanPraktikum;

public class Showroom15 {
    String merk;
    String tipe;
    int tahun;
    int top_acceleration;
    int top_power;

    Showroom15(String merk, String tipe, int tahun, int top_acceleration, int top_power){
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_acceleration = top_acceleration;
        this.top_power = top_power;
    }
    
    static int[] divideConquer(Showroom15[] cars, int low, int high){
        if (low == high) {
            return new int[]{cars[low].top_acceleration, cars[low].top_acceleration};
        } else {
            int mid = (low + high) / 2;
            int[] lsum = divideConquer(cars, low, mid);
            int[] rsum = divideConquer(cars, mid + 1, high);
        
            return new int[]{Math.max(lsum[0], rsum[0]), Math.min(lsum[1], rsum[1])};
        }
    }

    public static double rata2TopPower(Showroom15[] cars) {
        int totalPower = 0;
        for (int i = 0; i < cars.length; i++) {
            totalPower += cars[i].top_power;
        }
        return (double) totalPower / cars.length;
    }
}
