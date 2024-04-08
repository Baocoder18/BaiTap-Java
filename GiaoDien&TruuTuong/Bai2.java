interface MayTinhBoTui{
    public abstract double cong(double a, double b);
    public abstract double tru(double a, double b);
    public abstract double nhan(double a, double b);
    public abstract double chia(double a, double b);
}
class MayTinhCasioFX500 implements MayTinhBoTui{
    @Override 
    public double cong(double a, double b) {
        return a + b;
    }

    @Override
    public double tru(double a, double b) {
        return a - b;
    }

    @Override
    public double nhan(double a, double b) {
        return a * b;
    }

    @Override
    public double chia(double a, double b) {
        return a / b;
    }    
}
class MayTinhVinaCal500MS implements MayTinhBoTui{
    @Override
    public double cong(double a, double b) {
        return a + b;
    }

    @Override
    public double tru(double a, double b) {
        return a - b;
    }

    @Override
    public double nhan(double a, double b) {
        return a * b;
    }

    @Override
    public double chia(double a, double b) {
        return a / b;
    }    
}
class PhanMemMayTinh implements MayTinhBoTui, SapXepInterface{

    @Override 
    public double cong(double a, double b) {
        return a + b;
    }

    @Override
    public double tru(double a, double b) {
        return a - b;
    }

    @Override
    public double nhan(double a, double b) {
        return a * b;
    }

    @Override
    public double chia(double a, double b) {
        return a / b;
    }
    @Override
    public void sapXepTang(double[] arr) {
        double temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
            }
        }
    }
}
    @Override
    public void sapXepGiam(double[] arr) {
        double temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
interface SapXepInterface {
    public void sapXepTang(double[] arr);
    public void sapXepGiam(double[] arr);
}
class SapXepChen implements SapXepInterface{

    @Override
    public void sapXepTang(double[] arr) {
        double temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }    
    }
    @Override
    public void sapXepGiam(double[] arr) {
        double temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
class SapXepChon implements SapXepInterface {

    @Override
    public void sapXepTang(double[] arr) {
        double temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
            }
        }
    }
}
    @Override
    public void sapXepGiam(double[] arr) {
        double temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
public class Bai2 {
    public static void main(String[] args) {

        //Cau a
        System.out.println("Cau a: ");
        MayTinhCasioFX500 mfx500 = new MayTinhCasioFX500();
        MayTinhVinaCal500MS mvn500 = new MayTinhVinaCal500MS();
        System.out.println(mfx500.cong(6, 2));
        System.out.println(mfx500.tru(6, 2));
        System.out.println(mfx500.nhan(6, 2));
        System.out.println(mfx500.chia(6, 2));
        System.out.println(mvn500.cong(6, 2));
        System.out.println(mvn500.tru(6, 2));
        System.out.println(mvn500.nhan(6, 2));
        System.out.println(mvn500.chia(6, 2));
        
        //Cau b
        System.out.println("Cau b: ");
        double[] arr = new double[] {5,1,2,3,4,8,0};
        double[] arr2 = new double[] {6,9,1,3,4,10,0};
        SapXepChen sxchen = new SapXepChen();
        SapXepChon sxchon = new SapXepChon();
        System.out.println("Sap xep chon tang dan: ");
        sxchon.sapXepTang(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nSap xep chen giam dan: ");
        sxchen.sapXepGiam(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        PhanMemMayTinh pmmt = new PhanMemMayTinh();
        System.out.println("\n3 + 5 = " + pmmt.cong(3, 5));
        double[] arr3 = new double[] {6,2,7,4,1,11};
        System.out.println("Sap xep chen tang: ");
        sxchen.sapXepTang(arr3);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
