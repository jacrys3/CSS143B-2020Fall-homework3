package Problem3;

import Problem1.LinkedListStack;
import Problem1.Stack;
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
        while(ptr != null){
            data.push(ptr);
            ptr = ptr.next;
        }
        ptr = list;
        for (int i = 0; i < data.size(); i++) {
            print.println(data.pop());

        }
    }
}
