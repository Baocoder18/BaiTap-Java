package ArrayList;

public class SinhVien implements Comparable<SinhVien>{
    private String maSV;
    private String hoTen;
    private String namSinh;
    private double diemTB;
    
    public SinhVien(String maSV, String hoTen, String namSinh, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemTB = diemTB;
    }
    public String getMaSV(){
        return maSV;
    }
    public String getHoTen(){
        return hoTen;
    }
    public String getNamSinh(){
        return namSinh;
    }
    public double getDiemTB(){
        return diemTB;
    }
    @Override
    public int compareTo(SinhVien o) {
        return maSV.compareTo(o.maSV);
    }
    @Override
    public String toString() {
        return "SinhVien [maSV=" + maSV + ", hoTen=" + hoTen + ", namSinh=" + namSinh + ", diemTB=" + diemTB + "]";
    }
}