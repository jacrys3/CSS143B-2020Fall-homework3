package Problem1;
//
public class ArrayStack<T> implements Stack<T> {
    // do not change member variables
    private T[] data;
    private int size;


    private ArrayStack() {
    }

    public ArrayStack(int capacity) {
        size = 0;
        data = (T[])(new Object[capacity]);
    }

    @Override
    public boolean push(T val) {
        if(val != null){
            data[size] = val;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public T pop() {
        T val;
        val = data[size - 1];
        size--;

        return val;
    }

    @Override
    public T peek() {
        return data[size - 1];
    }

    @Override
    public int size() {
        return size;
    }
}