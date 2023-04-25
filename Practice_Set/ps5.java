package Practice_Set;
import java.util.*;

public class ps5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question-1
        // for(int i = 5; i >= 0; i--){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Question-2
        // int sum = 0;
        // int n = 3;
        // for(int i = 0; i < n; i++){
        //     sum = sum + (2*i);  // for even (2*i)
        // }
        // System.out.print("Sum of first "+ n + " even numbers is: " + sum);

        // Question-3
        // System.out.print("Enter a Number to get the Table: ");
        // int n = sc.nextInt();
        // for(int i = 1; i <= 10; i++){
        //     System.out.println(n + " x " + i + " = " + n*i);
        // }

        // Question-4
        // System.out.print("Enter a Number to get the Table: ");
        // int n = sc.nextInt();
        // for(int i = 10; i >= 1; i--){
        //     System.out.println(n + " x " + i + " = " + n*i);
        // }

        // Question-5
        // System.out.print("Enter a number to get the Factorial: ");
        // int n = sc.nextInt();
        // int fact = 1;
        // for(int i = 1; i <= n; i++){
        //     fact = fact * i;
        // }
        // System.out.print("The Factorial of " + n + " is " + fact);

        // Question-6
        // System.out.print("Enter a number to get the Factorial: ");
        // int n = sc.nextInt();
        // int fact = 1;
        // int i = 1;
        // while(i <= n){
        //     fact = fact * i;
        //     i++;
        // }
        // System.out.print("The Factorial of " + n + " is " + fact);

        // Question-7
        // int i = 5;
        // while(i > 0){
        //     int j = 1;
        //     while(j < i){
        //         System.out.print("*");
        //         j++;
        //     }
        //     i--;
        //     System.out.println();
        // }

        // Question-8
        // True -> We can transform the for loop to while loop
        //                          and while loop to for loop
        
        // Question-9
        System.out.print("Enter a Number to get the Sum of the Table: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum = sum + (n*i);
        }
        System.out.print("The Sum of table " + n + " is " + sum);
        
    }
}
