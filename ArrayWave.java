import java.util.Scanner;

public class ArrayWave
{
    public static void main(String[] args)
    {
        System.out.println("Enter any 10 numbers ");
        Scanner scan=new Scanner(System.in);
        int [] arr = new int[10];
        int i;
        for(i=0;i<10;i++)
        arr[i]=scan.nextInt();
        
        for(i=1;i<10;i++)
        {
            int ele=arr[i];
            int j=i-1;
            
            while(j>=0 && arr[j]>ele)
            {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=ele;
        }

        i=0;
        
        for(i=1;i<10;i++)
        {
            int ele=arr[i];
            int j=i-1;


            while(j>=0 && arr[j]>ele)
            {
                arr[j+1]=arr[j];
                j=j-1;
               }
            arr[j+1]=ele;
        }
                 
        int temp=0;

        for(i=0;i<7;i=i+2)
        {
            temp=arr[i+1];
            arr[i+1]=arr[i];
            arr[i]=temp;
        }

        for(i=0;i<10;i++)
        {
            System.out.print(" "+arr[i]);
        }

    }
}