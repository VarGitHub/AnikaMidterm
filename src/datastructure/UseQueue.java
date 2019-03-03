package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<Integer> stack = new LinkedList<>();

		// add
		stack.add(12);
		stack.add(45);
		stack.add(2);
		stack.add(0);

		// peek
		int peek = stack.peek();

		// remove
		int removedItem = stack.remove();

		// poll
		int pulledItem = stack.poll();

		Iterator<Integer> iter = stack.iterator();
		while(iter.hasNext())
			System.out.print(iter.next() + " ");

	}

}
