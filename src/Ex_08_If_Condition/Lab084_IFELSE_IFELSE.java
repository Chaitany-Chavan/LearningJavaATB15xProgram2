package Ex_08_If_Condition;
import java.util.Scanner;
public class Lab084_IFELSE_IFELSE {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age = scanner.nextInt();
//        String name  = scanner.next();

        if (age > 34) {
            System.out.println("age > 34");
        } else if (age < 34) {
            System.out.println("age < 34");
        } else {
            System.out.println(" age == 34");
        }

        scanner.close();
    }
}
