// Package untuk kelas-kelas dalam aplikasi InvenBarang
package InvenBarang;

// Kelas Barang
public class Barang implements Comparable<Barang>{
    private String idPengumpul, namaPengumpul, beratBarang;

    // Constructor Barang
    public Barang(String idPengumpul, String namaPengumpul, String beratBarang) {
        this.idPengumpul = idPengumpul;
        this.namaPengumpul = namaPengumpul;
        this.beratBarang = beratBarang;
    }

    // Getter untuk mendapatkan nama pengumpul barang
    public String getNamaPengumpul() {
        return namaPengumpul;
    }

    // Implementasi metode compareTo untuk mengurutkan barang berdasarkan nama pengumpul
    @Override
    public int compareTo(Barang o) {
        return this.getNamaPengumpul().compareTo(o.getNamaPengumpul());
    }

    // Implementasi metode toString untuk menampilkan informasi barang
    @Override
    public String toString() {
        return "Barang [idPengumpul=" + idPengumpul +
                ", namaPengumpul=" + namaPengumpul + 
                ", beratBarang="
                + beratBarang +
                "]";
    }
}