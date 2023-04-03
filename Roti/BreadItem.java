package Roti;

// Kita perlu membuat Plain Old Java Object (POJO) sebagai Object class yang membawa data object dari element-element
// yang akan kita gunakan
public class BreadItem {
    private int nomorAntre, jumlah;
    private String nama, jenis;

    // Buatkan Constructor untuk menyimpan parameter yang akan digunakan sebagai method untuk menyimpan nilai
    public BreadItem(int nomorAntre, String nama, String jenis, int jumlah) {
        this.nomorAntre = nomorAntre;
        this.jumlah = jumlah;
        this.nama = nama;
        this.jenis = jenis; 
    }

    // Buatkan toString() method sebagai kalimat yang akan keluar saat object kita lakukan pemanggilan (kata-katanya
    // bebas, tidak harus sama)
    @Override
    public String toString() {
        return " : ";
    }

    // Buatkan Getter sebagai alat yang akan kita gunakan saat memanggil element ini
    public String getNama() {
        return nama;
    }

    public int getNomorAntre() {
        return nomorAntre;
    }
}