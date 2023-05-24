package tiketapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("=== Pemesanan Tiket ===");
            System.out.print("Nama Penumpang: ");
            String namaPenumpang = scanner.nextLine();

            System.out.print("Harga Tiket: ");
            int hargaTiket = scanner.nextInt();
            scanner.nextLine(); // baris baru

            System.out.println("1. Tiket Pesawat");
            System.out.println("2. Tiket Kereta");
            System.out.print("Pilih jenis tiket: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // baris baru

            Tiket tiket;

            if (pilihan == 1) {
                System.out.print("Nomor Penerbangan: ");
                String nomorPenerbangan = scanner.nextLine();
                tiket = new TiketPesawat(namaPenumpang, hargaTiket, nomorPenerbangan);
            } else if (pilihan == 2) {
                System.out.print("Nomor Kereta: ");
                String nomorKereta = scanner.nextLine();
                tiket = new TiketKereta(namaPenumpang, hargaTiket, nomorKereta);
            } else {
                System.out.println("Pilihan tidak valid");
                return;
            }

            System.out.println("\nInformasi Tiket:");
            tiket.display(); //memanggil method
        }
    }
}
