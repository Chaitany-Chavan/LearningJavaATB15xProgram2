package Ex_08_If_Condition;
import java.util.Scanner;
public class Lab085_Multi_User_Input {
    //    public class Lab_Multi_UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("enter the side 1");
        int side1 = scanner.nextInt();

        System.out.println("enter the side 2");
        int side2 = scanner.nextInt();

        System.out.println("enter the side 3");
        int side3 = scanner.nextInt();

        System.out.println(side1 + side2 + side3);
    }
}