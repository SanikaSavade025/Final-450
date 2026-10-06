//qf3 - find the kthsmallest element in an array

import java.util.*;

class Solution
{
 public static int kthsmallest(int[] arr,int k)
 {
  Arrays.sort(arr);
  return arr[k-1];
 }
 public static void main(String args[])
 {
  int[] arr={1,3,5,7,8,2,4,5};
  int k=3;
  
  int res=kthsallest(arr,k);
  
  System.out.println("kthsallest is:" +res);
  }
 }