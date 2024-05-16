package P11.Tugas2;

public class queue {
    Node head, tail;

    boolean isEmpty() {
        return head == null;
    }

    void print(){
        if (!isEmpty()) {
            Node tmp = head;
            System.out.print("Isi Linked List:   ");
            while (tmp != null){
                System.out.print(tmp.data.nim + " " + tmp.data.nama + "  \t");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked List Kosong");
        }
    }


    void enqueue(mahasiswa data) {
        Node ndInput = new Node(data, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void dequeue(){
        if(isEmpty()){
            System.out.println("Linked List masih kosong." + "tidak dapat dihapus");
        } else if (head == tail){
            head = tail = null;
        } else {
            head = head.next;
        }
    }



   

}
