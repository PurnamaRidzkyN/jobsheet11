import java.util.Scanner;

public class segitigaAngka {
    public static void main(String[] args) {
        // menambahkan scanner agar bisa di panggil nantinya
        Scanner input = new Scanner(System.in);
        // untuk menampilkan "Masukan nilai N:" di terminal 
        System.out.print("Masukan nilai N: ");
        // untuk menginputkan nilai n yang nanti di buat jadi segitiga
        int N = input.nextInt();
        // membuat perulangan agar berulang sebanyak N yang di masukan untuk mencetak baris, yang nanti barisnya akan sebanyak N 
        for (int i = 0; i <N;i++ ){
            //perulangan dalam ke 1 untuk menampilkan spasi dan akan terus bertambah setiap perulangan
            //  dengan ketika nilai j > i agar membuat segitiga yang puncaknya di samping sebelah kanan , dimana j = N
            for (int j = N; j> i; j--){
                System.out.print(" ");
            }
            // menampilkan angka di terminal dimulai dari angka 1 ketika  j <= i maka karena saat print j langsung di tambah 1
            //dan saat perulangan akan mencetak nilai (j +1) dimana setiap perulangan j akan bertambah 1 setiap perulangan 
            for (int j = 0; j<=i;j++){
                System.out.print(j+1);
            }
            // untuk membuat line baru sehingga membbentuk segitika  dan tidak sejajar kesamping
            System.out.println();
        }
    }
}
