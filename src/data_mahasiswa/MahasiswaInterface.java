package data_mahasiswa;

import javax.swing.JTable;


public interface MahasiswaInterface {
    
   public void read(JTable jt);
   
   public void create(Mahasiswa m);
   
   public void update(Mahasiswa m);
   
   public void delete(int nim);
  
   public void search(JTable jt, int nim);
   
}
