package in.ineuron.exampl;

import java.util.Arrays; 
public class Solution {
    public  static  boolean isMonotonic(int[] A) {
        boolean isincr = true;
        boolean isdec = true;
        int n=A.length;
        for (int i = 0; i < n- 1; ++i) {
            if (A[i] > A[i+1])
                isincr = false;
            if (A[i] < A[i+1])
               isdec = false;
        }
        return isincr || isdec;   
}
  public static void main(String[] args) {
    int [] arr = {1,2,4,5}; 
    boolean ans= isMonotonic(arr);
    System.out.println(ans);
  }
}