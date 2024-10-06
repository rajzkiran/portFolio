import java.io.*;
import java.util.Scanner;
  class Pen {
         //static variables.....
         static int price=5;
         static String String1 = "BLUE OR RED";
       //instance variables
       int n1;
       String x1;
         //static block......
        static 
        {  
            System.out.println("The pen is Rs "+price);
             System.out.println("The pen type are :"+String1);
        }
        //static method
       //instance block
         {
     
         }
        //instance method
         void blue( int n ,String x) { 
             this.n1=n;
             this.x1=x;
              System.out.println("Required pens :"+n);
              System.out.println("Requirement type :"+x);
              
         }
         //another  instance method
        void bill(){
            int total=price*n1;
            System.out.println("The Total Amount is :"+total);
         }
   }
    public class Sale1 {
        public static void main(String[] args) {
             Scanner scan=new Scanner(System.in);
             Pen ball=new Pen();
             System.out.println("Enter how_Many you want:");
             int n1=scan.nextInt();
             System.out.println("Enter which Type you want:");
             String x1=scan.next();
             ball.blue(n1 ,x1);
             ball.bill();
             System.out.println("Thank you for Ordering..!");
        }
    }
