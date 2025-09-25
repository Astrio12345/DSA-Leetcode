import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode(int v) { val = v; }
}
public class Main {
    public static ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        while (head != null) {
            ListNode next = head.next, prev = dummy;
            while (prev.next != null && prev.next.val < head.val) prev = prev.next;
            head.next = prev.next;
            prev.next = head;
            head = next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        ListNode dummy = new ListNode(0), curr = dummy;
        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) {
            curr.next = new ListNode(sc.nextInt());
            curr = curr.next;
        }
        ListNode sorted = insertionSortList(dummy.next);
        for (ListNode p = sorted; p != null; p = p.next)
            System.out.print(p.val + (p.next != null ? " -> " : ""));
    }
}