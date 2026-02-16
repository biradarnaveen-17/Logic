
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to check wether it is prime or not:");
        int n = s.nextInt();

        for(int i=2;i<n-1;i++){
            if(n%i==0){
                System.out.println("Not a prime number");
                break;
            }
            else{
                System.out.println("Prime number");
                break;
            }
        }

    }

}
