import java.util.*;
class NutBolt{
public static void main(String args[]){

         int nuts,bolts,washer;
         
         Scanner sc;
    sc=new Scanner(System.in);

    System.out.println("How many nuts:");
    nuts=sc.nextInt();
    
   System.out.println("How many Bolts:");
   bolts=sc.nextInt();             
   System.out.println("How many Washres:");
   washer=sc.nextInt();
   if(nuts>=bolts && washer>=(bolts*2))
   {
         // • 5 cents per bolt
// • 3 cents per nut
// • 1 cent per washer
total=5*bolts+3*nuts+washer;
   
   }
   else
   {
        System.out.println("Order isnot valid"); 
   }
   
   
           }

}