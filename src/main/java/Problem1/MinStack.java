package Problem1;

import java.lang.reflect.Array;

public class MinStack extends ArrayStack<Integer> {
    // okay to add member variables
    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack
    ArrayStack mini;

    public MinStack(int size) {
        super(size);
        mini = new ArrayStack(size);
    }

    @Override
    public boolean push(Integer val) {
        if(super.size() == 0){
            mini.push(val);
        } else if((Integer) mini.peek() > val) {
            mini.pop();
            mini.push(val);
        }
        return super.push(val);
    }

    @Override
    public Integer pop() {
        /* i know i need to be able to pop the main array and if the value being popped is the min value then
         * i need to find a new min but i dont know how to do that currently so ill come back to this.
         */
        return super.pop();
    }

    public Integer getMin() {
        if(mini.size() == 0) return null;
        return (Integer) mini.peek();
    }
}

