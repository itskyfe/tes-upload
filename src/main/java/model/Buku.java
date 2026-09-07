package model;

public class Buku {
    private int idBuku;
    private String judul;
    private int stok;
    
    public Buku(int idBuku, String judul, int stok){
        this.idBuku = idBuku;
        this.judul = judul;
        this.stok = stok;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public String getJudul() {
        return judul;
    }
    
    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    public void tampilkanInfo(){
        System.out.println("ID Buku: " + getIdBuku());
        System.out.println("Judul Buku: " + getJudul());
        System.out.println("Stok Buku: " + getStok());
    }
}