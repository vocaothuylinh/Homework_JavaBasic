package JavaBasic1;

public class SinhVien {

    //Biến Local cục bộ
    public void nameSinhVien(){
    String name = "Sinh Vien A";
    System.out.println("Tên Sinh Viên: " + name);
    }

    //Biến Instance toàn cục
    int a = 5;
    int b = 10;
     public void diemSV (){
         System.out.println("Điểm Sinh Viên: "+ (a + b));
     }
     //Biến static
    static int c = 20;

    public static void main(String[] args) {
        SinhVien newsinhvien = new SinhVien();
        newsinhvien.nameSinhVien();
        newsinhvien.diemSV();
        System.out.println(c);

        System.out.println("=========================");
        // chưa chuẩn
//        ThongTin thongtin = new ThongTin();
//        System.out.println(thongtin.homework);
//        System.out.println(thongtin.email);
//        System.out.println(thongtihomeworkn.phone);
        System.out.println(ThongTin.HOMEWORK);
        System.out.println(ThongTin.EMAIL);
        System.out.println(ThongTin.PHONE);
    }
}
