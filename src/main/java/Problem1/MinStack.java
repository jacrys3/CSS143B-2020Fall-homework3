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
        if(mini.size() == 0) mini.push(val);
        else if((Integer) mini.peek() > val){
            mini.pop();
            mini.push(val);
        }
        return super.push(val);
    }

    @Override
    public Integer pop() {
        if(mini.peek() == super.peek()){
            mini.pop();
        }
        return super.pop();
    }

    public Integer getMin() {
        return (Integer) mini.peek();
    }
}

