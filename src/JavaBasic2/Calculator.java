package JavaBasic2;

public class Calculator {

    // public double tong;
    // public double tich;

    //    //Hàm không trả về kết quả
//    public void tong2so(){
//        int a = 10;
//        int b = 20;
//        tong = a + b;
//      //System.out.println("Tong 2 so = " + tong);
//    }
//    // Hàm có tham số, không có kết quả trả về
//    public void cong2so(int number1, int number2){
//
//        System.out.println("cong 2 so = " + (number1 + number2));
//    }
//
//    // Hàm có kết quả trả về
//    public double tich2so(){
//        int c = 5;
//        int d = 10;
//        tich = c * d;
//        return tich;
//    }
//    //Hàm có tham số, có kết quả trả về
//    public int tich2so(int e, int f){
//
//        return e * f;
//    }
    public int cong2so(int a, int b) {
        return (a + b);
    }

    public double tich2sothuc(double a, double b) {
        return (a * b);
    }

    public static void main(String[] args) {
        Calculator tinhtoan = new Calculator();
//        tinhtoan.tong2so();
//        System.out.println("Tong 2 so = " + tinhtoan.tong);
//
//        tinhtoan.cong2so(1, 2);
//        System.out.println("tich 2 so = " + (tinhtoan.tich2so()));
//        System.out.println("tich 2 so = " + (tinhtoan.tich2so(2,2)));

        System.out.println(tinhtoan.cong2so(10, 20));
        System.out.println(tinhtoan.tich2sothuc(30, 40));
    }
}
