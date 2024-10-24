/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acer
 */
public class MahasiswaManager {
    Connection conn = null;
    Statement st = null;
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/db_si_27";
    
    public MahasiswaManager() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, "root", "");
            st = conn.createStatement();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List getMahasiswa() {
        ResultSet rs = null;
        List Mahasiswa = new ArrayList();
        try {
            rs = st.executeQuery("Select*From tbl_mahasiswa");
            while (rs.next()) {
                Mahasiswa m = new Mahasiswa();
                m.setnobp(rs.getString("No_BP"));
                m.setnama(rs.getString("Nama"));
                m.settmplahir(rs.getString("Tempat_Lahir"));
                m.settgllahir(rs.getString("Tanggal_Lahir"));
                m.setalamat(rs.getString("Alamat"));
                m.settlp(rs.getString("Telp"));
                m.setasalsekolah(rs.getString("Asal_Sekolah"));
                Mahasiswa.add(m);
            
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
        return Mahasiswa;
    }
    public int Insert(Mahasiswa m){
        int result = 0;
        try {
            result = st.executeUpdate("insert into tbl_mahasiswa value ('"+ m.getnobp() +"','"+m.getnama() +"','"+
                    m.gettmplahir() +"','"+ m.gettgllahir() +"','"+ m.getalamat() +"','"+ m.gettlp() +"','"+ 
                    m.getasalsekolah() +"')");  
        }catch (Exception e) {
            e.printStackTrace();
        }
        return result;
        
    }
    public int Delete(Mahasiswa m) {
        int result = 0;
        try{
            result = st.executeUpdate("delete from tbl_mahasiswa where nobp ='"+ m.getnobp() +"'");
        }catch (Exception e) {
            e.printStackTrace();
        }
        return result;       
    }
    public int Update(Mahasiswa m){
        int result = 0;
        try {
            result = st.executeUpdate("update tbl_mahasiswa set nobp='"+ m.getnobp() +"',nama='"+ m.getnama() +"',tmplahir='"+ m.gettmplahir() +"',tgllahir='"+
                            m.gettgllahir()+"'"+ ",alamat='"+ m.getalamat()
                            +"',tlp='"+ m.gettlp()+"',asalsekolah='"+ m.getasalsekolah() +"' where nobp='"+ m.getnobp()+"'");
        }catch (Exception e) {
        }
        return result;       
    }
    public void closeConnection(){
        try {
            conn.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
