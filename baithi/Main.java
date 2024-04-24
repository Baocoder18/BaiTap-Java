package baithi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws LoiNhapGia {
        Scanner sc = new Scanner(System.in);
        ArrayList<GiaoDichDat> dSachGD = new ArrayList<>();
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin giao dich thu: " + (i+1));
            GiaoDichDat gd = new GiaoDichDat();
            try {
                gd.input();
                dSachGD.add(gd);
            } catch (LoiNhapGia e) {
                System.out.println("Loi: " + e.getMessage());
                System.out.println("Nhap lai thong tin cho giao dich nay");
                i--;
            }
        }
        sc.nextLine();
        System.out.println("-----------------");
        System.out.println("Thong tin ve cac giao dich: ");
        for (GiaoDichDat giaoDich : dSachGD) {
            giaoDich.output();
            System.out.println("Thanh tien: " + giaoDich.thanhTien());
            System.out.println("---------------");
        }
        System.out.println("Cac giao dich hon 2 ty: ");
        for (GiaoDichDat giaoDich : dSachGD) {
            if(giaoDich.thanhTien() > 2000000000){
                giaoDich.output();
                System.out.println("Thanh tien: " + giaoDich.thanhTien());
                System.out.println("---------------");
            }
        }
        System.out.println("---------------");
        Collections.sort(dSachGD, new Comparator<GiaoDich>() {
            @Override
            public int compare(GiaoDich gd1, GiaoDich gd2) {
                return Double.compare(gd2.thanhTien(), gd1.thanhTien());
            }
        });
        System.out.println("Danh sach cac giao dich giam dan theo thanh tien: ");
        for (GiaoDichDat giaoDich : dSachGD) {
            giaoDich.thanhTien();
            System.out.println("Thanh tien: " + giaoDich.thanhTien());
        }
        System.out.println("---------------");
        if (!dSachGD.isEmpty()) {
            double tienCaoNhat = 0;
            GiaoDichDat giaoDichCaoNhat = null;
            for (GiaoDichDat giaoDich : dSachGD) {
                if(giaoDich.thanhTien() > tienCaoNhat){
                    tienCaoNhat = giaoDich.thanhTien();
                    giaoDichCaoNhat = giaoDich;
                }
            }
            System.out.println("Giao dich co so tien cao nhat: ");
            giaoDichCaoNhat.output();
            System.out.println("Thanh tien: " + giaoDichCaoNhat.thanhTien());
        }else{
            System.out.println("Khong co giao dich nao duoc nhap");
        }
        sc.close();
    }
}
