import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Taking Input from the user");
        System.out.println("Enter the 1st number : ");
        // int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("Enter the 2nd Number");
        // int b = sc.nextInt();
        float b = sc.nextFloat();
        float sum = a + b;
        System.out.println("The Sum is : " + sum);         
        */
       
        // System.out.println("Please Enter Something?");
        // boolean b1 = sc.hasNextInt();
        // System.out.println(b1);

        System.out.println("Enter a String :");
        // String str = sc.next();  // It only stores the first word
        String str = sc.nextLine();  // It stores the whole sentence
        System.out.println(str);

    }
}