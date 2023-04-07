package Exercise;
import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        System.out.println("Enter the Marks of 5 Subject :-");
        Scanner marks = new Scanner(System.in);
        System.out.print("Enter the Marks of First Sub : ");
        float mark1 = marks.nextFloat();
        System.out.print("Enter the Marks of Second Sub : ");
        float mark2 = marks.nextFloat();
        System.out.print("Enter the Marks of Third Sub : ");
        float mark3 = marks.nextFloat();
        System.out.print("Enter the Marks of Fourth Sub : ");
        float mark4 = marks.nextFloat();
        System.out.print("Enter the Marks of Fifth Sub : ");
        float mark5 = marks.nextFloat();
        float sum = mark1 + mark2 + mark3 + mark4 + mark5;
        float percentage = (sum/500)*100;
        // System.out.println(percentage);
        System.out.println("Congrats! You Got " + percentage +"% Marks");
    }
}
