import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class Bai5 {

    public static void main(String[] args) {
        String str1 = "Nam";
        String str2 = "Nguyen";

        str1  = str1 + " " + str2;
        str2 = str1.substring(0, str1.indexOf(" "));
        str1 = str1.substring(str1.indexOf(" ") + 1);

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        try {
            System.out.println("A");
            throw new NullPointerException("B");
        }catch (ArithmeticException e){
            System.out.println("Hello");
        }
    }
}
