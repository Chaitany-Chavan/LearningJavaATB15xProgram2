package Ex_05_TypeCasting;

public class Lab062_Casting_Char {
    static void main() {
        char ch = 'A';
        int ascii = ch; // Widening

        int num = 66; // Narrow
        char letter = (char) num;

    }
}
