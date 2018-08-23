package lintcode;


public class ReverseLinkedList {

	public ListNode reverse(ListNode head) {
		ListNode prev=null;
		ListNode cur=head;
		while(cur!=null) {
			ListNode next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
		}
		return prev;
    }
	
	public static void main(String[] args) {
		ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
	}

}
