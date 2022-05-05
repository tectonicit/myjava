import java.util.*;
class DemoArray2{

public static void main(String[] args){

     int i,item;
     Scanner sc=new Scanner(System.in);
     //Declare int array of size 5
     int[] arr={2,3,7,9,1,4,6,3,2};
     for(i=0;i<arr.length;i=i+1)
     {
     
      System.out.println(arr[i]);
     }
   System.out.println("By using for each loop..");
   for(int x:arr)
   {
   
      System.out.println(x);
   }
    
    

    
  }


}