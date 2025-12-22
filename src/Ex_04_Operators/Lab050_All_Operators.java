package Ex_04_Operators;

public class Lab050_All_Operators {
    static void main() {
        boolean b1= true;
        int a=10;
        int b=21;

        System.out.println(a+b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a!=b);

//        compound assignment operators
        int age = 10;
//        age +=10; // age = age +10
        age/=10; // age = age/10
//        age-=10; // age =age-10
        System.out.println(age);

        int a11= +10;
        int a12 =-110;
        System.out.println(a11+a12);
    }
}
