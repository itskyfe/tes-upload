package model;

import model.Buku;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {

    private ArrayList<Buku> daftarBuku;
    private Scanner scanner;

    public Service(Scanner scanner) {
        this.daftarBuku = new ArrayList<>();
        this.scanner = scanner;
    }

    public void tambahBuku() {
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

    public void tampilkanBuku() {
        for (int i = 0; i < daftarBuku.size(); i++) {
            Buku b = daftarBuku.get(i);
            System.out.println("ID Buku: " + b.getIdBuku());
            System.out.println("Judul Buku: " + b.getJudul());
            System.out.println("Stok Buku: " + b.getStok());
        }
    }

    public void hapusBuku() {
        System.out.print("Masukkan ID Buku: ");
        int idTarget = scanner.nextInt();

        for (int i = 0; i < daftarBuku.size(); i++) {
            if (daftarBuku.get(i).getIdBuku() == idTarget) {
                daftarBuku.remove(i);
                System.out.println(">> Buku berhasil dihapus!");
                return;
            }
        }
        System.out.println(">> Buku dengan ID tersebut tidak ditemukan!");
    }

    public void updateStok() {
        System.out.print("Masukkan ID Buku: ");
        int idTarget = scanner.nextInt();

        for (Buku b : daftarBuku) {
            if (b.getIdBuku() == idTarget) {
                System.out.print("Masukkan Stok Baru: ");
                int stokBaru = scanner.nextInt();
                b.setStok(stokBaru);
                System.out.println(">> Proses update stok selesai!");
                return;
            }
        }
        System.out.println(">> Buku dengan ID tersebut tidak ditemukan!");
    }
}