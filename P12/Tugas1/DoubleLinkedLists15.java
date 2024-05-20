package P12.Tugas1;

public class DoubleLinkedLists15 {
    Node15 head;
    int size;

    public DoubleLinkedLists15() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(penerima15 item) {
        if (isEmpty()) {
            head = new Node15(null, item, null);
        } else {
            Node15 newNode = new Node15(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(penerima15 item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node15 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node15 newNode = new Node15(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public int size(){
        return size;
    }

    public void print(){
        if (!isEmpty()) {
            Node15 tmp = head;
            System.out.println("|" + "No.\t|" + "Nama" + "   \t|");
            while (tmp != null) {
                System.out.print("|" + tmp.data.nomorAntrian + "\t|" + tmp.data.NamaPenerima + "   \t|");
                System.out.println();
                tmp = tmp.next;
            }  
        } else {
            System.out.println("Antrian Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong, tidak dapat dihapus");
        } else if (size == 1){
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong, tidak dapat dihapus");
        } else if (head.next == null){
            head = null;
            size--;
            return;
        }
        Node15 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

}
