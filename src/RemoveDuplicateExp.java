import java.util.Arrays;

public class RemoveDuplicateExp {
    public static void main(String[] args) {

        String s= "Satyajit";

        String ss=removeDuplicate(s);

        System.out.println(ss);

    }
    public static String removeDuplicate(String s){
        char[] c=s.toCharArray();
        Arrays.sort(c);
        s=String.valueOf(c);
        String ss="";
        for (int i = 0; i <s.length() ; ) {
            ss=ss+s.charAt(i);
            i=s.lastIndexOf(s.charAt(i))+1;

        }

        return ss;
    }
}
