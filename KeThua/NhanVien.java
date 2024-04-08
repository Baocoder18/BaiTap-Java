import java.util.ArrayList;
import java.util.Collections;

public class NhanVien extends Nguoi{
    private double luong;
    private int tongGioLamViec;
    private String phongBan;

    public NhanVien(){}

    public NhanVien(String ten, String gioiTinh, String ngaySinh, String diaChi, double luong, int tongGioLamViec, String phongBan) {
        super(ten, gioiTinh, ngaySinh, diaChi);
        this.luong = luong;
        this.tongGioLamViec = tongGioLamViec;
        this.phongBan = phongBan;
    }
    public double getLuong() {
        return luong;
    }
    public void setLuong(double luong) {
        this.luong = luong;
    }
    public int getTongGioLamViec() {
        return tongGioLamViec;
    }
    public void setTongGioLamViec(int tongGioLamViec) {
        this.tongGioLamViec = tongGioLamViec;
    }
    public String getPhongBan() {
        return phongBan;
    }
    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }
    @Override
    public void input(){
        super.input();
        System.out.println("Nhap luong: ");
        this.luong = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap tong so gio lam: ");
        this.tongGioLamViec = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap phong ban: ");
        this.phongBan = sc.nextLine();
    }
    @Override
    public void output(){
        super.output();
        System.out.println("Luong: " + luong);
        System.out.println("Tong so gio lam: " + tongGioLamViec);
        System.out.println("Phong ban: " + phongBan);
    }
    public double tinhThuong(){
        if(tongGioLamViec >= 200){
            return luong*2;
        }else if(tongGioLamViec < 200 && tongGioLamViec >= 100 ){
            return luong*0.1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        ArrayList<NhanVien> danhSachNV = new ArrayList<>();
        System.out.println("Nhap so luong nhan vien: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao nhan vien thu: " + (i+1));
            NhanVien nhanVien = new NhanVien();
            danhSachNV.add(nhanVien);
            nhanVien.input();
        }

        System.out.println("Danh sach nhan vien: ");
        for (NhanVien nhanVien : danhSachNV) {
            nhanVien.output();
        }
        System.out.println("-----------------");

        Collections.sort(danhSachNV, (nv1, nv2) -> Double.compare(nv1.getLuong(), nv2.getLuong()));
        System.out.println("\nDanh sach nhan vien sau khi sap xep tang dan theo luong:");
        for (NhanVien nhanVien : danhSachNV) {
            nhanVien.output();
        }
        System.out.println("---------------");
        
        int count = 0;
        System.out.println("Danh sach nhan vien duoc thuong: ");
        for (NhanVien nhanVien : danhSachNV) {
            if(nhanVien.tinhThuong() > 0){
                nhanVien.output();
                count++;
            }
        }
        System.out.println("Tong so nhan vien duoc thuong: " + count);
        System.out.println("-----------------");
        
        int countKyThuat = 0;
        for (NhanVien nhanVien : danhSachNV) {
            if(nhanVien.getPhongBan().equalsIgnoreCase("ky thuat")){
                countKyThuat++;
            }
        }
        System.out.println("Tong so nhan vien phong ky thuat: " + countKyThuat);
        System.out.println("----------------");

        NhanVien maxLuong = danhSachNV.get(0);
        for (NhanVien nhanVien : danhSachNV) {
            if(nhanVien.getLuong() > maxLuong.getLuong()){
                maxLuong = nhanVien;
            }
        }
        System.out.println("Nhan vien co luong cao nhat: ");
        maxLuong.output();
        System.out.println("---------------");
        System.out.println("Danh sach nhan vien phong ke toan: ");
        for (NhanVien nhanVien : danhSachNV) {
            if(nhanVien.getPhongBan().equalsIgnoreCase("ke toan")){
                nhanVien.output();
                System.out.println("-------------");
            }
        }

        ArrayList<NhanVien> danhSachNVHC = new ArrayList<>();
        for (NhanVien nhanVien : danhSachNV) {
            if(nhanVien.getPhongBan().equalsIgnoreCase("hanh chinh")){
                danhSachNVHC.add(nhanVien);
            }
        }

        Collections.sort(danhSachNVHC, (nv1, nv2) -> Double.compare(nv2.getLuong(), nv1.getLuong()));
        System.out.println("\nDanh sach nhan vien phong hanh chinh sau khi sap xep giam dan theo luong: ");
        for (NhanVien nhanVien : danhSachNVHC) {
                nhanVien.output();
                System.out.println("---------------");
        }
        
        boolean timKiem = false;
        for (NhanVien nhanVien : danhSachNV) {
            if(nhanVien.getTen().equalsIgnoreCase("Nguyen Thu Phuong")){
                timKiem = true;
                System.out.println("Thong tin cua nhan vien Nguyen Thu Phuong: ");
                nhanVien.output();
                break;
            }
        }
        if(!timKiem){
            System.out.println("Khong tim thay nhan vien Nguyen Thu Phuong");
        }
        
        for (NhanVien nhanVien : danhSachNVHC) {
            if(nhanVien.getTen().equalsIgnoreCase("Le Tuan")){
                nhanVien.setPhongBan("hanh chinh");
                break;
            }
        }

        System.out.println("----------------");
        danhSachNV.removeIf(nv -> nv.getTen().equalsIgnoreCase("Nguyen Le Hang"));
        System.out.println("Danh sach nhan vien sau khi xoa: ");
        for (NhanVien nhanVien : danhSachNV) {
            nhanVien.output();
        }
    }
}
