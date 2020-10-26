package Problem1;

import java.lang.reflect.Array;

public class MinStack extends ArrayStack<Integer> {
    // okay to add member variables
    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack
    ArrayStack<Integer> mini;

    public MinStack(int size) {
        super(size);
        mini = new ArrayStack(size);
    }

    @Override
    public boolean push(Integer val) {
        if(isMin(val)){
            mini.push(val);
        }
        return super.push(val);
    }

    @Override
    public Integer pop() {
        int temp = super.pop();
        if(getMin() == temp){
            mini.pop();
        }
        return temp;
    }

    private boolean isMin(int val){
        if(mini.size() == 0){
            return true;
        } else if(getMin() >= val) {
            return true;
        }
        return false;
    }

    public Integer getMin() {
        if(mini.size() == 0) return null;
        Integer min = mini.peek();
        return min;
    }
}

