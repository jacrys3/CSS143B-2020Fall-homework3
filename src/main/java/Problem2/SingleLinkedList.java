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
        if(head == null || head.next == null || head.next.next == null) return 0;
        int count = 0;
        ListNode p1 = head.next;
        ListNode p2;
        int temp;
        while (p1 != null){
            p2 = p1.next;
            if(p1.val == valueToRemove){

            }
            p1 = p1.next;
        }
        return count;
    }

    // reverse the linked list nodes iteratively (no recursion)
    public void reverse() {
        if(head == null || head.next == null) return;
        if(size == 1) return;
        ListNode p1 = head.next;
        ListNode p2;

        for(int i = 0; i < size - 1; i++){
            //if(p1.next == null) break;
            p2 = p1.next;
            p1.next = p1;
            head.next = p2;

            /* I know i need to put logic in here so that it puts p2 at head.next, then it puts p1 at p2.next
             * and then it puts p2 at p1.next
             */
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
