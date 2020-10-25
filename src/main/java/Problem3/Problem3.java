package Problem3;

import Problem1.LinkedListStack;
import Problem1.ArrayStack;
import Problem2.ListNode;

import java.io.PrintStream;

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        if(list == null || list.next == null){
            print.println(list);
            return;
        }
        LinkedListStack data = new LinkedListStack();
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
        printList(list, print);
    }

    private static void printList(ListNode data, PrintStream print){
        while(data != null){
            print.println(data.val);
            data = data.next;
        }
    }
}
