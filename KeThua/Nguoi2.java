import java.util.Scanner;

public class Nguoi2 {
    static Scanner sc = new Scanner(System.in);
    private String hoten;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String queQuan;
    
    public Nguoi2(){}

    public Nguoi2(String hoten, String gioiTinh, String ngaySinh, String diaChi, String queQuan) {
        this.hoten = hoten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.queQuan = queQuan;
    }

    public String gethoTen() {
        return hoten;
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

    public void sethoTen(String hoten) {
        this.hoten = hoten;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public void input(){
        System.out.println("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaySinh = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = sc.nextLine(); 
        System.out.println("Nhap que quan: ");
        queQuan = sc.nextLine();
    }
    public void output(){
        System.out.println("Ho ten: " + hoten);
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Que quan: " + queQuan);
    }
}
