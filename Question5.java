package in.linkedlist;

public class Question5 {

	ListNode head;
	
	public static ListNode removeLastOccurence(ListNode head,int k) {
       
        ListNode current=head;
        ListNode prevOccur=null;
        ListNode lastOccur=null;
        ListNode prev=null;
        
        while(current!=null) {
        	if(current.val==k) {
        		lastOccur =current;
        		prevOccur=prev;
        	}
        		prev = current;
                current = current.next;
        }

            // If the last occurrence is found, delete the node
            if (lastOccur != null) {
                if (prevOccur == null) {
                    // The last occurrence is the first node
                    head = head.next;
                } else {
                    // The last occurrence is not the first node
                    prevOccur.next = lastOccur.next;
                }
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
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        
        int k = 2; 
       
        printList( removeLastOccurence(head,k));

	}

}
