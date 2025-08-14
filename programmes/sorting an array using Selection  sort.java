import java.util.*;
class sorting_an_array_using_selection_sort
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No of elements In Array");
        int n=sc.nextInt();
        int a[]=new int[n];
        int k=0;
        int t;
        System.out.println("Enter Array Elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Sorting Started");
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    t=a[j];
                    a[j]=a[i];
                    a[i]=t;
                }
            }
        }
        System.out.println(" Sorting Done ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"  ");
            System.out.println();
        }
    }
}