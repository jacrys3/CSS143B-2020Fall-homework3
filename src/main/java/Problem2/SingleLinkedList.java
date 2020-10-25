package Problem2;


// all functions assume using dummy node
public class SingleLinkedList {
    // do not add member variables
    private ListNode head;
    private int size;

    public SingleLinkedList() {
        head = new ListNode();  // dummy node
    }

    // copy constructor
    public SingleLinkedList(SingleLinkedList list) {
        if(list==null){
            return;
        }
        ListNode p1 = new ListNode(); // followed prof Du youtube video for this constructor.
        head = p1;

        ListNode p2 = list.head.next;

        while(p2 != null){
            p1.next = new ListNode(p2.val);
            p1 = p1.next;
            p2 = p2.next;
        }
        size = list.size;
    }

    public int removeAll(int valueToRemove) {
        int count = 0;
        if(head == null || head.next == null) return 0;
        if(head.val == valueToRemove) {
            head = null;
            return 1;
        }
        ListNode p1 = head;
        for (int i = 0; i < size - 1; i++) {
            if(p1.val == valueToRemove){
                p1.next = p1;
                p1 = p1.next;
                count++;
            }
        }
        return count;
    }

    // reverse the linked list nodes iteratively (no recursion)
    public void reverse() {
        //if(head == null || head.next == null) return;
        ListNode p1 = head.next;

        while(p1 != null){
            ListNode p2 = p1.next;
            head.next = p2;
            p1.next = p2;
        }

    }

    // do not change any function below

    public SingleLinkedList(int[] data) {
        this();
        if (data == null) {
            return;
        }
        ListNode ptr = head;
        for (int datum : data) {
            ptr.next = new ListNode(datum);
            ptr = ptr.next;
            size++;
        }
    }

    // Appends the specified element to the end of this list
    public void add(int val) {
        size++;
        ListNode ptr = head;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = new ListNode(val);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        ListNode ptr = head.next;
        while (ptr != null) {
            builder.append(ptr.val).append(ptr.next == null ? " -> end " : " -> ");
            ptr = ptr.next;
        }
        return builder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof SingleLinkedList)) {
            return false;
        }

        SingleLinkedList otherList = (SingleLinkedList) obj;

        if (this.size != otherList.size) {
            return false;
        }
        ListNode n1 = head.next;
        ListNode n2 = otherList.head.next;
        while (n1 != null && n2 != null) {
            if (n1.val != n2.val) {
                return false;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return (n1 == null && n2 == null);
    }

    public int getSize() {
        return size;
    }
}
