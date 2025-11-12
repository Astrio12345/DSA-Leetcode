import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Main {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
        return dummy.next;
    }
    public static ListNode createList(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements of first linked list: ");
        String[] input1 = sc.nextLine().trim().split(" ");
        int[] arr1 = Arrays.stream(input1).mapToInt(Integer::parseInt).toArray();
        System.out.print("Enter elements of second linked list: ");
        String[] input2 = sc.nextLine().trim().split(" ");
        int[] arr2 = Arrays.stream(input2).mapToInt(Integer::parseInt).toArray();
        ListNode l1 = createList(arr1);
        ListNode l2 = createList(arr2);
        System.out.println("\nLinked List 1:");
        printList(l1);
        System.out.println("Linked List 2:");
        printList(l2);
        ListNode result = addTwoNumbers(l1, l2);
        System.out.println("\nResult:");
        printList(result);
    }
}
