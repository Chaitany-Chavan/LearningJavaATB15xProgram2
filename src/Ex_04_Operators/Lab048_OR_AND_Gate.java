package Ex_04_Operators;

public class Lab048_OR_AND_Gate {
    static void main() {
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(false || false);

//        And && // Only true & true reeturns true
//                T || T -> T
//                T || F -> F
//                F || F -> F
//                F || T -> F

        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);
    }
}
