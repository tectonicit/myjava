import java.util.*;
class DemoDoWhile{
public static void main(String[] args){
   int a,b,c;
   String choice;
  Scanner sc=new Scanner(System.in);  
   do
   {
   System.out.println("Enter 2 numbers");
   a=sc.nextInt();
   b=sc.nextInt();
   c=a+b;
   System.out.println("Addition is "+c);
    System.out.println("Do you want to continue?(yes/no)");
    choice=sc.next();       
   }while(choice.equals("yes"));     
 } 
}

