import java.util.*;
class DemoWhile3{

public static void main(String[] args){
 
 Scanner sc=new Scanner(System.in);
   System.out.println("Enter number");
   int n=sc.nextInt();
   int i=1;
   int sum=1;
   while(i<=n)
   {
            sum=sum*i;
           i=i+1;   
   }
    System.out.println("Fact is "+sum);

}


}