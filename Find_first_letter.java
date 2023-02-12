package June;
import  java.util.Scanner;

public class Find_first_letter {
    public static  void main(String arg[]){
        Scanner sc =  new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch == 'A' | ch == 'j'){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}


