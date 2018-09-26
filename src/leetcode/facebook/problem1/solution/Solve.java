/**
 * 
 */
package leetcode.facebook.problem1.solution;

/**
 * @author Gopal
 *
 */
public class Solve {

	private Solve() {
		// NOOP
	}

	public static ListNode reverseList(ListNode head) {
		if (head == null) {
			return head;
		}

		ListNode prevNode = null;
		ListNode currentNode = head;
		ListNode nextNode = head.next;

		if (nextNode == null) {
			return currentNode;
		}

		while (nextNode != null) {
			nextNode = currentNode.next;
			currentNode.next = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;
		}

		return prevNode;
	}

}
