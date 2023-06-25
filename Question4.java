package in.linkedlist;


public class Question4 {
	
	public static ListNode reverseAlternateKNodes(ListNode head, int k) {
        if (head == null || head.next == null || k <= 1) {
            return head;
        }

        ListNode current = head;
        ListNode prev = null;
        int count = 0;

        // Reverse the first k nodes
        while (current != null && count < k) {
        	ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
            count++;
        }

        // Connect the reversed k nodes to the next segment
        head.next = current;

        // Skip the next k nodes
        count = 0;
        while (current != null && count < k - 1) {
            current = current.next;
            count++;
        }

        // Recursively reverse the remaining alternate k nodes
        if (current != null) {
            current.next = reverseAlternateKNodes(current.next, k);
        }

        return prev;
    }

    public static void printList(ListNode head) {
    	ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a sample linked list
    	ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next.next.next = new ListNode(10);

        System.out.println("Original Linked List:");
        printList(head);

        int k = 3; // Set the value of k

        head = reverseAlternateKNodes(head, k);

        System.out.println("Modified Linked List:");
        printList(head);
    }

    
}
