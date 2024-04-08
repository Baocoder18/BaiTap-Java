import java.util.ArrayList;

public class GiangVien extends Nguoi{
    private String lopDay;
    private double luong;
    private int soGioDay;
    private String caDay;
    
    public GiangVien() {}
    public GiangVien(String ten, String gioiTinh, String ngaySinh, String diaChi, String lopDay, double luong, int soGioDay, String caDay) {
        super(ten, gioiTinh, ngaySinh, diaChi);
        this.lopDay = lopDay;
        this.luong = luong;
        this.soGioDay = soGioDay;
        this.caDay = caDay;
    }
    @Override
    public void input(){ 
        super.input();
        System.out.println("Nhap lop day: ");
        lopDay = sc.nextLine();
        System.out.println("Nhap luong: ");
        luong = sc.nextDouble();
        System.out.println("Nhap so gio day: ");
        soGioDay = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ca day: ");
        caDay = sc.nextLine();
    }
    @Override
    public void output(){
        super.output();
        System.out.println("Lop day: " + lopDay);
        System.out.println("Luong: " + luong);
        System.out.println("So gio day: " + soGioDay);
        System.out.println("Ca day: " + caDay);
    }
    public double TinhLuong(GiangVien gv){
        if(gv.caDay.equalsIgnoreCase("Sang") || gv.caDay.equalsIgnoreCase("Chieu")){
            return luong * soGioDay;
        }else if(gv.caDay.equals("Toi")){
            return luong * soGioDay + 200000;
        }
        return luong;
    }
    public static void main(String[] args) {
        System.out.println("Nhap so giang vien: ");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<GiangVien> danhSachGV = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            GiangVien gv = new GiangVien();
            gv.input();
            danhSachGV.add(gv);
        }
        for (GiangVien gv : danhSachGV) {
            gv.output();
        }
        int i = 1;
        for (GiangVien gv : danhSachGV) {
            System.out.println("Luong cua nhan vien thu: " + i);
            i++;
            System.out.println(gv.TinhLuong(gv));
        }
    }
}
