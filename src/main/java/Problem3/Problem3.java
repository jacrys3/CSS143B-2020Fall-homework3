package Problem3;

import Problem1.LinkedListStack;
import Problem1.ArrayStack;
import Problem2.ListNode;

import java.io.PrintStream;

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        if(list == null) return;
        if(list.next == null){
            print.println(list);
            return;
        }
        int size = 0;
        ListNode temp = list;
        while(list.next != null){
            temp = temp.next;
            size++;
        }
        temp = list;
        ArrayStack data = new ArrayStack(size);
        while(data.peek() != null){
            temp.next = (ListNode) data.peek();
            temp = temp.next;
            print.println((int) data.peek());
            data.pop();
        }
        temp.next = null;

        /*LinkedListStack data = new LinkedListStack();
        ListNode ptr = list;
        while(ptr.next != null){
            data.push(ptr);
            ptr = ptr.next;
        }
        list = ptr;
        while(data.peek() != null){
            ptr.next = (ListNode) data.peek();
            ptr = ptr.next;
            data.pop();
        }
        ptr.next = null;
        printList(list, print);*/
    }

    private static void printList(ListNode data, PrintStream print){
        while(data != null){
            print.println(data.val);
            data = data.next;
        }
    }
}
