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

    // public int FindSeqSearch(int cari) {
    //     int posisi = -1;
    //     for (int i = 0; i < listBK.length; i++) {
    //         if (listBK[i].kodeBuku.equals(cari)) {
    //             posisi = i;
    //             break;
    //         }
    //     }
    //     return posisi;
    // }


    // public void TampilPosisi(int x, int pos) {
    //     if (pos!= -1) {
    //         System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
    //     } else {
    //         System.out.println("Data : " + x + " tidak ditemukan");
    //     }
    // }

    // public void TampilData(int x, int pos) {
    //     if (pos!= -1) {
    //         System.out.println("Kode Buku\t : " + x);
    //         System.out.println("Judul Buku\t : " + listBK[pos].judulBuku);
    //         System.out.println("Tahun Terbit\t : " + listBK[pos].tahunTerbit);
    //         System.out.println("Pengarang\t : " + listBK[pos].pengarang);
    //         System.out.println("Stock\t\t : " + listBK[pos].stock);
    //     } else {
    //         System.out.println("Data : " + x + " tidak ditemukan");
    //     }
    // }

    // PERCOBAAN 1 : pertanyaan 3
    
    // public Buku15 FindBuku(int cari) {
    //     int posisi = -1;
    //     for (int i = 0; i < listBK.length; i++) {
    //         if (listBK[i].kodeBuku == cari) {
    //             posisi = i;
    //             break;
    //         }
    //     }
    //     return listBK[posisi];
    // }

    // PERCOBAAN 2

    // public int FindBinarySearch(String cari, int left, int right) {
    //     int mid;
    //     if (right >= left) {
    //         mid = (left + right) / 2;

    //         int comparison = cari.compareTo(listBK[mid].kodeBuku);
    //         if (comparison == 0) {
    //             return (mid);
    //         } else if (comparison < 0) { //Descending
    //             return FindBinarySearch(cari, left, mid - 1);
    //         } else {
    //             return FindBinarySearch(cari, mid + 1, right);
    //         }
    //     }
    //     return -1;  
    // }

    // ===== Latihan Praktikum ======= // 

    public void TampilPosisi(String x, int pos) {
        if (pos!= -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }

    public void TampilData(String x, int pos) {
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

    public Buku15 FindBuku(String cari) {
        int posisi = -1;
        for (int i = 0; i < listBK.length; i++) {
            if (listBK[i].kodeBuku.equals(cari)) {
                posisi = i;
                break;
            }
        }
        return listBK[posisi];
    }

    public int FindSeqSearchString(String cari) {  
            int posisi = -1;
            for (int i = 0; i < listBK.length; i++) {
                if (listBK[i].kodeBuku.equals(cari)) {
                    posisi = i;
                    break;
                }
            }
            return posisi;
        }

    public int FindBinarySearchString(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;

            int comparison = cari.compareTo(listBK[mid].kodeBuku);
            if (comparison == 0) {
                return (mid);
            } else if (comparison > 0) { //descending
                return FindBinarySearchString(cari, left, mid - 1);
            } else {
                return FindBinarySearchString(cari, mid + 1, right);
            }
        }
        return -1;  
    }

    // ===== Latihan Praktikum 2 ======= //

    public void insertionSort() {
        for (int i = 1; i < listBK.length; i++) {
            Buku15 temp = listBK[i];
            int j = i - 1;
            while (j >= 0 && listBK[j].judulBuku.compareTo(temp.judulBuku) > 0) {
                listBK[j +1] = listBK[j];
                j--;
            }
            listBK[j + 1] = temp;
        }
    }

    public int FindSeqSearchJudul(String cari) {
        int posisi = -1;
        for (int i = 0; i < listBK.length; i++) {
            if (listBK[i].judulBuku.equals(cari)) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearchJudul(String cari) {
        int left = 0;
        int right = listBK.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = cari.compareTo(listBK[mid].judulBuku);
            
            if (comparison == 0) {
                return mid;
            } else if (comparison < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public void TampilPosisiJudul(String x, int pos) {
        if (pos!= -1) {
            System.out.println("Data : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }

    public void TampilDatajudul(String x, int pos) {
        if (pos!= -1) {
            System.out.println("Kode Buku\t : " + listBK[pos].kodeBuku);
            System.out.println("Judul Buku\t : " + x);
            System.out.println("Tahun Terbit\t : " + listBK[pos].tahunTerbit);
            System.out.println("Pengarang\t : " + listBK[pos].pengarang);
            System.out.println("Stock\t\t : " + listBK[pos].stock);
        } else {
            System.out.println("Data : " + x + " tidak ditemukan");
        }
    }

    public boolean duplikatJudul(String cari) {
        int count = 0;
        for (int i = 0; i < listBK.length - 1; i++) {
            if (listBK[i].judulBuku.equals(cari)) {
                count++;
            }
            if (count > 1) {
             return true;   
            }
        }
        return false;
    }
}
