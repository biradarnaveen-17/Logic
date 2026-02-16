import java.util.*;
public class q3 {
    
    public static void main(String[] args) {
        int n;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the length of the array ");
        n=s.nextInt();
        int[] a= new int[n];
        System.out.println("Enter the array element : ");
        for(int i=0;i<n;i++)
        {
            System.out.println("Element at index ["+i+"]");
            a[i]=s.nextInt();
        }
        System.out.println("Given Array");
        System.out.print("a:{");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print("}");
        System.out.println();

        int c=0,d=n-1;
        while(c<d)
        {
            a[c]=a[d]+a[c];
            a[d]=a[c]-a[d];
            a[c]=a[c]-a[d];
            c++;
            d--;
        }

        System.out.println("Reversed Array");
        System.out.print("a:{");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print("}");
        System.out.println();
    }
}

