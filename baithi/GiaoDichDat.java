package baithi;

public class GiaoDichDat extends GiaoDich{
    private String loaiDat;

    public GiaoDichDat() {}
    public GiaoDichDat(String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich, String loaiDat) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }
    public String getLoaiDat() {
        return loaiDat;
    }
    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
    @Override
    public void input() throws LoiNhapGia{
        super.input();
        while (true) {
            System.out.println("Nhap loai dat (A, B hoac C): ");
            loaiDat = sc.nextLine();
            if(loaiDat.equalsIgnoreCase("A") || loaiDat.equalsIgnoreCase("B") || loaiDat.equalsIgnoreCase("C")){
                break;
            }else{
                System.out.println("Loai dat khong hop le! Vui long nhap lai");
            }
        }
    }
    @Override
    public void output(){
        super.output();
        System.out.println("Loai dat: " + loaiDat);
    }
    @Override
    public double thanhTien(){
        if(loaiDat.equalsIgnoreCase("A")){
            return super.thanhTien() * 1.5;
        }else{
            return super.thanhTien(); 
        }
    }
}
