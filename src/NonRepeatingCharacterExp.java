import java.util.Arrays;
import java.util.Scanner;

public class NonRepeatingCharacterExp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String nr=nonRepeatingChar(s);
        System.out.println(nr);
    }
    private static String nonRepeatingChar(String ss) {

        for (int i = 0; i <ss.length() ; i++) {
            if(ss.indexOf(ss.charAt(i))==ss.lastIndexOf(ss.charAt(i))){
                return ""+ss.charAt(i);
            }
        }
    return "every word repeated";
    }
}
