/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.db;

/**
 *
 * @author acer
 */
public class Mahasiswa {
    private String No_BP;
    private String Nama;
    private String Tempat_Lahir;
    private String Tanggal_Lahir;
    private String Alamat;
    private String Telp;
    private String Asal_Sekolah;
    
    public Mahasiswa() {
        
    }
    public String getasalsekolah() {
        return Asal_Sekolah;
    }
    public void setasalsekolah(String asalsekolah) {
        this.Asal_Sekolah = asalsekolah;
    }
    public String gettlp() {
        return Telp;
    }
    public void settlp(String tlp) {
        this.Telp = tlp;
    }
    public String getalamat() {
        return Alamat;
    }
    public void setalamat(String alamat) {
        this.Alamat = alamat;
    }
    public String gettgllahir() {
        return Tanggal_Lahir;
    }
    public void settgllahir(String tgllahir) {
        this.Tanggal_Lahir = tgllahir;
    }
    public String gettmplahir() {
        return Tempat_Lahir;
    }
    public void settmplahir(String tmplahir) {
        this.Tempat_Lahir = tmplahir;
    }
    public String getnama() {
        return Nama;
    }
    public void setnama(String nama) {
        this.Nama = nama;
    }
    public String getnobp() {
        return No_BP;
    }
    public void setnobp(String nobp) {
        this.No_BP = nobp;
    }
}
