// Package untuk kelas-kelas dalam aplikasi inventaris barang
package InvenBarang;

// Mengimpor kelas-kelas yang diperlukan
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Kelas utama Main
public class Main {
    
    // Method main untuk menjalankan program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Barang> listBarang = new ArrayList<>();

        // Menambahkan beberapa data barang ke dalam ArrayList
        listBarang.add(new Barang("123", "Nina", "45Kg"));
        listBarang.add(new Barang("111", "ucok", "145Kg"));
        listBarang.add(new Barang("222", "badu", "50Kg"));
        listBarang.add(new Barang("333", "eko", "100Kg"));

        boolean pilihan = true;

        // Melakukan perulangan untuk menampilkan menu dan menerima input
        while (pilihan) {
            menu(); // Memanggil method menu untuk menampilkan pilihan menu
            switch (input.nextInt()) {
                case 1:
                    System.out.println("Masukkan id pengumpul, nama pengumpul, dan berat barang!!");
                    String id = input.next();
                    String nama = input.next();
                    String berat = input.next();
                    listBarang.add(new Barang(id, nama, berat)); // Menambahkan data barang baru ke dalam ArrayList
                    break;
                case 2:
                    cetakList(listBarang); // Memanggil method cetakList untuk menampilkan semua data barang
                    System.out.println("Total barang : " + listBarang.size()); // Menampilkan total jumlah barang
                    break;
                case 3:
                    System.out.println("Masukkan nama pengumpul yang ingin dicari: ");
                    String namaPengumpul = input.next();
                    Barang barangResult = cariBarang(listBarang, namaPengumpul); // Memanggil method cariBarang untuk mencari data barang berdasarkan nama pengumpul
                    System.out.print("Data pengumpul berdasarkan nama : " + namaPengumpul);
                    System.out.println(" adalah : \n" + barangResult); // Menampilkan hasil pencarian barang
                    break;
                default:
                    pilihan = false; // Menghentikan perulangan jika input tidak valid
                    break;
            }
        }
    }

    // Method menu untuk menampilkan pilihan menu
    public static void menu() {
        System.out.println("--Aplikasi inventaris pengumpul dan jumlah barang--");
        System.out.println("Pilihan menu : ");
        System.out.println("1. Tambah data pengumpul baru");
        System.out.println("2. Lihat total barang yang dikumpul");
        System.out.println("3. Cari data berdasarkan nama");
        System.out.print("Input anda : ");
    }

    // Method cetakList untuk menampilkan semua data barang dalam ArrayList
    private static void cetakList(ArrayList<Barang> arrayList) {
        for (Barang brg : arrayList) {
            System.out.println(brg);
        }
        System.out.println();
    }

    // Method cariBarang untuk mencari data barang berdasarkan nama pengumpul
    private static Barang cariBarang(ArrayList<Barang> listBarang, String nama) {
        Collections.sort(listBarang); // Mengurutkan ArrayList berdasarkan nama pengumpul menggunakan metode sort()
        int index = Collections.binarySearch(listBarang, new Barang(null, nama, null)); // Mencari index data barang yang dicari menggunakan metode binarySearch()
        Barang result = listBarang.get(index); // Mengambil data barang hasil pencarian dari ArrayList
        return result; // Mengembalikan data barang hasil pencarian
    }
}