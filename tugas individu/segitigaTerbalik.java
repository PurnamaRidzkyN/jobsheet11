import java.util.Scanner;

public class segitigaTerbalik {
    public static void main(String[] args) {
        // menambahkan scanner agar bisa di panggil nantinya
        Scanner input = new Scanner(System.in);
        // untuk menampilkan "Masukan nilai N:" di terminal 
        System.out.print("Masukan nilai N: ");
        // untuk menginputkan nilai n yang nanti di buat jadi segitiga
        int N = input.nextInt();
        // membuat i = N agar mempermudah di loop dalam ke 1, jadi nanti i akan berkurang setiap perulangan 
        for (int i = N; i >0;i-- ){
            //perulangan dalam ke 1 untuk menampilkan "*"
            //karena akan menambah"*"setiap perulangan jika j<i maka baris awal akan ada "*"sebanyak N yang dimasukan 
              for (int j = 0; j< i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
