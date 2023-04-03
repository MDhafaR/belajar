package AndForward;

import java.util.Stack;

// Untuk program ini, kita tidak perlu membuat Plain Old Java Object (POJO) sebagai Generic class yang membawa data object
// dari element-element yang akan kita gunakan, karena sudah semua di implementasikan di Object kelas ini
public class BackForward {
    // Inisialisasi Stack Object class String
    private Stack<String> backStack;
    private Stack<String> forwardStack;

    public BackForward() {
        // Buat constructor untuk menyimpan data Stack sehingga dapat digunakan dengan mudah di Object class lain
        backStack = new Stack<>(); // (1)
        forwardStack = new Stack<>(); //(2)
    }

    // Algoritma pada method tambahData() itu seperti ini :
    // Saat kita mengetik ataupun menginput URL ke browser kita, maka sebenarnya kita mengisi Stack "back" dan menghapus
    // Stack "forward"
    public void tambahData(String value) {
        backStack.push(value);   //(3)
        // Pada stack, untuk menambahkan/mengisi value pada top, gunakan Stack method yaitu Stack.push()
        forwardStack.clear();   //(4)
        // Untuk menghapus seluruh element, dapat kita gunakan Stack.clear()
        System.out.println("Website " + value + " dibuka");
        // Berikan statement setiap kali membuka website
    }

    // Method back() ini seperti method Undo yang ada di Microsoft Word, saat kita melakukan undo, maka Stack "undo"
    // kita kurangi 1 pada top, dan Stack "forward" kita tambahkan 1 pada topnya. Begitupun algoritma pada sistem back()
    // pada browser
    public void back() {
        if (backStack.isEmpty()) { // (5)
            // Untuk menghapus 1 top dari Stack, maka kita perlu melakukan top checking, yaitu melakukan checking apakah
            // Stack ini ada topnya atau Stack ini sudah kosong
            System.out.println("List back kosong");
        } else {
            String value = backStack.pop(); // (6)
            // Untuk menghapus 1 top dari Stack, kita menggunakan Stack method yaitu Stack.pop()
            forwardStack.push(value); // (7)
            // Untuk menambahkan/mengisi value pada top, gunakan Stack method yaitu Stack.push()
            System.out.println("Mundur ke alamat " + value); //(8)
            // Berikan statement tiap kali melakukan Back
        }
    }

    // Apabila tadi back() artinya menghapus 1 top dari Stack "back" dan mengisi Stack "forward", maka di method ini
    // kebalikannya. Hapus 1 top dari Stack "forward", pindahkan ke Stack "back" dengan cara menambahkan yang tadi
    // dihapus dari "forward"
    public void forward() {
        if (forwardStack.isEmpty()) {
            // Untuk menghapus 1 top dari Stack, kita menggunakan Stack method yaitu Stack.pop()
            System.out.println("List forward kosong");
        } else {
            String value = forwardStack.pop(); // (9)
            // Untuk menghapus 1 top dari Stack, kita menggunakan Stack method yaitu Stack.pop()
            backStack.push(value); // (10)
            // Untuk menambahkan/mengisi value pada top, gunakan Stack method yaitu Stack.push()
            System.out.println("Kembali lagi ke alamat " + value);
            // Berikan statement tiap kali melakukan Forward
        }
    }
}