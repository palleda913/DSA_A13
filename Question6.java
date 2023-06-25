package in.linkedlist;


public class Question6 {
	
	 public static ListNode mergeSortedLists(ListNode a, ListNode b) {
	      
	        ListNode dummyNode = new ListNode(0);
	        ListNode current = dummyNode;

	      
	        while (a != null && b != null) {
	            if (a.val <= b.val) {
	                current.next = a;
	                a = a.next;
	            } else {
	                current.next = b;
	                b = b.next;
	            }
	            current = current.next;
	        } 
	        if (a != null) {
	            current.next = a;
	        } else {
	            current.next = b;
	        }
	        return dummyNode.next;
	    }

	    public static void printList(ListNode head) {
	    	ListNode current = head;
	        while (current != null) {
	            System.out.print(current.val+ " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        // Create the first sorted linked list
	    	ListNode a = new ListNode(5);
	        a.next = new ListNode(10);
	        a.next.next = new ListNode(15);

	        // Create the second sorted linked list
	        ListNode b = new ListNode(2);
	        b.next = new ListNode(3);
	        b.next.next = new ListNode(20);


	        ListNode merged = mergeSortedLists(a, b);

	        System.out.println("Merged List:");
	        printList(merged);
	    }
	} 



