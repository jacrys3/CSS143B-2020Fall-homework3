package Problem3;

import Problem1.LinkedListStack;
import Problem1.ArrayStack;
import Problem2.ListNode;

import java.io.PrintStream;

public class Problem3 {
    public static void printListInReverse(ListNode list, PrintStream print) {
        if(list.next == null){
            return;
        }
        ListNode head = list;
        list = list.next;
        LinkedListStack data = new LinkedListStack();
        while(list.next != null){
            list = list.next;
            data.push(list.val);
        }
        while(data.size() > 0){
            print.println(data.pop());
        }
        print.println(head.next.val);
    }
}
