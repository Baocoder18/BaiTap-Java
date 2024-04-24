package KeThua;
import java.util.Scanner;

public class May {
    static Scanner sc=new Scanner(System.in);
    private String tenNXS;
    private String diaChi;
    private String nhanHieu;
    private double giaThanh;

    public May(){}

    public May(String tenNXS, String diaChi, String nhanHieu, double giaThanh) {
        this.tenNXS = tenNXS;
        this.diaChi = diaChi;
        this.nhanHieu = nhanHieu;
        this.giaThanh = giaThanh;
    }

    public String getTenNXS() {
        return tenNXS;
    }

    public void setTenNXS(String tenNXS) {
        this.tenNXS = tenNXS;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNhanHieu() {
        return nhanHieu;
    }

    public void setNhanHieu(String nhanHieu) {
        this.nhanHieu = nhanHieu;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        this.giaThanh = giaThanh;
    }
    public void input(){
        System.out.println("Nhap ten san xuat: ");
        tenNXS = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.println("Nhap nhan hieu: ");
        nhanHieu = sc.nextLine();
        System.out.println("Nhap gia thanh: ");
        giaThanh = Double.parseDouble(sc.nextLine());
    }
    public void output(){
        System.out.println("Ten nha san xuat: " + tenNXS);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Nhan hieu: " + nhanHieu);
        System.out.println("Gia thanh: " + giaThanh);
    }
}
