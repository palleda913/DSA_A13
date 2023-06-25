package in.linkedlist;

public class ListNode {
	   int val;
	   ListNode prev;
	   ListNode next;
	   ListNode() {}
	   ListNode(int val) { 
		   this.val = val; 
	   }
	   ListNode(int val, ListNode next) 
	   { 
		   this.val = val;
		   this.next = next; 
	   }
	}
