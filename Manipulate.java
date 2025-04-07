import java.util.function.Function;

public class Manipulate {
    public static void main(String[] args) {
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        Function<String, String> toLowerCase = str -> str.toLowerCase();
        Function<String, String> reverseString = str -> new StringBuilder(str).reverse().toString();

        String input = "Hello World";

        System.out.println("Original String: " + input);
        System.out.println("Uppercase: " + toUpperCase.apply(input));
        System.out.println("Lowercase: " + toLowerCase.apply(input));
        System.out.println("Reversed: " + reverseString.apply(input));
    }
}
