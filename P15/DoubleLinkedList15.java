package P15;

public class DoubleLinkedList15 {
    Node15 head;
    int size;

    public DoubleLinkedList15() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node15(null, item, jarak, null);
        } else {
            Node15 newNode = new Node15(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node15 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }


    public int size(){
        return size;
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public void print(){
        if (!isEmpty()) {
            Node15 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }  
            System.out.println("\nBerhasil Diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }


    public void remove(int index) {
       Node15 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                break;
            }
            current = current.next;
        }
        size--;
    }


    public int get(int index) throws Exception {
        if (isEmpty() || index < 0 || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node15 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    } 

    public void updateJarak(int index, int jarak) throws Exception {
        if (index < 0 || index >= size()) {
            throw new Exception("Index out of bounds");
        }
        Node15 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        temp.jarak = jarak;
    }
}

