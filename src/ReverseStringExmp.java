import java.util.Scanner;

public class ReverseStringExmp {

//    public static void main(String[] args) {
//
//        String s= "Satyajit";
//        String reverse = "";
//
//        for (int i = s.length()-1; i >=0 ; i--) {
//
//            reverse=reverse+s.charAt(i);
//        }
//        System.out.println(reverse);
//    }
  //
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String rev= "";


        for(int i=s.length()-1; i>=0; i--){
            rev=rev+s.charAt(i);
        }

        System.out.println(rev);
    }

}
