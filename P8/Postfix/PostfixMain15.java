package P8.Postfix;

import java.util.Scanner;

public class PostfixMain15 {
    public static void main(String[] args) {
        Scanner sc15 = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan Ekspresi matematika (infix): ");
        Q = sc15.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();
        Postfix15 post = new Postfix15(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);

    }
}
