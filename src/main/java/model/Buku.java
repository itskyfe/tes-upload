package model;

public class Buku {
    private int idBuku;
    private String judul;
    private int stok;
    
    public Buku(int idBuku, String judul, int stok){
        this.idBuku = idBuku;
        this.judul = judul;
        setStok(stok);
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
        if (stok<0){
            System.out.println("Stok tidak valid");
            return;
        }
        this.stok = stok;
    }
}