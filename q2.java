import java.util.*;
public class q2 {
    
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

        Arrays.sort(a);

        int max=a[0];

        System.out.println("Maximum in the array is : "+max);
    }
}

