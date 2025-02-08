package uz.muslim.cracking.faang.neecode150.stack;

import java.util.Stack;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] res = new int[length];
        Stack<Pair> stack = new Stack<>();
        Pair first = new Pair(0, temperatures[0]);
        stack.push(first);
        for (int i = 1; i < length; i++) {
            if (temperatures[i] > temperatures[i - 1]){
                while (!stack.isEmpty() && stack.peek().value < temperatures[i]){
                    Pair pair = stack.pop();
                    res[pair.index] = i - pair.index;
                }
            }
            stack.push(new Pair(i, temperatures[i]));
        }

        return res;
    }

    static class Pair {
        private final int index;
        private final int value;

        public Pair(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}
