package JavaArrays_String;

public class StringMethods{
    public static void main(String[] args) {

    String s ="welcome";
    String s1 = "to java";
        System.out.println(s.length()); // 7
        System.out.println(s.concat(s1)); // joining of strings

        s="   welcome    ";
        System.out.println("Before trimming:" + s);
        System.out.println("After trimming: "+ s.trim());

        //charAt()
        s="welcome";
        System.out.println(s.charAt(4)); // 0 ; based on index no

        // contains() --> returns true or false
        s="welcome";
        System.out.println(s.contains("Wel"));
        System.out.println(s.contains("wel")); // true
        System.out.println(s.contains("com")); // true

        // comparing strings equals()

        s="Welcome";
        System.out.println(s.equals("Welcome")); // true
        System.out.println(s.equals("Wel come")); // false
        System.out.println(s.equals("welcome")); // false

        System.out.println(s.equalsIgnoreCase("welcome"));// true

        // replacing characters

        s="Welcome to Java";
        System.out.println(s.replace('o','i'));//Welcime ti Java
        System.out.println(s.replace("Java","selenium")); //Welcome to selenium

        // extracting substring from the main string
        s="Welcome"; // starting index= 0 1 ... 6  ending index=1 2 ... 7
        System.out.println(s.substring(0,4)); // Welc  // start indec= 0,  Ending index =4

        // converting case
        s="WELCOME";
        System.out.println(s.toLowerCase()); // welcome
        System.out.println(s.toUpperCase()); // WELCOME


    }

}
