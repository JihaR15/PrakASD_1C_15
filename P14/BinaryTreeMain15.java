package P14;

public class BinaryTreeMain15 {
    public static void main(String[] args) {
        BinaryTree15 bt = new BinaryTree15();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("inOrder Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.print("PostOrder Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find Node : " + bt.find(5));
        System.out.println("Delete Node 8");
        bt.delete(8);
        System.out.println("");
        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");

        System.out.println("\n== Tugas Praktikum ==");

        BinaryTree15 bt2 = new BinaryTree15();
        bt2.addRekursif(6);
        bt2.addRekursif(4);
        bt2.addRekursif(8);
        bt2.addRekursif(3);
        bt2.addRekursif(5);
        bt2.addRekursif(7);
        bt2.addRekursif(9);
        bt2.addRekursif(10);
        bt2.addRekursif(15);
        System.out.println("No. 1 (Add Rekursif) "); // no1
        System.out.print("PreOrder Traversal : ");
        bt2.traversePreOrder(bt2.root);
        System.out.println("");
        System.out.print("inOrder Traversal : ");
        bt2.traverseInOrder(bt2.root);
        System.out.println("");
        System.out.print("PostOrder Traversal : ");
        bt2.traversePostOrder(bt2.root);
        System.out.println("");
        System.out.println("\nNo. 2 Node Terkecil dan Terbesar"); // no2
        bt2.findMinMax();
        System.out.println("\nNo. 3 Print data yang ada di leaf"); // no3
        bt2.printLeaf();
        System.out.println("");
        System.out.println("\nNo. 4 "); // no4
        System.out.println("Jumlah Leaf : " + bt2.countLeaf());
        
    }
}
