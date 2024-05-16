package P11.Tugas_P11;

public class SingleLinkedList {
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

    void addFirst(mahasiswa data) {
        Node ndInput = new Node(data, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(mahasiswa data) {
        Node ndInput = new Node(data, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int keyNIM, mahasiswa data){
        Node ndInput = new Node(data, null);
        Node temp = head;
        do{
            if(temp.data.nim == keyNIM){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while(temp != null);
    }

    void insertAt(int index, mahasiswa data){
        Node ndInput = new Node(data, null);
        if (index < 0) {
            System.out.println("Index Tidak Valid");
        } else if (index == 0) {
            addFirst(data);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node(data, temp.next);
            if (temp.next.next == null) {
                tail = ndInput;
            }
        }
    }

   

}
