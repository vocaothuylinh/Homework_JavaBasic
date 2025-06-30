package JavaBasic4;

public class ForandArray {
    public static void main(String[] args) {

        //số chẵn là số chia hết cho 2
        //dùng % để kiểm tra phần dư
        int mangsonguyen[] = new int[26];
        int index = 0;

        for(int i = 0; i <= 50; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
                mangsonguyen[index] = i; // gán giá trị số chẵn vào vị trí mảng tuần tự
                index++; //tăng biến chỉ mục lên 1 đơn vị
            }
        }

        System.out.println("======");


        //duyệt mảng
        for (int value : mangsonguyen){
            System.out.println(value);
        }

    }
}

