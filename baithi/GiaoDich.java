package baithi;

import java.util.Scanner;

class LoiNhapGia extends Exception{
    public LoiNhapGia(String message){
        super(message);
    }
}
public class GiaoDich {
    static Scanner sc = new Scanner(System.in);
    private String maGiaoDich;
    private String ngayGiaoDich;
    private double donGia;
    private double dienTich;

    public GiaoDich(){}

    public GiaoDich(String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }
    public String getMaGiaoDich() {
        return maGiaoDich;
    }
    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }
    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }
    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getDienTich() {
        return dienTich;
    }
    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
    public void input() throws LoiNhapGia{
        System.out.println("Nhap ma giao dich: ");
        maGiaoDich = sc.nextLine();
        System.out.println("Nhap ngay giao dich: ");
        ngayGiaoDich = sc.nextLine();
        System.out.println("Nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());
        if (donGia <= 0) {
            throw new LoiNhapGia("Don gia phai lon hon 0");
        }
        System.out.println("Nhap dien tich: ");
        dienTich = Double.parseDouble(sc.nextLine());
    }
    public void output(){
        System.out.println("Ma giao dich: " + maGiaoDich);
        System.out.println("Ngay giao dich: " + ngayGiaoDich);
        System.out.println("Don gia: " + donGia);
        System.out.println("Dien tich: " + dienTich);
    }
    public double thanhTien(){
        return dienTich * donGia;
    }
}
