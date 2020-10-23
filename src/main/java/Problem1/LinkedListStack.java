package Problem1;

import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    // use Java LinkedList to store the data
    // do not change member variables
    private LinkedList<T> data = new LinkedList<>();

    public LinkedListStack() {

    }

    @Override
    public boolean push(T val) {

        if (val != null){
            data.add(val);
            return true;
        }
        return false;
    }

    @Override
    public T pop() {
        T val = null;
        if(data.size() >= 0){
            val = data.getLast();
            data.removeLast();
        }
        return val;
    }

    @Override
    public T peek() {
        return data.getLast();
    }

    @Override
    public int size() {
        return data.size();
    }
}
