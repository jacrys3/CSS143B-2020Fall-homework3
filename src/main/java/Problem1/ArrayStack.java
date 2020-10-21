package Problem1;
//
public class ArrayStack<T> implements Stack<T> {
    // do not change member variables
    private T[] data;
    private int size;


    private ArrayStack() {
    }

    public ArrayStack(int capacity) {
        size = -1;
        data = (T[])(new Object[capacity]);
    }

    @Override
    public boolean push(T val) {
        if(size >= data.length - 1){
            return false;
        }
        data[++size] = val;

        return true;
    }

    @Override
    public T pop() {
        T val = data[size];
        data[size--] = null;
        return val;
    }

    @Override
    public T peek() {
        T val = data[size];
        return val;
    }

    @Override
    public int size() {
        return size + 1;
    }
}
