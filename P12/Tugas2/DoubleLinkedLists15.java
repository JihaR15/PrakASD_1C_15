package P12.Tugas2;

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

    public void addFirst(daftarFilm15 item) {
        if (isEmpty()) {
            head = new Node15(null, item, null);
        } else {
            Node15 newNode = new Node15(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(daftarFilm15 item) {
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

    public void add(daftarFilm15 item, int index) throws Exception{
        if (isEmpty()){
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node15 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node15 newNode = new Node15(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node15 newNode = new Node15(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size(){
        return size;
    }

    public void clear(){
        head = null;
        size = 0;
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

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node15 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.next.prev = current.prev;
                current.prev.next = current.next;
            }
            size--;
        }
    }

    public void print(){
        if (!isEmpty()) {
            Node15 tmp = head;
            System.out.println("Cetak Data");
            int i = 1;
            while (tmp != null) {
                System.out.println("Data ke-" + i + ": ");
                System.out.println("ID: " + tmp.data.id );
                System.out.println(" Judul Film: " + tmp.data.judul );
                System.out.println(" Rating: " + tmp.data.rating );
                tmp = tmp.next;
                i++;
            }  
            System.out.println(" ");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void cariID(String id) throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong");
        } else {
            Node15 current = head;
            boolean found = false;
            int i = 0;
            while (current != null) {
                if (current.data.id.equals(id)) {
                    found = true;
                    break;
                }
                current = current.next;
                i++;
            }
            if (found) {
                System.out.println("Data ID Film " + id + " berada di node ke-" + i);
                System.out.println("Urutan ke-" + (i + 1));
                System.out.println("IDENTITAS: ");
                System.out.println("ID: " + current.data.id );
                System.out.println(" Judul Film: " + current.data.judul );
                System.out.println(" Rating: " + current.data.rating );
            } else {
                System.out.println("Data tidak ditemukan");
            }
        }
    }

    public void sortingRating(){
        Node15 current = head;
        Node15 index = null;
        daftarFilm15 temp;
        if (head == null) {
            return;
        } else {
            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data.rating < index.data.rating) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }


    public String getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong");
        }
        return head.data.judul;
    }

    public String getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Masih Kosong");
        }
        Node15 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data.judul;
    }

}
