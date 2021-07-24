package StringPractice;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        //Takes an input string from user
        Scanner sc =new Scanner(System.in);
        String s2=sc.nextLine();

        //Converts a string to lower case
        String s1=s2.toLowerCase();
        //Declare a boolean
        boolean isPalindrome =true;
        int length=s1.length(); //get the length of a string

        //Iterate a string from left to right and from right to left
        for (int i=0;i<length;i++,length--){
            if(s1.charAt(i)!=s1.charAt(length-1)){
                isPalindrome=false;

            }
        }

        if (isPalindrome)
        System.out.println("String is Palidrome");
        else
            System.out.println("String is not palindrome");
    }
}
