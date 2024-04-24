package KeThua;
import java.util.ArrayList;
import java.util.Scanner;

public class QLyMT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MayTinh> danhSachMayTinh = new ArrayList<>();
        System.out.println("Nhap so luong may tinh: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin may thu: " + (i+1));
            MayTinh mayTinh = new MayTinh();
            mayTinh.input();
            danhSachMayTinh.add(mayTinh);
        }
        System.out.println("Thong tin cac may tinh cua nha san xuat IBM: ");
        for (MayTinh mayTinh : danhSachMayTinh){
            if(mayTinh.getTenNXS().equalsIgnoreCase("IBM")){
                mayTinh.output();          
                System.out.println("-----------------");     
            }
        }
        danhSachMayTinh.sort((mt1, mt2) -> Double.compare(mt1.getGiaThanh(), mt2.getGiaThanh()));
        System.out.println("\nDanh sach may tinh sap xep theo gia tang dan:");
        for (MayTinh mayTinh : danhSachMayTinh) {
            mayTinh.output();
            System.out.println("-----------------");
        }
        for (int i = 0; i < danhSachMayTinh.size(); i++) {
            if(danhSachMayTinh.get(i).getNhanHieu().trim().equalsIgnoreCase("intel")){
                danhSachMayTinh.remove(i);  
            }
        }   
        System.out.println("Danh sach sau khi xoa cac may tinh nhan hieu Intel: ");
        for (MayTinh mayTinh : danhSachMayTinh) {
            mayTinh.output();
        }
        sc.close();
    }
}

