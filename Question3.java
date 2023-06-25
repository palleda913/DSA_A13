package in.linkedlist;


public class Question3 {

	public static ListNode reverseKNodes(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }

        int count = 0;
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;

        // Reverse the first k nodes of the linked list
        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        // If there are more nodes remaining, recursively reverse the next k nodes
        if (next != null) {
            head.next = reverseKNodes(next, k);
        }

        return prev;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        
    	ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
       
        int k = 3; // Reverse every 3 nodes

        System.out.println("Linked list after reversing every " + k + " nodes:");
        head = reverseKNodes(head, k);
        printLinkedList(head);
    }
}
