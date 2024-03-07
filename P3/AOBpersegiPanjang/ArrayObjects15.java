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

        //ARRAY 2D

        PersegiPanjang15[][] ppArray2D = new PersegiPanjang15[2][2];

        for (int i = 0; i < ppArray2D.length; i++) {
            for (int j = 0; j < ppArray2D[i].length; j++) {
                ppArray2D[i][j] = new PersegiPanjang15();
                System.out.println("Persegi Panjang baris ke-" + i + ", kolom ke-" + j);
                System.out.print("Masukkan panjang: ");
                ppArray2D[i][j].panjang = sc15.nextInt();
                System.out.print("Masukkan lebar: ");
                ppArray2D[i][j].lebar = sc15.nextInt();
            }
        }
        System.out.println("");

        for (int i = 0; i < ppArray2D.length; i++) {
            for (int j = 0; j < ppArray2D[i].length; j++) {
                System.out.println("Panjang: " + ppArray2D[i][j].panjang);
                System.out.println("Lebar: " + ppArray2D[i][j].lebar);
                System.out.println();
            }
        }

    }
}
