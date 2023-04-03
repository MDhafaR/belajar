package Roti;

import java.util.LinkedList;
import java.util.Queue;

public class AntrianRoti {
    Queue<BreadItem> antrian;
    private int count;

    public AntrianRoti() {
        antrian = new LinkedList<>(); // (1)
    }

    // Kita diminta untuk melengkapi method di bawah ini, method ini berfungsi untuk menambahkan antrian ke dalam
    // Queue<> antrian yang kita miliki
    public void ambilNomor(int no, String nama, String jenis, int jumlah) {
        BreadItem item = new BreadItem(no, nama, jenis, jumlah);
        // Untuk menambahkan antrian, kita gunakan method Queue.add()
        antrian.add(new BreadItem(no, nama, jenis, jumlah)); // (2)

        // Sesuai soal, kita diminta untuk menghitung berapa banyak orang lagi pembeli ini harus menunggu. Nah kita
        // gunakan count yang sudah kita inisiasi di atas.
        if (count > 0) // (3)
            // Apabila ternyata orangnya lebih dari 0, maka kita keluarkan statement seperti ini :
            System.out.println("Anda menunggu " + count + " orang lagi");
        count++; // (4)
        // Setiap keluar dari if di atas, count kita tambahkan 1 agar sesuai dengan banyaknya pembeli
    }

    public BreadItem panggilan() {
        count--;
        // Fungsi count-- ini untuk mengurangi pembeli, karena apabila dipanggil, artinya antrian berkurang 1

        // Pada soal diminta untuk menggunakan method poll sebagai berikut : BreadItem breadItem = antrian.poll(); (5)
        // Sebenernya tidak perlu! Karena kita sudah memanggil BreadItem sebelumnya, jadi kita cukup jadikan bentuk
        // inline code agar lebih efisien
        return antrian.poll();
        // Method Queue.poll() ini berfungsi untuk memanggil, lalu menghapus pembeli paling depan yang mengantri pada
        // Queue antrian kita.
    }

    public void panggilanRoti() {
        BreadItem bread = panggilan();
        // Untuk pemanggilan, kita cukup panggil method panggilan() yang sudah kita buat, lalu berikan statement
        // seperti di bawah ini :
        System.out.println("Nomor " + bread.getNomorAntre() + " : " + "\nuntuk pembelian " + bread.getNama()
                + " sudah siap"); // (6)
        // Sehingga setiap kali dilakukan pemanggilan, maka program akan menyebutkan nomor antrian pelanggan dan
        // nama pesanan.
    }

    public void hapusAntrian() {
        antrian.clear(); // (7)
        // Method Queue.clear() ini adalah method untuk menghapus seluruh element yang berada dalam Queue antrian kita,
        // atau dengan kata lain, kita menghapus seluruh pembeli yang ada di list antrian kita
    }
}