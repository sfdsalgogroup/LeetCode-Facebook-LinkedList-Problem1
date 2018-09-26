/**
 * 
 */
package leetcode.facebook.problem1.solution;

/**
 * @author Gopal
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ListNode head = ListCreator.getPopulatedLinkedList();
		ListPrinter.printLinkedList(head);
		ListNode reversedHead = Solve.reverseList(head);
		ListPrinter.printLinkedList(reversedHead);
	}

}
