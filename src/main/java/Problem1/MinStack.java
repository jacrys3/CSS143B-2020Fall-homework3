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
        if(isMin(val)){
            mini.push(val);
        }
        return super.push(val);
    }

    @Override
    public Integer pop() {
        if(getMin() == super.peek()){
            super.pop();
            mini.pop();
            setMin(super.peek());
        }
        return super.pop();
    }

    private boolean isMin(int val){
        if(super.size() == 0){
            return true;
        } else if((Integer) mini.peek() > val) {
            mini.pop();
            mini.push(val);
            return true;
        }
        return false;
    }
    private void setMin(int min){
        if(mini.size() == 0)
            mini.push(min);
    }

    public Integer getMin() {
        Integer min = (Integer) mini.peek();
        return min;
    }
}

