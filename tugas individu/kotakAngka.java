import java.util.Scanner;

public class kotakAngka {
    public static void main(String[] args) {
        // menambahkan scanner agar bisa di panggil nantinya
        Scanner input = new Scanner(System.in);
        // untuk menampilkan "Masukan nilai N:" di terminal 
        System.out.print("Masukan nilai N: ");
        // untuk menginputkan nilai n yang nanti di buat jadi kotak
        int N = input.nextInt();
        // membuat perulangan untuk mencetak baris sebanyak N
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
            // agar bisa menampilkan angka N di awal sama di akhir untuk membuat kotak 
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                System.out.print(N + " ");
                } else {
                System.out.print("  "); // Dua spasi untuk bagian dalam kotak karena di atas sesudah menampilkan angka tambah spasi
                }
            }
            System.out.println(); // membuat line baru atau baris baru
        }
    }
}
