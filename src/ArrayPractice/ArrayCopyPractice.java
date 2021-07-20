package ArrayPractice;

public class ArrayCopyPractice {
    public static void main(String[] args) {
        int [] a=new int []{10,20,30,40,50};
        int []b=new int [a.length];
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }

        for (int test:a){
            System.out.println("Elements of Array A "+test);
        }
        System.out.println("\n");
        for (int test: b){
            System.out.println("Elements of Array B"+test);
        }


    }
}
