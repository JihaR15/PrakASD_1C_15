package P1;
import java.util.Scanner;

public class perulangan15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        System.out.print("Masukkan NIM : ");
        String nim = sc15.nextLine();

        String duaDigit = nim.substring(nim.length() - 2);

        int n = Integer.parseInt(duaDigit);

        if (n < 10) {
            n+= 10;
        }
        
        System.out.println("===============================");
        System.out.println("n = " + n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }

        System.out.println();
    }
}
