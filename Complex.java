
package function;

import java.util.Scanner;

public class Complex 
{
    int real;
    int imaginary;

    public static void display(int r, int i)
    {
        if(i>0)
        {
            System.out.println(+r+"+"+i+"i"); 
        }
        else
        {
            System.out.println(+r+"  "+i+"i");
        }
    }


        public static void main(String[] args)
        {
            int re;
            int im;
            System.out.println("Enter numbers");
        try (Scanner sc = new Scanner(System.in)) {
            re = sc.nextInt();
            im = sc.nextInt();
        }
            display(re, im);
        }
}