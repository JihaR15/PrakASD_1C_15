package P14;

public class BinaryTreeArrayMain15 {
    public static void main(String[] args) {
        BinaryTreeArray15 bta = new BinaryTreeArray15();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("\nInOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");
        System.out.print("PreOrder Traversal : ");
        bta.traversePreOrder(0);
        System.out.println("\n");
        System.out.print("PostOrder Traversal : ");
        bta.traversePostOrder(0);
        System.out.println("\n");

        bta.add(15); // absen
        bta.add(19); // umur
        System.out.println("Setelah menggunakan add : \n");
        System.out.print("InOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println("\n");
        System.out.print("PreOrder Traversal : ");
        bta.traversePreOrder(0);
        System.out.println("\n");
        System.out.print("PostOrder Traversal : ");
        bta.traversePostOrder(0);
        System.out.println("\n");

    }
}
