package Buku;

public class DataBuku {
    int jilid;
    String judul;
    String pengarang;
    String penerbit;


    public DataBuku(int jilid, String judul, String pengarang, String penerbit){
        this.jilid = jilid;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
    }

    @Override
    public String toString() {
        return "|" + jilid + 
                " | " + judul + 
                " | " + pengarang + 
                " | " + penerbit + 
                " | " ;
    }

    public int getJilid() {
        return jilid;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }
}