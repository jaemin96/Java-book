package algorithm.basic.math.data;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    List<Integer> stack;
    public Stack() {
        stack = new ArrayList<>();
    }

    // pop
    public int pop() {
        if(!this.stack.isEmpty()) {
            int value = this.stack.get(this.stack.size()-1);
            this.stack.remove(this.stack.size()-1);
            return value;
        }

        return -1;
    }

    // push
    public void push(int n) {
        this.stack.add(n);
    }

    public boolean isStackEmpty() {
        return this.stack.isEmpty();
    }


    public int getStackSize() {
        return this.stack.size();
    }
}
