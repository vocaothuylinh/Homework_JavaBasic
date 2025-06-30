package JavaBasic3;

public class IfElse {

    static int number = 100;

    public static void checknumber (int i){
        if (i == number){
            System.out.println("I bằng 100");
        }else if(i < number){
            System.out.println("I < 100");
        }else{
            System.out.println("I > 100 rồi nha");
        }
    }

    public static void main(String[] args) {
        checknumber(100);
    }

}
