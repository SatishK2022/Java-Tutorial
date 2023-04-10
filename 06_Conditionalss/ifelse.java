import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your age: ");
        int age = in.nextInt();
        
        if (age > 56) {
            System.out.println("You are Experienced!");
        }
        else if(age > 46) {
            System.out.println("Your are Semi-Experienced!");
        }
        else if(age > 36){
            System.out.println("You are Semi-Semi-Experienced!");
        }
        else{
            System.out.println("You are not Experienced!");
        }


        // if (age >= 18) {
        //     System.out.println("You Can Drive.");
        // }else {
        //     System.out.println("You can't Drive.");
        // }
    }
}
