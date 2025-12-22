package Ex_04_Operators;

import java.sql.SQLOutput;

public class Lab042_Operator_Logical {
    static void main() {
        boolean a=true;
        System.out.println(a);
        System.out.println(!a);

        boolean b=true;
        System.out.println(!!b);

        boolean c= true || false;
        System.out.println(c);

        boolean c1= false && true;
        System.out.println(c1);
    }
}
