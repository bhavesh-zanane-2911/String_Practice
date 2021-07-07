import java.util.Locale;

public class FindTheLongestAndSmallestPalindromeInAGivenString {
    public static void main(String[] args) {
        String s1="Wow Madam is driving racecar";
        s1=s1+" ";
        int length=s1.length();
        String[] words=new String [20];//To find an array od words in a string
        String word="";
        int temp=0;//to find no of words in a given string
        for (int i=0;i<length;i++){
            if(s1.charAt(i)!=' '){
                word=word+s1.charAt(i);
            }
            else{
                words[temp]=word;
                temp++;
                word="";
            }
        }
        System.out.println("No of words"+temp);
        findlongestandSmallestPalindromeWord(temp,words);
    }

    private static void findlongestandSmallestPalindromeWord(int temp, String[] words) {
        String longest="";
        String smallest="";
        //we have no of words and array of words
        // One by one we will check whether word is palindrome or not
        //if its a palindrome update count
        int count=0;
        for(int i=0;i<temp;i++){

            if(isPalindrome(words[i])){

                count++;
                //if count is zero
                if (count==1){
                    longest=smallest=words[i];
                }
                else{
                    if(smallest.length()> words.length){
                        smallest=words[i];
                    }
                    if(longest.length()< words.length){
                        longest=words[i];
                    }
                }

            }
        }
        System.out.println("Smallest "+smallest);
        System.out.println("Longest "+longest);
    }

    private static boolean isPalindrome(String s1) {
        int length=s1.length();
        String word=s1.toLowerCase();
        for(int i=0;i<length;i++,length--){
            if(word.charAt(i)!=word.charAt(length-1)){
                System.out.println(word.charAt(i)+" "+word.charAt(length-1));
                return  false;
            }
        }
        return true;
    }
}

