package KeThua;
public class MayTinh extends May{
    private double TocDo;
    private int dungLuongRAM;
    private int dungLuongHDD;

    public MayTinh(){}

    public MayTinh(String tenNXS, String diaChi, String nhanHieu, double giaThanh, double TocDo, int dungLuongRAM, int dungLuongHDD) {
        super(tenNXS, diaChi, nhanHieu, giaThanh);
        this.TocDo = TocDo;
        this.dungLuongRAM = dungLuongRAM;
        this.dungLuongHDD = dungLuongHDD;
    }
    
    @Override
    public void input(){
        super.input();
        System.out.println("Nhap toc do: ");
        TocDo = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap duong luong RAM: ");
        dungLuongRAM = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap dung luong HDD: ");
        dungLuongHDD = Integer.parseInt(sc.nextLine());
    }
    @Override
    public void output(){
        super.output();
        System.out.println("Toc do: " + TocDo);
        System.out.println("Dung luong RAM: " + dungLuongRAM);
        System.out.println("Dung luong HDD: " + dungLuongHDD);
    }
}

