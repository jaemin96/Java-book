package algorithm.basic.math.data;

import java.util.ArrayList;
import java.util.List;

public class BracketsValidation {
    List<Character> stack;

    public BracketsValidation() {
        stack = new ArrayList<>();
    }

    public void push(char ch) {
        this.stack.add(ch);
    }

    public boolean isStackEmpty() {
        return this.stack.isEmpty();
    }

    public char pop() {
        if(!this.stack.isEmpty()) {
            char value = this.stack.get(this.stack.size()-1);
            this.stack.remove(this.stack.size()-1);
            return value;
        }

        return ' ';
    }
    public boolean checkBrackets(String str) {
        for (int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '(') {
                this.push(str.charAt(i));
            }else if(str.charAt(i) == ')') {
                char value = this.pop();
                if(value == ' ') {
                    return false;
                }
            }
        }

        return this.isStackEmpty();
    }
}
