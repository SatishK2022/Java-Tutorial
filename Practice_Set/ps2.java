package Practice_Set;
import java.util.Scanner;

public class ps2 {
    public static void main(String[] args) {
        
        // Question 1
        // float a = 7/4 * 9/2; // Output : 4.0 
        // float a = 7/4.0f * 9/2.0f;
        // System.out.println(a);

        // Question 2
        // char grade = 'C';
        // grade = (char)(grade + 8); // Typecasting
        // System.out.println("Encrypted Grade : " + grade);

        // // decrypting the grade
        // grade = (char)(grade - 8); // Typecasting
        // System.out.println("Decrypted Grade : " + grade);

        // Question 3
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a Number :");
        // int userInput = sc.nextInt();
        // System.out.println("Your Entered a "+ (userInput > 20) + " Number.");

        // Question 4
        // v^2 - u^2/2as
        int v = 2;
        int u = 4;
        int a = 6;
        int s = 1;
        float result = (v*v - u*u)/(2*a*s);
        System.out.println(result);
        // Output : -1.0

        // Question 5
        System.out.println(7*49/7 + 35/7);
        // Output : 54

    }
}
