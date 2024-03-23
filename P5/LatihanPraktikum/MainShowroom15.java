package P5.LatihanPraktikum;

public class MainShowroom15 {
    public static void main(String[] args) {
        Showroom15[] cars = {
            new Showroom15("BMW", "M2 Coupe", 2016, 6816, 728),
            new Showroom15("Ford", "Fiesta ST", 2014, 3921, 575),
            new Showroom15("Nissan", "370Z", 2009, 4360, 657),
            new Showroom15("Subaru", "BRZ", 2014, 4058, 609),
            new Showroom15("Subaru", "Impreza WRX STI", 2013, 6255, 703),
            new Showroom15("Toyota", "AE86 Trueno", 1986, 3700, 553),
            new Showroom15("Toyota", "86/GT86", 2014, 4180, 609),
            new Showroom15("Volkswagen", "Golf GTI", 2014, 4180, 631)
        };
        
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("| %-12s | %-15s | %-5s | %-17s | %-9s |\n", 
        "Merk", "Tipe", "Tahun", "Top Acceleration", "Top Power");
        System.out.println("--------------------------------------------------------------------------");
        for (Showroom15 car : cars) {
            System.out.printf("| %-12s | %-15s | %-5s | %-17s | %-9s |\n", 
            car.merk, car.tipe, car.tahun, car.top_acceleration, car.top_power);
        }
        System.out.println("--------------------------------------------------------------------------");

        int max = Showroom15.divideConquer(cars, 0, cars.length-1)[0];
        int min = Showroom15.divideConquer(cars, 0, cars.length-1)[1];
        double avg = Showroom15.rata2TopPower(cars);
        System.out.println("== Top Acceleration ==");
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
        System.out.println("== Top Power ==");
        System.out.println("Avg : " + avg);

    }
}
