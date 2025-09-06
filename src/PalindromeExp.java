import java.util.Scanner;

public class PalindromeExp {

    public static void main(String[] args) {

        System.out.println("enter string");
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String rev="";

        for (int i = s.length()-1; i >=0 ; i--) {
            rev=rev+s.charAt(i);
        }
        if (rev.equals(s)) {
            System.out.println("pallendrum");
        }else {
            System.out.println("non-pallendrum");
        }
    }
}
