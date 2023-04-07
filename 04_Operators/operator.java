public class operator {
    public static void main(String[] args) {

        // -------------------------Arithmetic Operators-----------------------------
        int a = 10;
        int b = 2;
        System.out.println("Addition : "+ (a+b));
        // System.out.println("Subtraction : "+ (a-b));
        // System.out.println("Multiply : "+ (a*b));
        // System.out.println("Divide : "+ (a/b));
        // System.out.println("Remainder : "+ (a%b));

        // -------------------Assignment Operator------------------------------------
        int c = 8;
        // c += 4;
        // c -= 4;
        // c *= 4;
        // c /= 4;
        System.out.println(c);

        // ----------------------Comparision Operator---------------------------------
        // System.out.println(8 == 8);
        // System.out.println(8 >= 10);
        // System.out.println(4 <= 8);

        // ---------------------Logical Operator--------------------------------------
        System.out.println(32 >= 4 && 24 <= 45); // If Both the values are true than the resultant value will be true
        System.out.println(56 < 4 || 12 > 6);  // If any of one statement is true than the resultant value will be true

        // ---------------------Bitwise Operator-------------------------------------
        System.out.println(2 & 3); // Output: 2
        //    1 0
        //  & 1 1
        // --------
        //    1 0 --> 2



    }    
}
