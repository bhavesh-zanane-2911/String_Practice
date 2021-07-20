package ArrayPractice;

import java.util.HashMap;

public class CountNoOfElementsInAnArrayUsingHashMap {
    public static void main(String[] args) {
        int [] a=new int [] {1,2,5,6,3,2,5,5,2};
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(mp.containsKey(a[i])){
                mp.put(a[i],mp.get(a[i])+1);
            }
            else
            {
                mp.put(a[i],1);
            }
        }
        System.out.println(mp);
    }
}
