import java.util.*;
class DemoTernary{
public static void main(String args[]){
    String itemname;
    float itemcost,total;
    int choice;
    Scanner sc;
    sc=new Scanner(System.in);
    System.out.println("Enter item name:");
    itemname=sc.next();
    itemcost=sc.nextFloat();
    if(itemcost<10)
    {
      total=itemcost+2;
    
    }
    else
    {
      total=itemcost;
    }
     
    System.out.println("Overnight delivery (0==no, 1==yes):");
    choice=sc.nextInt();
    if(choice==1)
    {
      total+=3;
    }   
       
       System.out.println("Total cost is "+total);
       
       }

}