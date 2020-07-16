package data_mahasiswa;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MahasiswaImp implements MahasiswaInterface {

    private String[] kolom = {"NIM", "NAMA", "JENIS KELAMIN", "JURUSAN"};

    private List<Mahasiswa> list = new ArrayList<>();

    @Override
    public void read(JTable jt) {
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        for (int i = 0; i < list.size(); i++) {
            Object[] os = new Object[4];
            os[0] = list.get(i).getNim();
            os[1] = list.get(i).getNama();
            os[2] = list.get(i).getJenis_kelamin();
            os[3] = list.get(i).getJurusan();
            dtm.addRow(os);
        }
        jt.setModel(dtm);
    }

    @Override
    public void create(Mahasiswa m) {
        list.add(m);
        JOptionPane.showMessageDialog(null, "Berhasil disimpan!");
    }

    @Override
    public void update(Mahasiswa m) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNim() == m.getNim()) {
                list.set(i, m);
            }
        }
        JOptionPane.showMessageDialog(null, "Berhasil diubah!");
    }

    @Override
    public void delete(int nim) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNim() == nim) {
                list.remove(i);
            }
        }
        JOptionPane.showMessageDialog(null, "Berhasil dihapus!");
    }

    @Override
    public void search(JTable jt, int nim) {
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNim() == nim) {
                Object[] os = new Object[4];
                os[0] = list.get(i).getNim();
                os[1] = list.get(i).getNama();
                os[2] = list.get(i).getJenis_kelamin();
                os[3] = list.get(i).getJurusan();
                dtm.addRow(os);
            }
        }
        jt.setModel(dtm);
    }
}
