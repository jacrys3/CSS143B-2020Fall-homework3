package Problem1;

public class MinStack extends ArrayStack<Integer> {
    // okay to add member variables
    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack
    private int min = 0;
    private int size;

    public MinStack(int size) {
        super(size);
        this.size = size;
    }

    @Override
    public boolean push(Integer val) {
        if(min > val) min = val;
        size++;
        return super.push(val);
    }

    @Override
    public Integer pop() {
        if(min == size) min = 0;
        size--;
        return super.pop();
    }

    public Integer getMin() {
        return min;
    }
}

