import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = s.nextLine();

        System.out.print("Reversed String: ");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        s.close();
    }
}
