package ArrayPractice;

public class FrquencyOfElementsWithoutInbuiltFunction {
    public static void main(String[] args) {
        int [] a=new int []{1,2,3,4,5,1,2,3,4,5,1,2};
        //Created a Boolean array, which will nark visited
        boolean[] visited=new boolean[a.length];

//loop on the array one by one --> Take 1st index
        for(int i=0;i<a.length;i++){
            int count=1;
            if (visited[i]==true) {
                  continue;
            }
            //Loop over array one by one for the index number
            for(int j=i+1;j<a.length;j++){
                //if found increment the counter
                if(a[i]==a[j]){
                    count++;

                    //Mark the index at which it found as visited so that in the next iteration it would not check it again
                    visited[j]=true;

                }

            }
            System.out.println(a[i]+" "+count);
        }
    }
}
