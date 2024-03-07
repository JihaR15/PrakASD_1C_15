package P3.ArrayBalok;

public class sgArray15 {
    public static void main(String[] args) {
        Segitiga15[] sgArray = new Segitiga15[4];

        sgArray[0] = new Segitiga15(10, 4);
        sgArray[1] = new Segitiga15(20, 10);
        sgArray[2] = new Segitiga15(15, 6);
        sgArray[3] = new Segitiga15(25, 10);

        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("Luas segitiga ke-" + i + ": " + sgArray[i].hitungLuas());
            System.out.println("Keliling segitiga ke-" + i + ": " + sgArray[i].hitungKeliling());
        }
    }
}
