/**
 * 
 */
package leetcode.facebook.problem1.solution;

import leetcode.facebook.problem1.solution.ListNode;

/**
 * @author Gopal
 *
 */
public class ListCreator {

	private ListCreator() {
		// NOOP
	}

	public static ListNode getPopulatedLinkedList() {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);

		node1.next = node2;
		node2.next = node3;
		node3.next = node4;

		return node1;
	}

}
