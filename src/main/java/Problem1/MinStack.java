package Problem1;

public class MinStack extends ArrayStack<Integer> {
    // okay to add member variables
    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack
    private int min = 0;
    private int index = 0;
    private int size;

    public MinStack(int size) {
        super(size);
        this.size = 0;
    }

    @Override
    public boolean push(Integer val) {
        if(size == 0) min = val;
        else if(min > val){
            min = val;
            index++;
        }
        size++;
        return super.push(val);
    }

    @Override
    public Integer pop() {
        size--;
        if(min != peek()){
            return super.pop();
        }
        Integer num = super.pop();
        min = getMin();
        return num;
    }

    public Integer getMin() {
        if(size == 0) return null;
        else if(size == 1) return peek();
        return min;
    }
}

