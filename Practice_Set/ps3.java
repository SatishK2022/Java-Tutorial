package Practice_Set;

public class ps3 {
    public static void main(String[] args) {
        // Qus-1 Write a Java Program to convert a string to lowercase.
        // String name = "SAtish";
        // name = name.toLowerCase();
        // System.out.println(name);

        // Qus-2 Write a Java Program to replace spaces with underscore.
        // String about = "My Name is Satish Kumar.";
        // about = about.replace(" ", "_");
        // System.out.println(about);

        // Qus-3 Write a Java program to fill in a letter template which looks like Below:
        //      letter = "Dear <|name|>, Thanks a lot"
        //      Replace <|name|> with a String (Some Name)
        // String letter = "Dear <|name|>, Thanks a log.";
        // letter = letter.replace("<|name|>", "Satish");
        // System.out.println(letter);

        // Qus-4 Write a Java Program to detect double and triple spaces in a string.
        // String spaces = "This string contains  double and triple   spaces";
        // System.out.println(spaces.indexOf("  "));
        // System.out.println(spaces.indexOf("   "));

        // Qus-5 Write a program to format the following letter using escape sequence Characters.
        //      letter = "Dear Satish, Have a Nice Day. Thanks"
        String letter = "Dear Satish,\n\tHave a Nice Day.\n\tThanks!";
        System.out.println(letter);

    }
}
