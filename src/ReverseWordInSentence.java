public class ReverseWordInSentence {
    //Reverse words in a sentence (without reversing characters).
    public static void main(String[] args) {

        String s="My name is Satyajit Behera";
        String[] ss=s.split(" ");
        String sr="";
        for (int i = 0; i < ss.length; i++) {
            sr=sr+" "+reverseWord(ss[i]);
        }
        System.out.println(sr);
    }

    private static String reverseWord(String s) {
        char[] c=s.toCharArray();
        String ss="";
        for (int i = c.length-1; i >=0 ; i--) {
            ss=ss+c[i];
        }
        return ss;
    }
}
