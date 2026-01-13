package Ex_09_Switch;
import java.util.Scanner;
public class Lab086_Switch2 {
    static void main() {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter num 1to 7");
        int day = Scanner.nextInt();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the day num(1 to 7)");
//        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
        }
    }
}
