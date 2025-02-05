package uz.muslim.cracking.faang.neecode150.stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        helper(0,0,n,new StringBuilder());

        return res;
    }

    private void helper(int open, int close, int n, StringBuilder curr){
        if(open == close && open == n){
            res.add(curr.toString());
            return;
        }

        if(open < n){
            curr.append('(');
            helper(open + 1, close, n, curr);
            curr.setLength(curr.length() - 1);
        }

        if(close < open){
            curr.append(')');
            helper(open, close + 1, n, curr);
            curr.setLength(curr.length() - 1);
        }
    }
}
