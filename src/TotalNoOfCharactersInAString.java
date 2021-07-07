public class TotalNoOfCharactersInAString {
    public static void main(String[] args) {
        String s1="Bhavesh   ";
        int lenght=s1.length();
        int count=0;
        for(int i=0;i<lenght;i++){
            if(s1.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("No of Characters in a string are "+ count);
    }
}
