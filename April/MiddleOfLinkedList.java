//Given a non-empty, singly linked list with head node head, return a middle node of linked list. If there are two middle nodes, return the second middle node.

class MiddleOfLinkedList
{
	public ListNode middleNode(ListNode head)
	{
		/*When traversing the list with a pointer slow, make another pointer fast that traverses twice as fast. When fast reaches the end of the list, slow must be in the middle.*/
		ListNode slow = head, fast = head;
		while(fast!=null && fast.next!=null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
}
