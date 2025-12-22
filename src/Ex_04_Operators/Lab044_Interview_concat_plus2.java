package Ex_04_Operators;

public class Lab044_Interview_concat_plus2 {
    static void main() {
        //+
        int a= 10;
        int b= 10;
//        System.out.println(a+b);

        //+ string --> concatination
        String first_name = "chaitany";
        String last_name = "Chavan";
//        System.out.println(first_name+last_name+a+b); // concationation
//        System.out.println(a+b+first_name+last_name); // first addition then concatinantion
        System.out.println(first_name+last_name+(a+b)); // for BODMAS Formula used
//        B-brackets
//        O-Order(power , indices , root)
//        D-division
//        M-Multiplication
//        A-Addition
//        S-Subtraction

//         First of all , whenever it sees strings
//        it will do concat  and for the next
//        one also it will also do concat
//        but when it sees integer it will do matematic operation first
//        the second time it will see string
//        then it will do concat as well
    }
}
