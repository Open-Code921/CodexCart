import java.util.*;
class sortinganarrayusingbubblesort
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter array Length");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array Elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int t=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}