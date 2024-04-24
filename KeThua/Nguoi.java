package KeThua;

import java.util.Scanner;

public class Nguoi {
    static Scanner sc = new Scanner(System.in);
    private String ten;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    
    public Nguoi(){}

    public Nguoi(String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void input(){    
        System.out.println("Nhap ho ten: ");
        ten = sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = sc.nextLine(); 
    }
    public void output(){
        System.out.println("Ho ten: " + ten);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Dia chi: " + diaChi);
    }
}
