// This program calculates the sum and average of 5 integers entered by the user.
import java.util.*;
class FindSumAndAvgOfFiveNumbers
{
    public static void main(String[] args)
    {
        System.out.println("Enter 5 values");
        Scanner sc=new Scanner(System.in);
        int sum=0,length;
        int a[]=new int[5];
        for(int i=0;i<a.length;i++)
        {
         a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
         sum=a[i]+sum;
        }
        System.out.println("Sum is:"+sum);
        length=a.length;
        int avg=sum/length;
        System.out.println("Average is:"+avg);
    }
}