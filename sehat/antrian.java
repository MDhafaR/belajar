package sehat;
 //ini berisi sebuah kelas bernama "antrian" yang berfungsi untuk mengelola antrian pasien pada tiga jenis dokter yang berbeda yaitu Dokter Umum, Dokter Anak, dan Dokter Gigi.
import java.util.LinkedList;
import java.util.Queue;

public class antrian {
    
    // Deklarasi tiga buah Queue untuk masing-masing dokter
    static Queue<DoktorUmum> dokterUmum = new LinkedList<>();
    static Queue<DokterAnak> dokterAnak = new LinkedList<>();
    static Queue<DokterGigi> dokterGigi = new LinkedList<>();

    // Metode "ambilAntrian" digunakan untuk menambahkan pasien ke dalam antrian dokter yang sesuai dengan nomor antrian yang dimilikinya.
    public static void ambilAntrian(String no, String nama, String jenis) {
        // Ambil karakter pertama dari nomor antrian untuk menentukan dokter yang akan menangani pasien tersebut
        String nomorAntrian = no.substring(0, 1);

        switch(nomorAntrian){

            // Jika nomor antrian merupakan antrian untuk Dokter Umum
            case "A" -> {
                // Jika antrian untuk dokter umum sudah ada pasien yang menunggu, maka pasien akan ditambahkan ke dalam antrian dan akan ditampilkan pesan berisi jumlah orang yang masih menunggu.
                if (dokterUmum.size() > 0) {
                    System.out.println(nama + ", Anda Menunggu "+ dokterUmum.size()+ " Orang lagi");
                    dokterUmum.offer(new DoktorUmum(no, nama, jenis));
                } else { 
                    // Jika antrian untuk dokter umum masih kosong, maka pasien akan langsung ditambahkan ke dalam antrian.
                    dokterUmum.offer(new DoktorUmum(no, nama, jenis));
                }
            }
    
            // Jika nomor antrian merupakan antrian untuk Dokter Anak
            case "B" -> {
                // Jika antrian untuk dokter anak sudah ada pasien yang menunggu, maka pasien akan ditambahkan ke dalam antrian dan akan ditampilkan pesan berisi jumlah orang yang masih menunggu.
                if (dokterAnak.size() > 0) {
                    System.out.println(nama + ", Anda Menunggu "+ dokterAnak.size()+ " Orang lagi");
                    dokterAnak.offer(new DokterAnak(no, nama, jenis));
                } else { 
                    // Jika antrian untuk dokter anak masih kosong, maka pasien akan langsung ditambahkan ke dalam antrian.
                    dokterAnak.offer(new DokterAnak(no, nama, jenis));
                }
            }
    
            // Jika nomor antrian merupakan antrian untuk Dokter Gigi
            case "C" -> {
                // Jika antrian untuk dokter gigi sudah ada pasien yang menunggu, maka pasien akan ditambahkan ke dalam antrian dan akan ditampilkan pesan berisi jumlah orang yang masih menunggu.
                if (dokterGigi.size() > 0) {
                    System.out.println(nama + ", Anda Menunggu "+ dokterGigi.size()+ " Orang lagi");
                    dokterGigi.offer(new DokterGigi(no, nama, jenis));
                } else { 
                    // Jika antrian untuk dokter gigi masih kosong, maka pasien akan langsung ditambahkan ke dalam antrian.
                    dokterGigi.offer(new DokterGigi(no, nama, jenis));
                }
            }
        }
    }

    // Metode "panggilan" digunakan untuk mengeluarkan pasien dari antrian dokter yang sesuai dengan nomor antrian yang dimilikinya.
    public static void panggilan(String nomor) {
        // Ambil karakter pertama dari nomor antrian untuk menentukan dokter yang akan menangani pasien tersebut
        String nomorAntrian = nomor.substring(0, 1);

        switch(nomorAntrian){

            // Jika nomor antrian merupakan antrian untuk Dokter Umum
        case "A" -> { 
            // Jika nomor antrian sama dengan "A"
            if (dokterUmum.size() <= 0) { // Jika antrian untuk dokter umum masih kosong
                System.out.println("Antrian masih kosong");
            } else { 
                // Jika antrian dokter umum tidak kosong
                dokterUmum.remove(); // Hapus nomor antrian dari antrian dokter umum
                System.out.println("Nomor " + nomor + " untuk dokter umum masuk ke ruang 1");
            }
        }
    
        case "B" -> { 
            // Jika nomor antrian sama dengan "B"
            if (dokterAnak.size() <= 0) { 
                // Jika antrian untuk dokter anak masih kosong
                System.out.println("Antrian masih kosong");
            } else { 
                // Jika antrian dokter anak tidak kosong
                dokterAnak.remove(); // Hapus nomor antrian dari antrian dokter anak
                System.out.println("Nomor " + nomor + " untuk dokter anak masuk ke ruang 1");
            }
        }
    
        case "C" -> { 
            // Jika nomor antrian sama dengan "C"
            if (dokterGigi.size() <= 0) { 
                // Jika antrian untuk dokter gigi masih kosong
                System.out.println("Antrian masih kosong");
            } else { 
                // Jika antrian dokter gigi tidak kosong
                dokterGigi.remove(); 
                // Hapus nomor antrian dari antrian dokter gigi
                System.out.println("Nomor " + nomor + " untuk dokter gigi masuk ke ruang 1");
            }
        }
    }
}
// Method untuk menghapus ketiga antrian yang ada
public void hapusAntrian() { 
    dokterUmum.clear(); // Kosongkan antrian dokter umum
    dokterAnak.clear(); // Kosongkan antrian dokter anak
    dokterGigi.clear(); // Kosongkan antrian dokter gigi
}
}