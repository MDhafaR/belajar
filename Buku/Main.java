// Package untuk kelas-kelas dalam aplikasi Buku
package Buku;

// Mengimpor kelas-kelas yang diperlukan
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

// Kelas Main
public class Main {

    static LinkedList<DataBuku> listComic = new LinkedList<>(); // Mendeklarasikan linked list yang akan digunakan untuk menyimpan data buku

    public static void main(String[] args) {
        // Menambahkan data buku ke dalam linked list
        listComic.add(new DataBuku(15,"Hai, Miiko!", "Eriko Ono", "M&c! publisher"));
        listComic.add(new DataBuku(10,"Hai, Miiko!", "Eriko Ono", "M&c! publisher"));
        listComic.add(new DataBuku(14,"Hai, Miiko!", "Eriko Ono", "M&c! publisher"));
        listComic.add(new DataBuku(5,"Hai, Miiko!", "Eriko Ono", "M&c! publisher"));
        listComic.add(new DataBuku(13,"Hai, Miiko!", "Eriko Ono", "M&c! publisher"));
        listComic.add(new DataBuku(7,"Hai, Miiko!", "Eriko Ono", "M&c! publisher"));
        listComic.add(new DataBuku(8,"Hai, Miiko!", "Eriko Ono", "M&c! publisher"));
        listComic.add(new DataBuku(6,"Hai, Miiko!", "Eriko Ono", "M&c! publisher"));

        int n = listComic.size(); // Mengambil jumlah data buku yang ada dalam linked list

        // Menampilkan data buku sebelum di-sorting
        System.out.println("SEBELUM SORTING YGY");
        System.out.println("((===========================================================))");
        System.out.println("| JILID | " + " JUDUL | " + " PENGARANG |" + " PENERBIT |" + "\n" + "((===========================================================))");

        for (int i = 0; i < n; i++) {
            DataBuku data = listComic.get(i);
            System.out.println(data );
        }
        System.out.println("((===========================================================))");

        // Sorting data buku berdasarkan jilid
        for(int passedNum = 1; passedNum < n; passedNum++){
            for(int f = 0; f < n - passedNum; f++){
                if (listComic.get(f).jilid > listComic.get(f+1).jilid){
                    DataBuku sementara = listComic.get(f+1);
                    listComic.set(f+1, listComic.get(f));
                    listComic.set(f, sementara);
                }
            }
        }

        // Menampilkan data buku setelah di-sorting
        System.out.println("SETELAH SORTING YGY");
        System.out.println("((===========================================================))");
        System.out.println("| JILID | " + " JUDUL | " + " PENGARANG |" + " PENERBIT |" + "\n" + "((===========================================================))");

        for (int i = 0; i < n; i++) {
            DataBuku data = listComic.get(i);
            System.out.println(data );
        }
        System.out.println("((===========================================================))");
    }
}