package P3.AOBpersegiPanjang;

import java.util.Scanner;
public class ArrayObjects15 {
    public static void main(String[] args) {
        PersegiPanjang15[] ppArray = new PersegiPanjang15[3];
        Scanner sc15 = new Scanner(System.in);

        
        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang15();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc15.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc15.nextInt();
        }
        
        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi Panjang ke-" + i + "\nPanjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }

    }
}
