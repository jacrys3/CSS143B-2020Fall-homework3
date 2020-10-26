import Problem2.ListNode;
import Problem3.Problem3;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.Assert.*;

// do not change any function here except main()
public class Problem3Test {

    @Test
    public void testReversePrint() {
        int[][] inputs = {
                {},
                {1},
                {1, 2},
                {3, 3},
                {1, 4, 2},
                {3, 4, 5, 6, 7},
        };
        int[][] expected = {
                {},
                {1},
                {2, 1},
                {3, 3},
                {2, 4, 1},
                {7, 6, 5, 4, 3},
        };

        assertEquals(expected.length, inputs.length);

        for (int i = 0; i < inputs.length; i++) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(baos);

            Problem3.printListInReverse(arrayToList(inputs[i]), ps);

            String tmp = baos.toString().replace("\n", " ").replace("\r", "").trim();
            if (inputs[i].length != 0) {
                int[] actual = Arrays.stream(tmp.split(" ")).mapToInt(Integer::parseInt).toArray();
                assertArrayEquals(expected[i], actual);
            } else {
                assertEquals(0, tmp.length());
            }
        }
    }

    // and you thought we never use main() in this class ;)
    // this main function call printListInReverse to print on the screen
    // use this main function for debugging, okay to change
    public static void main(String[] args) {
        int[][] inputs = {
                {},
                {1, 4, 2},
                {3, 4, 5, 6, 7},
        };
        PrintStream toScreen = System.out;
        for (int[] input : inputs) {
            Problem3.printListInReverse(arrayToList(input), toScreen);
            System.out.println();
        }
    }

    @Test
    public void testArrayToList() {
        int[][] inputs = {
                null,
                {},
                {1},
                {1, 2},
                {3, 3},
                {1, 4, 2},
                {3, 4, 5, 6, 7},
        };

        for (int[] input : inputs) {
            String caseId = String.format("case %s failed", Arrays.toString(input));
            ListNode list = arrayToList(input);
            if (input == null) {
                assertNull(caseId, list);
                continue;
            }

            ListNode ptr = list;
            for (int i = 0; i < input.length; i++) {
                ptr = ptr.next;
                assertEquals(caseId, input[i], ptr.val);
            }
            assertNull(caseId, ptr.next);
        }
    }

    private static ListNode arrayToList(int[] data) {
        if (data == null) {
            return null;
        }
        ListNode head = new ListNode();  // dummy node
        ListNode ptr = head;
        for (int datum : data) {
            ptr.next = new ListNode(datum);
            ptr = ptr.next;
        }

        return head;
    }
}