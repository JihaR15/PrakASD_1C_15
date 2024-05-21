package P12.Tugas2;

public class Node15 {
    daftarFilm15 data;
    Node15 prev, next;

    Node15(Node15 prev, daftarFilm15 data, Node15 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
