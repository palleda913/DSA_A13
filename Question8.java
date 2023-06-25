package in.linkedlist;

public class Question8 {

	public static ListNode deleteNodeAtPosition(ListNode head, int position) {
        if (head == null) {
            return null; // Empty list
        }

        if (position == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }

        ListNode current = head;
        int count = 0;

        while (current != null && count < position) {
            current = current.next;
            count++;
        }

        if (current == null) {
            return head; 
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
        if (current.next != null) {
            current.next.prev = current.prev;
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

        head =deleteNodeAtPosition(head, 3);

        printList(head);
    }

}
