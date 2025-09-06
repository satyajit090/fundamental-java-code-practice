
//Find the first non-repeating character in a String.

import java.util.Arrays;

public class NonRepeatingCharacter {

    public static void main(String[] args) {

        String s="aatyajit";

        String a=maxA(s);
        System.out.println(a);

    }

    public static String maxA(String a){

        char[] cc=a.toCharArray();
        Arrays.sort(cc);
        System.out.println(cc);
        String aa=String.valueOf(cc);
        for (int i=0;i<aa.length();i++) {

            if (aa.indexOf(aa.charAt(i)) == aa.lastIndexOf(aa.charAt(i))) {
                return "" + aa.charAt(i);
            }


        }
        return "no repeat character";
    }

    }
