package in.linkedlist;

public class Question1 {
	
	public static ListNode findGreaterNode(ListNode list1,ListNode list2) {
		if (list1 == null || list2 == null) {
            return null;
        }
		ListNode ptr1=list1;
		ListNode ptr2=list2;
		ListNode current=null;
	
		ListNode newList=null;
		while (ptr1 != null && ptr2 != null) {
			ListNode newNode=null;
			if(ptr1.val>ptr2.val) {
				newNode=new ListNode(ptr1.val);
			}else 
				newNode=new ListNode(ptr2.val);
			
				ptr1=ptr1.next;
			    ptr2=ptr2.next;
			
			  if (newList == null) {
	                newList = newNode;
	                current = newList;
	            } else {
	                current.next = newNode;
	                current = current.next;
	            }
		}
           
		return newList;
        
    }
	

    
   static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }


	public static void main(String[] args) {
		ListNode node1 = new ListNode(5);
        node1.next = new ListNode(2);
        node1.next.next = new ListNode(3);
        node1.next.next.next = new ListNode(8);
        
        ListNode node2 = new ListNode(1);
        node2.next = new ListNode(7);
        node2.next.next = new ListNode(4);
        node2.next.next.next = new ListNode(5);
    
        ListNode result = findGreaterNode(node1, node2);
        printLinkedList(result);
	}
}
