import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

abstract class DienThoai {
    public abstract void themDienThoai(String hoTen, String soDienThoai);

    public abstract void xoaDienThoai(String hoTen);

    public abstract void capNhatDienThoai(String hoTen, String soDTMoi);

    public abstract void timDienThoai(String hoTen);

    public abstract void sapXep();
}

class DanhBa extends DienThoai {
    static Scanner sc = new Scanner(System.in);
    private String hoTen, soDienThoai;
    private ArrayList<DanhBa> dSDT = new ArrayList<DanhBa>();

    public static void inPut(DanhBa dT, String hoTen, String soDienThoai) {
        dT.hoTen = hoTen;
        dT.soDienThoai = soDienThoai;
        System.out.println("Ho ten: " + dT.hoTen);
        System.out.println("So dien thoai: " + dT.soDienThoai);
    }

    public void themDienThoai(String hoTen, String soDienThoai) {
        DanhBa dT = new DanhBa();
        inPut(dT, hoTen, soDienThoai);
        for (int i = 0; i < dSDT.size(); i++) {
            if (dSDT.get(i).hoTen.equalsIgnoreCase(dT.hoTen)) {
                if (!dSDT.get(i).soDienThoai.equalsIgnoreCase(dT.soDienThoai)) {
                    System.out.println("So cua nguoi nay da co san trong may. Tien hanh them!!!");
                    dSDT.get(i).soDienThoai += "-" + dT.soDienThoai;
                    return;
                }
            }
        }
        System.out.println("Nguoi nay la lien he moi. Tien hanh them!!!");
        dSDT.add(dT);
    }

    public void xoaDienThoai(String hoTen) {
        for (int i = 0; i < dSDT.size(); i++) {
            if (dSDT.get(i).hoTen.equalsIgnoreCase(hoTen)) {
                dSDT.remove(i);
                return;
            }
        }
        System.out.println("Lien he khong ton tai!!!");
    }

    public void capNhatDienThoai(String hoTen, String soDTMoi) {
        for (int i = 0; i < dSDT.size(); i++) {
            if (dSDT.get(i).hoTen.equalsIgnoreCase(hoTen))
                dSDT.get(i).soDienThoai = soDTMoi;
        }
    }

    public void timDienThoai(String hoTen) {
        for (int i = 0; i < dSDT.size(); i++) {
            if (dSDT.get(i).hoTen.equalsIgnoreCase(hoTen)) {
                System.out.println(dSDT.get(i));
                return;
            }
        }
        System.out.println("Lien he khong ton tai!");
    }

    public void sapXep() {
        Collections.sort(dSDT, new Comparator<DanhBa>() {
            @Override
            public int compare(DanhBa h1, DanhBa h2) {
                return h1.hoTen.compareTo(h2.hoTen);
            }
        });
    }

    @Override
    public String toString() {
        return "Ho ten: " + hoTen + "\nSo dien thoai: " + soDienThoai;
    }

    public void showDanhBa() {
        for (DanhBa danhBa : dSDT) {
            System.out.println("-" + danhBa);
        }
    }

    public void testInput(String soDienThoai) {
        for (String s : soDienThoai.split("")) {
            if(!Character.isDigit(s.charAt(0))){
                throw new NumberFormatException();
            }
        }
    }
}

public class quanLyDanhBa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhBa qLDB = new DanhBa();
        boolean control = true;
        while (control) {
            System.out.println("\n------Chon chuong trinh------");
            System.out.println("1.Them dien thoai\n2.Cap nhat dien thoai\n3.Xoa\n4.Tim kiem\n5.Sap xep\n6.Thoat");
            System.out.println("---------------------------------");
            try {
                switch (Integer.parseInt(sc.nextLine())) {
                    case 1: {
                        System.out.println("\n----Them dien thoai----");
                        System.out.print("Nhap ho ten: ");
                        String hoTen = sc.nextLine();
                        System.out.print("Nhap so dien thoai: ");
                        String soDienThoai = sc.nextLine();
                        qLDB.testInput(soDienThoai);
                        qLDB.themDienThoai(hoTen, soDienThoai);
                        break;
                    }

                    case 2: {
                        System.out.println("\n----Cap nhat dien thoai----");
                        System.out.print("Nhap ho ten: ");
                        String hoTen = sc.nextLine();
                        System.out.print("Nhap so dien thoai moi: ");
                        String soDienThoai = sc.nextLine();
                        qLDB.capNhatDienThoai(hoTen, soDienThoai);
                        break;
                    }

                    case 3: {
                        System.out.println("\n----Xoa lien he----");
                        System.out.print("Nhap lien he ban muon xoa khoi danh ba: ");
                        String hoTen = sc.nextLine();
                        qLDB.xoaDienThoai(hoTen);
                        break;
                    }

                    case 4: {
                        System.out.println("\n----Tim kiem dien thoai----");
                        System.out.print("Nhap ho ten can tim: ");
                        String hoTen = sc.nextLine();
                        qLDB.timDienThoai(hoTen);
                        break;
                    }

                    case 5: {
                        System.out.println("\n----Sap xep lai danh ba----");
                        qLDB.sapXep();
                        qLDB.showDanhBa();
                        break;
                    }

                    case 6: {
                        control = false;
                        break;
                    }

                    default:
                        System.out.println("Khong co chuong trinh nay. Vui long chon lai!!");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Dinh dang loi. Vui long chon lai chuong trinh!!!");
            }
        }
        sc.close();
    }
}
