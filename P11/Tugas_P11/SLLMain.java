package P11.Tugas_P11;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();

        singLL.addFirst(new mahasiswa(111, "Anton")); //addfirst
        singLL.print();
        singLL.addLast(new mahasiswa(112, "Prita")); //addLast
        singLL.print();
        singLL.addLast(new mahasiswa(114, "Doni")); //addLast
        singLL.print();
        singLL.insertAfter(112, new mahasiswa(113, "Yusuf")); //insertAfter
        singLL.print();
        singLL.insertAt(4, new mahasiswa(115, "Sari")); //insertAt
        singLL.print();
        
        
    }
}
