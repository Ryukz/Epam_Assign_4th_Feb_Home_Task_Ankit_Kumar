import Cal.*;

import java.util.Scanner;

public class Main_Class {
    public static  void main(String args[])
    {
        Scanner n=new Scanner(System.in);
       Cal1 cal1=new Cal1();
       System.out.println("Want to perfrom operations from +,-,*,\\ then enter 1 for 2 for square");
       int ch=n.nextInt();
       if(ch==1) {
           System.out.println("Enter the 1st operand");
           int x1 = n.nextInt();
           System.out.println("Enter the operator");
           char op = n.next().charAt(0);

           System.out.println("Enter the 2nd operator");
           int x2 = n.nextInt();
           float result =cal1.operate(op,x1,x2);
           System.out.println("Result==  "+result);
       }
       else
           if(ch==2)
           {
               System.out.println("Enter the number to get square of that number");
               int x1=n.nextInt();
               System.out.println(cal1.sq(x1));
           }





    }
}
