import java.util.Scanner;

public class VolumeKubus {
    public static void main(String[] args) {

        /**
         * Membuat objek Scanner untuk menerima input dari pengguna
         */
        Scanner input = new Scanner(System.in);

        /**
         *  Menampilkan pesan untuk meminta panjang sisi kubus
          */
        System.out.print("Masukkan panjang sisi kubus: ");

        /**
         * Membaca panjang sisi dari pengguna
          */
        double sisi = input.nextDouble();

        /**
         * Menghitung volume kubus (sisi^3)
          */
        double volume = Math.pow(sisi, 3);

        /**
         * Menampilkan hasil volume kubus
          */
        System.out.println("Volume kubus dengan sisi " + sisi + " adalah " + volume);

        /**
         * Menutup scanner untuk menghindari memory leak
          */
        input.close();
    }
}
