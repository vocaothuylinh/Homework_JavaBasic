package JavaBasic5;

import java.util.ArrayList;
import java.util.List;

public class Collection {


    private static ArrayList<String> addinfo(String name, String age, String job, String skill) {
        ArrayList<String> info = new ArrayList<>();
        info.add(name);
        info.add(age);
        info.add(job);
        info.add(skill);
        return info;
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        //kiểm tra số chẵn add vào arraylist
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        System.out.println("**********************************");

        //duyệt giá trị trong arraylist
        for (int i : list) {
            System.out.print(i + "\t");
        }
        System.out.println();
        System.out.println("**********************************");
//        List<String> info = new ArrayList<>();
//        info.add("linh");
//        info.add("29 year old");
//        info.add("manual QC");
//        info.add("auto");
        List<String> info = addinfo("linh", "29", "manual", "auto");
        //in thông tin nhân viên trong arrlaylist
        for (String value : info) {
            System.out.println(value);
        }
    }
}
