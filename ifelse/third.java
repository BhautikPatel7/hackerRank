import java.util.Scanner;
// how to find lenth of int

// int a = 15144;
// int length = String.valueOf(a).length();

public class third {
    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            int length = 15 - s1.length();
           System.out.print(s1);
           while (length != 0) {
               System.out.print(" ");
               length--;
           }
           int reminder = 1;
           int count = 0;
           int n = x;
           if (x == 0) {
                System.out.print("00");   
               }
           while (x != 0 ) {
               
               reminder = x % 10;
               x /= 10;  
               count++;            }
               if (count == 1) {
                   System.out.print("00"+ n );
               }
               else if (count == 2) {
                   System.out.print("0" + n);
               }
               else{
                   System.out.print(n);
               }
               System.out.println();
            //Complete this line
        }
        System.out.println("================================");
    }
}
