

public class stringMethods {
    public static void main(String[] args) {
        String name = "Satish";
        // System.out.println(name);

        // length()
        // int value = name.length();
        // System.out.println(value);

        // toLowerCase()
        // String lowerStr = name.toLowerCase();
        // System.out.println(lowerStr);

        // toUpperCase()
        // String upperStr = name.toUpperCase();
        // System.out.println(upperStr);

        // trim()
        // String nonTrimmedString = "     Satish     ";
        // System.out.println(nonTrimmedString);

        // String trimmedString = nonTrimmedString.trim();
        // System.out.println(trimmedString);

        // substring()
        // System.out.println(name.substring(0));
        // System.out.println(name.substring(1,4));
        // Here biginningIndex is Included and endingIndex is Excluded.

        // replace()
        // String name1 = "Harry";
        // System.out.println(name1.replace('r', 'p'));
        // System.out.println(name1.replace("r", "ier"));

        // startsWith() --> It returns True of False
        // System.out.println(name.startsWith("Sa"));

        // endsWith() --> It returns True of False
        // System.out.println(name.endsWith("ish"));

        // charAt()
        // System.out.println(name.charAt(4));

        // indexOf() --> It gives the first Occurance
        System.out.println(name.indexOf("y")); // If doesn't find the match return -1
        System.out.println(name.indexOf("i"));

        
    }
}
