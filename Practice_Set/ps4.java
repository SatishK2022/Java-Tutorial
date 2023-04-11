package Practice_Set;
import java.util.Scanner;

public class ps4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Question 1
        // int a = 10;
        // if(a = 12){
        //     System.out.println("I am 12");
        // }else{
        //     System.out.println("I am not 12");
        // }

        // Question 2
        // System.out.print("Enter Marks in Maths: ");
        // int maths = sc.nextInt();
        // System.out.print("Enter Marks in Science: ");
        // int science = sc.nextInt();
        // System.out.print("Enter Marks in Economics: ");
        // int eco = sc.nextInt();

        // float avg = (maths + science + eco)/3.0f;
        // System.out.println("You Got " + avg +"% marks.");

        // if(avg >= 40 && maths >= 33 && science >= 33 && eco >= 33){
        //     System.out.println("Congratulations! You are Promoted");
        // }else{
        //     System.out.println("You didn't Pass. Try again later.");
        // }

        // Question 3
        // float tax = 0;
        // System.out.print("Enter Your Income in Lakhs: ");
        // float income = sc.nextInt();

        // if (income <= 2.5) {
        //     tax += 0;
        // }
        // else if(income >= 2.5 && income <= 5.0){
        //     tax += 0.05 * (income - 2.5f);
        // }
        // else if(income >= 5f && income <= 10f){
        //     tax += 0.20 * (income - 2.5f);
        // }
        // else if(income >= 10f){
        //     tax += 0.30 * (income - 2.5f);
        // }

        // System.out.print("The total tax paid by the employee is: " + tax + "Lakhs");

        // Question 4
        // System.out.print("Enter the Days in Numbers: ");
        // int days = sc.nextInt();

        // switch(days){
        //     case 1:
        //         System.out.println("Monday");
        //         break;

        //     case 2:
        //         System.out.println("Tuesday");
        //         break;

        //     case 3:
        //         System.out.println("Wednesday");
        //         break;

        //     case 4:
        //         System.out.println("Thursday");
        //         break;

        //     case 5:
        //         System.out.println("Friday");
        //         break;

        //     case 6:
        //         System.out.println("Saturday");
        //         break;

        //     case 7:
        //         System.out.println("Sunday");
        //         break;
            
        //     default:
        //         System.out.println("Enter a Valid Number!");
        // }

        // Enhanced Switch
        // switch(days){
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("Thursday");
        //     case 5 -> System.out.println("Friday");
        //     case 6 -> System.out.println("Saturday");
        //     case 7 -> System.out.println("Sunday");
        //     default -> System.out.println("Enter a valid number!!");
        // }

        // Question 5
        System.out.print("Enter the year to check if the year is leap year or not: ");
        int year = sc.nextInt();

        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        }
        else{
            System.out.println(year + " is not a Leap Year.");
        }

        // Question 6
        // System.out.println("Enter the Website Link: ");
        // String website = sc.next();

        // if(website.endsWith(".org")){
        //     System.out.println("This is an Organisational Website.");
        // }
        // else if(website.endsWith(".com")){
        //     System.out.println("This is a Commercial Website.");
        // }
        // else if(website.endsWith(".in")){
        //     System.out.println("This is an Indian Website.");
        // }



        
    }
}
