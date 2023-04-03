// Package untuk kelas-kelas dalam aplikasi BackForward
package BackForward;

// Mengimpor kelas Stack dari java.util
import java.util.Stack;

// Kelas JavaBF yang menggunakan generic type E
public class JavaBF<E>{
    private Stack<E> backStack; // Stack untuk menyimpan data alamat website yang telah dibuka sebelumnya
    private Stack<E> forwardStack; // Stack untuk menyimpan data alamat website yang telah di-forward sebelumnya

    // Konstruktor untuk kelas JavaBF
    public JavaBF(){
        backStack = new Stack<>();
        forwardStack = new Stack<>();
    }

    // Method untuk menambahkan data alamat website ke dalam backStack
    public void tambahData(E data){
        backStack.push(data);
        System.out.printf("Website %s dibuka\n", data); // Menampilkan pesan bahwa website telah dibuka
    }

    // Method untuk mundur ke alamat website sebelumnya
    public void back() {
        if (!backStack.isEmpty()) { // Jika backStack tidak kosong
            forwardStack.push(backStack.pop()); // Mengambil data alamat website dari backStack dan memasukkannya ke dalam forwardStack
            System.out.printf("mundur ke alamat %s\n", backStack.peek()); // Menampilkan pesan bahwa telah mundur ke alamat website sebelumnya
        }
    }

    // Method untuk maju ke alamat website yang telah di-forward sebelumnya
    public void forward() {
        if (!forwardStack.isEmpty()) { // Jika forwardStack tidak kosong
            backStack.push(forwardStack.pop()); // Mengambil data alamat website dari forwardStack dan memasukkannya ke dalam backStack
            System.out.printf("maju ke alamat %s\n", backStack.peek()); // Menampilkan pesan bahwa telah maju ke alamat website yang telah di-forward sebelumnya
        }
    }
}