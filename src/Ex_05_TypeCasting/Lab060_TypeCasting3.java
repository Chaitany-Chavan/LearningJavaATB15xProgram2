package Ex_05_TypeCasting;

public class Lab060_TypeCasting3 {
    static void main() {
        long phone = 987654321l;
//        short s = phone; // Narrowing - implicit.
        short s1 = (short) phone; // Narrowing - Explicit.
    }
}
