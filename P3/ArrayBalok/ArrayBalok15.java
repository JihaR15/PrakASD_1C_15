package P3.ArrayBalok;

public class ArrayBalok15 {
    public static void main(String[] args) {
        Balok15[] blArray = new Balok15[3];

        blArray[0] = new Balok15(100, 30, 12);
        blArray[1] = new Balok15(120, 40, 15);
        blArray[2] = new Balok15(210, 50, 25);

        for (int i = 0; i < blArray.length; i++) {
            System.out.println("Volume balok ke-" + i + ": " + blArray[i].hitungVolume());
        }

        System.out.println("Luas permukaan balok ke-0: " + blArray[0].hitungLuasPersegi(100, 30));
    }
}
