package Ex_06_Ternary_Operator;

public class Task3 {
    public static void main(String [] args) {
//                int n1=22;
//                int n2=9;
//                int n3=-11;
//        String n1 = args[0];
//        String n2 = args[1];
//        String n3 = args[2];


        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);
        int result=(n1 > n2 )?(n1>n2?n1:n2):(n2>n3?n2:n3);

                System.out.println("MAX OF THREE:" + result);
            }
        }


