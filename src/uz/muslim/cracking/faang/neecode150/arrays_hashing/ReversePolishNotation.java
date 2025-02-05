package uz.muslim.cracking.faang.neecode150.arrays_hashing;

import java.util.Stack;

public class ReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (token.equals("+")
                    || token.equals("-")
                    || token.equals("*")
                    || token.equals("/")
            ) {
                int value1 = stack.pop();
                int value2 = stack.pop();
                int calculatedAmount = calculate(value1, value2, token);
                stack.push(calculatedAmount);
            } else {
                stack.push(Integer.valueOf(token));
            }
        }

        return stack.peek();
    }

    private int calculate(int value1, int value2, String expression){
        return switch (expression) {
            case "+" -> value2 + value1;
            case "-" -> value2 - value1;
            case "*" -> value2 * value1;
            case "/" -> value2 / value1;
            default -> 0;
        };
    }
}
