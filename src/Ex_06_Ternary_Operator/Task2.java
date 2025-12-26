package Ex_06_Ternary_Operator;

public class Task2 {
    static void main() {
        int n1=66;
        int n2=15;
        int n3=-11;

        int max=(n1> n3)?(n1>n2?n1:n2):(n2>n3?n2:n3);
        System.out.println("MAX OF THREE:" + max);
    }
}
