package TestSearching.P7;

public class PencarianBuku15 {
    Buku15 listBK[] = new Buku15[5];
    int idx = 0;

    void tambah(Buku15 m) {
        if (idx < listBK.length) {
            listBK[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Buku15 m : listBK) {
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int i = 0; i < listBK.length; i++) {
            if (listBK[i].kodeBuku==cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public void TampilPosisi(int x, int pos) {
        if (pos!= -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos) {
        if (pos!= -1) {
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul Buku\t : " + listBK[pos].judulBuku);
            System.out.println("Tahun Terbit\t : " + listBK[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBK[pos].pengarang);
            System.out.println("Stock\t\t : " + listBK[pos].stock);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }

}
