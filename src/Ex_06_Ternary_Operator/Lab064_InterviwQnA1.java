package Ex_06_Ternary_Operator;

public class Lab064_InterviwQnA1 {
    static void main() {
        int amol_age = 21;
        String result = amol_age > 18 ? (amol_age > 25 ? "You can drink": "You can't") : "No you can't go to GOA";

        System.out.println(result);
    }
}
