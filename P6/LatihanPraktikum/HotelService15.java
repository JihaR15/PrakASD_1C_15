package P6.LatihanPraktikum;

public class HotelService15 {
    Hotel15[] rooms = new Hotel15[5];
    int idx = 0;

    void tambah(Hotel15 h) {
        if (idx < rooms.length) {
            rooms[idx] = h;
            idx++;
        } else {
            System.out.println("Kamar penuh!");
        }
    }

    void tampilAll(){
        for (Hotel15 h : rooms) {
            h.tampilInformasi();
        }
        System.out.println("==========================");
    }

    void bubbleSort(int f){
        if (f == 1) {
            for (int i = 0; i < idx - 1; i++) {
                for (int j = 0; j < idx - i - 1; j++) {
                    if (rooms[j].harga > rooms[j + 1].harga) {
                        Hotel15 temp = rooms[j];
                        rooms[j] = rooms[j + 1];
                        rooms[j + 1] = temp;
                    }
                }
            }          
        } else if (f == 2) {
            for (int i = 0; i < idx - 1; i++) {
                for (int j = 0; j < idx - i - 1; j++) {
                    if (rooms[j].bintang < rooms[j + 1].bintang) {
                        Hotel15 temp = rooms[j];
                        rooms[j] = rooms[j + 1];
                        rooms[j + 1] = temp;
                    }
                }
            }
        }
    }


    void selectionSort(int f){
        if (f == 1) {
            for (int i = 0; i < idx - 1; i++) {
                int idxMin = i;
                for (int j = i + 1; j < idx; j++) {
                    if (rooms[j].harga < rooms[idxMin].harga) {
                        idxMin = j;
                    }
                }
                Hotel15 temp = rooms[idxMin];
                rooms[idxMin] = rooms[i];
                rooms[i] = temp;
            }
        } else if (f == 2) {
            for (int i = 0; i < idx - 1; i++) {
                int idxMin = i;
                for (int j = i + 1; j < idx; j++) {
                    if (rooms[j].bintang > rooms[idxMin].bintang) {
                        idxMin = j;
                    }
                }
                Hotel15 temp = rooms[idxMin];
                rooms[idxMin] = rooms[i];
                rooms[i] = temp;
            }
        }
    }
}

