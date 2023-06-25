package in.linkedlist;

public class Question2 {
	
    public static ListNode removeDuplicates(ListNode head) {
    	 if (head == null || head.next == null) {
             return null;
         }
    	 
    	ListNode current=head;
    	while(current.next!=null) {
    		if(current.val==current.next.val) {
    			current.next=current.next.next;
    		
    		}else
    			current=current.next;
    		
    	}
    	
		return head;
        
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
		ListNode node = new ListNode(11);

        node.next = new ListNode(11);
        node.next.next = new ListNode(11);
        node.next.next.next = new ListNode(21);
        node.next.next.next.next = new ListNode(43);
        node.next.next.next.next.next = new ListNode(43);

        ListNode res = removeDuplicates(node);
        printLinkedList(res);
   
	}

}
