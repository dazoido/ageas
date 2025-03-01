package uk.co.ageas;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Requirement
 * -----------
 * The input is a "string" containing 4 digits 0 and 1 only ex: "1101" etc.
 * Using the below formula convert the input string into a number.
 * <p>
 * Formula:
 * "1101" = 11
 * 1*2(0) + 1*2(1) + 0*2(2) + 1*2(3) = 11
 * <p>
 * 2(0) - 2 to the power of 0
 * 2(1) - 2 to the power of 1 ... etc
 * <p>
 * Ensure that input string only contains 0 and 1, return 0 if this is not the case
 * <p>
 * ====================================================
 * Please use Java 8 functional style where applicable.
 * Run the test cases to check whether all the conditions have passed.
 */


public class Exercise2 {
    private static String calculate(String input) {

        System.out.println("Input-->" + input);
        String result = "";

        // write your logic here...
        if (input == null || 
            !input.matches("[0-1]+")) {
            return String.valueOf(0);
        }

        String[] digits = input.split("(?!^)");
        int resultInt = IntStream.range(0, digits.length)
                    .map(i -> (Integer.parseInt(digits[i]) * (int) Math.pow(2, i)))
                    .sum();

        System.out.println("resultInt -> " + resultInt);

        result = Integer.toString(resultInt);
        System.out.println("result -> " + result);
        return result;
    }

    public static String check(String input) {
        return calculate(input);
    }

}