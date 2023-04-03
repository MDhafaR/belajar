package Roti;

public class Main {
    public static void main(String[] args) {
        AntrianRoti antrianRoti = new AntrianRoti();
        // Pada soal diminta untuk menggunakan method poll sebagai berikut : BreadItem item;
        // Sebenarnya tidak perlu memanggil BreadItem! Itu tidak efisien, karena kita sudah menggunakan antreanRoti

        antrianRoti.ambilNomor(1,"Roti Upin","roti manis",10);
        antrianRoti.ambilNomor(2,"Roti Ipin","roti manis",5);
        antrianRoti.ambilNomor(3,"Roti Ismail","roti manis",4);

        antrianRoti.panggilanRoti();
        antrianRoti.ambilNomor(4,"Roti Santi","roti manis",2);
    }
}