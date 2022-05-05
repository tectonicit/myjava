import java.util.*;
class Pattern1{
public static void main(String[] args){
   int i,j;
   for(i=1;i<=5;i=i+1)   //rows
   {
     for(j=1;j<=5;j=j+1)  //cols
     {
       if(i==j || i+j==6)
       {
         System.out.print("*");
       }
       else
       {
       
       System.out.print(" ");
       }
     }
     System.out.println();
   
   }
 
 }


}