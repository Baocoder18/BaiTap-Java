package ArrayList;

import java.util.Scanner;

public class QuanLyDanhSach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int choice = 0;
        do {
            System.out.println("-------Chon chuc nang----------");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("1. Them sinh vien vao danh sach");
            System.out.println("2. Kiem tra danh sach co rong hay khong");
            System.out.println("3. Lay ra so luong sinh vien trong danh sach");
            System.out.println("4. Lam rong danh sach sinh vien");
            System.out.println("5. Kiem tra sinh vien co ton tai trong danh sach hay khong");
            System.out.println("6. Xoa mot sinh vien ra khoi danh sach");
            System.out.println("7. Tim kiem mot sinh vien dua theo ten");
            System.out.println("8. Xuat ra danh sach co diem tu cao den thap");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 0: 
                    break;
                case 1:
                    System.out.println("-------Nhap ma SV---------: ");
                    String maSV = sc.nextLine();
                    System.out.println("---------Nhap ho va ten--------: ");
                    String hoTen = sc.nextLine();
                    System.out.println("---------Nhap nam sinh---------: ");
                    String namSinh = sc.nextLine();
                    System.out.println("----------Nhap diem TB----------: ");
                    double diem = sc.nextDouble();
                    SinhVien sv = new SinhVien(maSV, hoTen, namSinh, diem);
                    dssv.addSinhVien(sv);
                    break;
                case 2: 
                    System.out.println("--------Danh sach rong--------: " + dssv.kTraDSRong());
                    break;
                case 3:
                    System.out.println("------Lay ra so luong sinh vien------: " + dssv.getSoLuong());
                    break;
                case 4:
                    dssv.clearDS();
                    break;
                case 5:
                    System.out.println("-------Nhap ma sinh vien can kiem tra-------: ");
                    String checkMaSV = sc.nextLine();
                    System.out.println("Sinh vien co ton tai: " + dssv.kTraSVTonTai(checkMaSV));
                    break;
                case 6:
                    System.out.println("------Nhap ma sinh vien can xoa--------: ");
                    String xoaMaSV = sc.nextLine();
                    System.out.println("Xoa sinh vien trong danh sach: ");                    
                    dssv.xoaSV(xoaMaSV); 
                    break;
                case 7:
                    System.out.println("Nhap ten can tim: ");
                    String ten = sc.nextLine();
                    SinhVien timSinhVien = dssv.timKiem(ten);
                    if (timSinhVien != null) {
                        System.out.println("-------Sinh vien duoc tim thay--------: ");
                        System.out.println("Ma sinh vien: " + timSinhVien.getMaSV());
                        System.out.println("Ho ten: " + timSinhVien.getHoTen());
                        System.out.println("Nam sinh: " + timSinhVien.getNamSinh());
                        System.out.println("Diem trung binh: " + timSinhVien.getDiemTB());
                    }else{
                        System.out.println("-------Khong tim thay sinh vien--------");
                    }
                    break;
                case 8:
                    dssv.sapXep();
                    dssv.inDanhSach();
                    break;
                default:
                    System.out.println("--------Vui long chon chuc nang hop le--------- ");
                    break;
            }
        } while (choice!=0);
        sc.close();
    }
}
