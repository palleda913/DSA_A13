package in.linkedlist;


public class Question7 {

	public static ListNode reverseDoublyLinkedList(ListNode head) {
		ListNode current = head;
		ListNode temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev; // Move to the next node
        }
        if (temp != null) {
            head = temp.prev;
        }

        return head;
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
        // Create a doubly linked list
    	ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.prev = head;
        head.next.next = new ListNode(3);
        head.next.next.prev = head.next;
        head.next.next.next = new ListNode(4);
        head.next.next.next.prev = head.next.next;

        head = reverseDoublyLinkedList(head);

        System.out.println("Reversed Doubly Linked List:");
        printList(head);
    }
}
