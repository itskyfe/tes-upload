package main;

import model.Buku;
import java.util.ArrayList;
import java.util.Scanner;

public class PertemuanJava {
    public static void main(String[] args) {
        
        ArrayList<Buku> daftarBuku = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);

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
                case 1 -> {
                    System.out.print("ID Buku: "); 
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Judul Buku: "); 
                    String judul = scanner.nextLine();

                    System.out.print("Stok Buku: "); 
                    int stok = scanner.nextInt();
                    scanner.nextLine();

                    Buku bukuBaru = new Buku(id, judul, stok);
                    
                    daftarBuku.add(bukuBaru);
                    
                    System.out.println(">> Buku berhasil ditambahkan!");
                }
                case 2 -> {
                    for (int i = 0; i < daftarBuku.size(); i++) {
                        Buku b = daftarBuku.get(i);
                        b.tampilkanInfo();
                    }
                }
                case 3 -> {
                    System.out.print("Masukkan ID Buku: ");
                    int idTarget = scanner.nextInt();

                    for (int i = 0; i < daftarBuku.size(); i++) {
                        // Menggunakan getter getIdBuku() bukan b.idBuku
                        if (daftarBuku.get(i).getIdBuku() == idTarget) {
                            daftarBuku.remove(i);
                            System.out.println(">> Buku berhasil dihapus!");
                            break;
                        }
                    }
                }
                case 4 -> {
                    System.out.print("Masukkan ID Buku: ");
                    int idTarget = scanner.nextInt();

                    for (Buku b : daftarBuku) {
                        // Menggunakan getter getIdBuku() bukan b.idBuku
                        if (b.getIdBuku() == idTarget) {
                            System.out.print("Masukkan Stok Baru: ");
                            int stokBaru = scanner.nextInt();
                            
                            // Menggunakan setter setStok() bukan b.stok
                            b.setStok(stokBaru); 
                            
                            System.out.println(">> Proses update stok selesai!");
                            break;
                        }
                    }
                }
                case 5 -> {
                    berjalan = false;
                }
                default -> System.out.println("Pilihan tidak valid!");
            }
        }
        scanner.close();
    }   
}