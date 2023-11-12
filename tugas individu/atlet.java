import java.util.Scanner;

public class atlet {

    public static void main(String[] args) {
        //inisiasi array 2 dimensi 
        Scanner input = new Scanner(System.in);
        String[] cabangOlahraga = {"badminton", "tenis meja", "basket", "bola voly"};
        String cabor[][] = new String[cabangOlahraga.length][5];

        //untuk pengguna memasukan atau menginputkan nama atlet per orang di setiap  cabang olahraga
        for (int i = 0; i < cabor.length; i++) {
            for (int j = 0; j < cabor[i].length; j++) {
                System.out.printf("Masukan Nama atlet %s ke-%s: ", cabangOlahraga[i], j + 1);
                cabor[i][j] = input.next();
            }
        }

        System.out.println();
        System.out.println("Nama semua atlet per cabang olahraga setelah diurutkan:");

        // Mengurutkan nama atlet menggunakan Bubble Sort
        //logikanya mengurutkanya dari paling terakhir dulu kalo pake kodingan ini 
        for (int i = 0; i < cabor.length; i++) {
            for (int j = 0; j < cabor[i].length - 1; j++) {
                // biar mempersingkat waktu jadi memakai -j -1 karena agar tidak membandingkan yang sekiranya udah di bandingkan
                for (int k = 0; k < cabor[i].length - j - 1; k++) {
                    // Tukar posisi jika urutan tidak benar 
                    // karena kata ibu disuruh untuuk mempelajari Bubble Sort mandiri jadi saya menggunakanya 
                    if (cabor[i][k].compareToIgnoreCase(cabor[i][k + 1]) > 0) {
                        // tempat tukar posisi
                        String temp = cabor[i][k];
                        cabor[i][k] = cabor[i][k + 1];
                        cabor[i][k + 1] = temp;
                    }
                }
            }
        }

        // Menampilkan nama atlet yang sudah diurutkan
        for (int i = 0; i < cabor.length; i++) {
            System.out.printf("Cabang %s:\n", cabangOlahraga[i]);
            for (int j = 0; j < cabor[i].length; j++) {
                System.out.println(cabor[i][j]);
            }
            System.out.println();
        }
    }
}
