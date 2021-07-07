import java.util.Arrays;

public class AnnaGramProgram {
    public static void main(String[] args) {
        String s1="ABCDE";
        String s2="EDCBA";
        if (s1.length()!=s2.length()){
            System.out.println("Both Strings are not Annagram");
        }
        String s3 = s1.toLowerCase();
        String s4 = s2.toLowerCase();
        char[] chars1 = s3.toCharArray();
        char[] chars2 = s4.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        if (Arrays.equals(chars1,chars2)){
            System.out.println("Its an anagram");
        }
        else{
            System.out.println("Its not an anagram");
        }
    }
}
