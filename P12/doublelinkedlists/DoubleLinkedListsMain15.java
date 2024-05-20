package P12.doublelinkedlists;

public class DoubleLinkedListsMain15 {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists15 dll15 = new DoubleLinkedLists15();
        dll15.print();
        System.out.println("Size : " + dll15.size());
        System.out.println("==========================");
        dll15.addFirst(3);
        dll15.addLast(4);
        dll15.addFirst(7);
        dll15.print();
        System.out.println("Size : " + dll15.size());
        System.out.println("==========================");
        dll15.add(40, 1);
        dll15.print();
        System.out.println("Size : " + dll15.size());
        System.out.println("==========================");
        dll15.clear();
        dll15.print();
        System.out.println("Size : " + dll15.size());

        // Percobaan 2

        System.out.println("==========================");
        dll15.addLast(50);
        dll15.addLast(40);
        dll15.addLast(10);
        dll15.addLast(20);
        dll15.print();
        System.out.println("Size : " + dll15.size());
        System.out.println("==========================");
        dll15.removeFirst();
        dll15.print();
        System.out.println("Size : " + dll15.size());
        System.out.println("==========================");
        dll15.removeLast();
        dll15.print();
        System.out.println("Size : " + dll15.size());
        System.out.println("==========================");
        dll15.remove(1);
        dll15.print();
        System.out.println("Size : " + dll15.size());
    }
}
