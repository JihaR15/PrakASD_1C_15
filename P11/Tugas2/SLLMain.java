package P11.Tugas2;

public class SLLMain {
    public static void main(String[] args) {
        queue singLL = new queue();

        singLL.enqueue(new mahasiswa(111, "Anton")); 
        singLL.print();
        singLL.enqueue(new mahasiswa(112, "Prita")); 
        singLL.print();
        singLL.enqueue(new mahasiswa(113, "Yusuf")); 
        singLL.print();
        singLL.dequeue(); 
        singLL.print();
        singLL.enqueue(new mahasiswa(114, "Doni")); 
        singLL.print();
        singLL.enqueue(new mahasiswa(115, "Sari")); 
        singLL.print();
        singLL.dequeue(); 
        singLL.print();
        
        
    }
}
