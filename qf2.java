//qf2 - minimum and maximum element in an array

class Solution
{
 public static void main(String args[])
 {
  int[] arr={1,2,9,7,5};
  
  int min=arr[0];
  int max=arr[0];
  
  for(int i=0;i<arr.length;i++)
  {
   if(min<arr[i])
   {
     min=arr[i];
   }
   if(max>arr[i])
   {
     max=arr[i];
   }
  }
  
  System.out.println("Minimum:" +min);
  System.out.println("Maximum:" +max);
  }
}