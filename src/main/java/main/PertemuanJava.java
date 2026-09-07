package main;

import model.Service;
import model.Buku;
import java.util.Scanner;

public class PertemuanJava {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Service service = new Service(scanner);
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n=== SISTEM MANAJEMEN PERPUSTAKAAN ===");
            System.out.println("1. Tambah");
            System.out.println("2. Tampilkan");
            System.out.println("3. Hapus");
            System.out.println("4. Update Stok");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> service.tambahBuku();
                case 2 -> service.tampilkanBuku();
                case 3 -> service.hapusBuku();
                case 4 -> service.updateStok();
                case 5 -> berjalan = false;
                default -> System.out.println("Pilihan tidak valid!");
            }
        }

        scanner.close();
    }
}