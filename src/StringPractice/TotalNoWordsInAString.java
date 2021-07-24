package StringPractice;

public class TotalNoWordsInAString {
    public static void main(String[] args) {
        String s1="Bhavesh is a good boy ";
        int lenght=s1.length();
        int count=0;
        String word="";
        String [] words=new String[lenght];
        word=word+"";
        int NoOfWords=0;
        for(int i=0;i<lenght;i++){
            if(s1.charAt(i)!=' '){
                word=word+s1.charAt(i);
            }
            else{
                words[NoOfWords]=word;
                NoOfWords++;
                word="";

            }
        }
        System.out.println("No of Words are "+NoOfWords);
        for(String Addedword: words){
            System.out.println(Addedword);
        }
    }
}
