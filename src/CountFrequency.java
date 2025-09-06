import java.util.Arrays;

public class CountFrequency {
    //Count frequency of characters in a String
    public static void main(String[] args) {
        String s="satyajit";
        countFrquencyOfString(s);
    }

    private static void countFrquencyOfString(String s) {
        char[] c=s.toCharArray();
        Arrays.sort(c);
        s=String.valueOf(c);
        for(int i=0;i<s.length();){
            int a=s.lastIndexOf(s.charAt(i))-s.indexOf(s.charAt(i))+1;
            System.out.println(s.charAt(i)+" "+a);
            i=s.lastIndexOf(s.charAt(i))+1;
        }
    }
}
