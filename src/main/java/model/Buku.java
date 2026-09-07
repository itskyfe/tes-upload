package model;

public class Buku {
    public int idBuku;
    public String judul;
    public int stok;
    
    public Buku(int idBuku, String judul, int stok){
        this.idBuku = idBuku;
        this.judul = judul;
        this.stok = stok;
    }
    
    public void tampilkanInfo(){
        System.out.println("ID Buku " + idBuku);
        System.out.println("Judul Buku " + judul);
        System.out.println("Stok Buku " + stok);
    }
}