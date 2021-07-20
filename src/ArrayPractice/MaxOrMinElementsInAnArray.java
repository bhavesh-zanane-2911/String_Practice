package ArrayPractice;

public class MaxOrMinElementsInAnArray {
    public static void main(String[] args) {
        int [] a= new int[]{10,20,50,5,80};

        //Find the max no in an array
        int max=a[0];
        for(int i=0;i< a.length;i++){
            if (a[i]>=max){
                max=a[i];
            }
        }
        System.out.println("Max No is "+max);

        //find the minimum no in an array

        int min=a[0];
        for (int i=0;i<a.length;i++){
            if(a[i]<=min){
                min=a[i];
            }
        }
        System.out.println("Min No is" +min);

    }


}
