package KeThua;
public class ThiSinh extends Nguoi2{
    private String SBD;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public ThiSinh(){}
    public ThiSinh(String hoten, String gioiTinh, String ngaySinh, String diaChi, String queQuan, String SBD, double diemToan, double diemLy, double diemHoa) {
        super(hoten, gioiTinh, ngaySinh, diaChi, queQuan);
        this.SBD = SBD;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }
    @Override
    public void input(){
        super.input();
        System.out.println("Nhap SBD: ");
        SBD = sc.nextLine(); 
        System.out.println("Nhap diem toan: ");
        diemToan = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap diem ly: ");
        diemLy = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap diem hoa: ");
        diemHoa = Double.parseDouble(sc.nextLine());
    }
    @Override 
    public void output(){
        super.output();
        System.out.println("SBD: " + SBD);
        System.out.println("Diem toan: " + diemToan);
        System.out.println("Diem ly: " + diemLy);
        System.out.println("Diem hoa: " + diemHoa);
    }
    public boolean kiemTra(double diemChuan){
        if((diemToan + diemLy + diemHoa) >= diemChuan){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhap so thi sinh: ");
        int n = sc.nextInt();
        sc.nextLine();
        ThiSinh[] ts = new ThiSinh[n];
        for (int i = 0; i < n; i++) {
            ts[i] = new ThiSinh();
            ts[i].input();
        }
        System.out.println("-----------------");
        System.out.println("Danh sach thi sinh: ");
        for (int i = 0; i < n; i++) {
            ts[i].output();
        }
        System.out.println("-----------------");
        System.out.print("Nhap diem chuan: ");
        double diemChuan = sc.nextDouble();
        System.out.println("Danh sach sinh vien do: ");
        for (ThiSinh thiSinh : ts) {
            if(thiSinh.kiemTra(diemChuan)){
                thiSinh.output();
            }
        }
    }
}
