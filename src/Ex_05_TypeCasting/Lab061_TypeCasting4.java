package Ex_05_TypeCasting;

public class Lab061_TypeCasting4 {
    static void main() {
        int course = 100;
        float NSRT_GST = 18.45f;
////        int total = course+ NSRT_GST; // Narrowing - Implicit.
//        int total = course+ (int)NSRT_GST; // Narrowing - Explicit.
//        System.out.println(total);

        float total2 = course+ NSRT_GST; // widening  - Implicit
        float total3 = (float) course+ NSRT_GST; // widening  - Explicit
        System.out.println(total2);

    }}
