import java.util.*;
class DemoCharInput{
public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     String s1;
     char ch;
     int x;    
     System.out.println("Enter char");
     s1=sc.next();
     ch=s1.charAt(0);
     x=ch;
     if(x>=65 && x<=90){     
      System.out.println("Capital");
     }  
     else if(x>=97 && x<=122){
     System.out.println("Small");
     }
     else if(x>=48 && x<=57){
     System.out.println("Digit");
     }
     else{
      System.out.println("I dont know this char!!!");
     }

  }

}