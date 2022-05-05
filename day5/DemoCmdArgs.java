
class DemoCmdArgs{
public static void main(String[] args){

   //int a,b,c;
    float a,b,c;

   if(args.length==2)
   {
     // a=Integer.parseInt(args[0]);
     // b=Integer.parseInt(args[1]);
      a=Float.parseFloat(args[0]);
      b=Float.parseFloat(args[1]);

      c=a+b;
      System.out.println("Addition is "+c);
      System.out.println();
   }
   else
   {
      System.out.println("Please enter 2 args");

   }
}
}