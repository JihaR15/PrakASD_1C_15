package P10.Tugas;

public class Queue15 {
    Pembeli15[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public Queue15(int n) {
        max = n;
        antrian = new Pembeli15[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(Pembeli15 antri){
        if (isFull()) {
         System.out.println("Queue sudah penuh");
        } else {
            if (isEmpty()) {
                 front = rear = 0;
            } else {
                 if (rear == max - 1) {
                     rear = 0;
                 } else {
                     rear++;
                 }
            }
            antrian[rear] = antri;
            size++;
        }
     }
 
     public Pembeli15 dequeue(){
         Pembeli15 dt = new Pembeli15();
         if (isEmpty()) {
             System.out.println("Queue masih kosong");
         } else {
             dt = antrian[front];
             size--;
             if (isEmpty()) {
                 front = rear = -1;
             } else {
                 if (front == max - 1) {
                     front = 0;
                 } else {
                     front++;
                 }
             }
         }
         return dt;
     }

    public void print(){
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHP);
            System.out.println("Jumlah Elemen = " + size);
        }
    }

    public void peek(){
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + antrian[front].nama + " " + antrian[front].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear(){
        if (!isEmpty()) {
            System.out.println("Elemen terbelakang: " + antrian[rear].nama + " " + antrian[rear].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(String nama){
        if (!isEmpty()) {
            int i = front;
            while (i != rear) {
                if (antrian[i].nama.equals(nama)) {
                    System.out.println("Elemen pada posisi ke-" + (i + 1));
                }
                i = (i + 1) % max;
            }
            if (antrian[i].nama.equals(nama)) {
                System.out.println("Elemen pada posisi ke-" + (i + 1));
            }
        } else {
            System.out.println("Queue masih kosong");
        }   
    }

    public void daftarPembeli(){
        if (!isEmpty()) {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i]);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    
}
