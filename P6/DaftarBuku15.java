package P6;

public class DaftarBuku15 {
    Buku15 listBk[] = new Buku15[5];
    int idx;

    void tambah(Buku15 m){
        if (idx < listBk.length){
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah Penuh!");
        }
    }

    void tampil() {
        for (Buku15 m : listBk) {
            m.tampilInformasi();
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listBk.length - 1; i++) {
            for (int j = 0; j < listBk.length - i - 1; j++) {
                if (listBk[j].stock > listBk[j + 1].stock) {
                    Buku15 tempBk = listBk[j];
                    listBk[j] = listBk[j + 1];
                    listBk[j + 1] = tempBk;
                }
            }
        }
    }

    // Percobaan 2

    void selectionSort() {
        for (int i = 0; i < listBk.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listBk.length; j++) {
                if (listBk[j].stock > listBk[idxMin].stock) { // lebih dari
                    idxMin = j; //awalnya i, biar fix diganti j
                }
            }

            //swap 
            Buku15 tempBuku = listBk[idxMin];
            listBk[idxMin] = listBk[i];
            listBk[i] = tempBuku;
        }
    }

    // Percobaan 3

    void  insertionSort() {
        for (int i = 1; i < listBk.length; i++) {
            Buku15 temp = listBk[i];
            int j = i;
            while (j > 0 && listBk[j - 1].stock > temp.stock) {
                listBk[j] = listBk[j - 1];
                j--;
            }
            listBk[j] = temp;
        }
    }

}
