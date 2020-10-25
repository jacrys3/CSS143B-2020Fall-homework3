package Problem1;

import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    // use Java LinkedList to store the data
    // do not change member variables
    private LinkedList<T> data;

    public LinkedListStack() {
        data = new LinkedList<>();
    }

    @Override
    public boolean push(T val) {

        if (val != null){
            data.addFirst(val);
            return true;
        }
        return false;
    }

    @Override
    public T pop() {
        T val = null;
        if(data.size() >= 0){
            val = data.getFirst();
            data.removeFirst();
        }
        return val;
    }

    @Override
    public T peek() {
        return data.getFirst();
    }

    @Override
    public int size() {
        return data.size();
    }
}
