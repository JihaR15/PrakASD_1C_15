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

}
