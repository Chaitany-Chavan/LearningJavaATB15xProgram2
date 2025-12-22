package Ex_04_Operators;

public class Lab049_Interview {
    static void main() {
        int rakesh_salary =14;
        boolean b=!(rakesh_salary>10 || rakesh_salary<5);
        // Divide and conquer get it one by one
//        T || F = T as per OR Gate formula
//        And ! (true)= false as per NOT Gate = anyvalues reverse
        System.out.println(b);
    }
}
