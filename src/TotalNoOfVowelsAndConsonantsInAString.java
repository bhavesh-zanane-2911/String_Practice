public class TotalNoOfVowelsAndConsonantsInAString {
    public static void main(String[] args) {
        String s="Adesh Zanzane";
        int length = s.length();
        int noOfVowels=0;
        int noOfConsonants=0;
        for(int i=0;i<length;i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='E'||s.charAt(i)=='I' ||s.charAt(i)=='O' ||s.charAt(i)=='U'
                    ||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                noOfVowels++;
            }
            else{
                noOfConsonants++;
            }
        }
        System.out.println("No of Vowels "+ noOfVowels);
        System.out.println("No of Consonents "+ noOfConsonants);

    }
}
