package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;
        
        public DanhSachSinhVien(){
            danhSach = new ArrayList<>();
        }
        public void addSinhVien(SinhVien student){
            danhSach.add(student);
        }
        public boolean kTraDSRong(){
            return danhSach.isEmpty();
        }
        public int getSoLuong(){
            return danhSach.size();
        }
        public void clearDS(){
            danhSach.clear();
        }
        public boolean kTraSVTonTai(String maSV){
            for (SinhVien sinhVien : danhSach) {
                if (sinhVien.getMaSV().equals(maSV)) {
                    return true;
                }
            }
            return false;
        }
        public void xoaSV(String maSV){
            for (int i = 0; i < danhSach.size(); i++) {
                if(danhSach.get(i).getMaSV().equals(maSV)){
                    danhSach.remove(i);
                    return;
                }
            }
        }
        public SinhVien timKiem(String ten){
            for (SinhVien sinhVien : danhSach) {
                if(sinhVien.getHoTen().equalsIgnoreCase(ten)){
                    return sinhVien;
                }
            }
            return null;
        }
        public void sapXep() {
            Collections.sort(danhSach, new Comparator<SinhVien>() {
                @Override
                public int compare(SinhVien sv1, SinhVien sv2) {
                    if(sv1.getDiemTB() < sv2.getDiemTB()){
                        return -1;
                    }else if (sv1.getDiemTB() > sv2.getDiemTB()) {
                        return 1;
                    }else{
                        return 0;
                    }
                }
            });;
        
        }
        public void inDanhSach(){
            for (SinhVien sinhVien : danhSach) {
                System.out.println(sinhVien);
        }
    }
}
