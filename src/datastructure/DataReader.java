package datastructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = "/Users/anikasian/Desktop/PnTNotes/MidtermJanuary2019/src/data/self-driving-car";

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(textFile);
			br = new BufferedReader(fr);
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}

		String st = "";

		LinkedList<String> list = new LinkedList<String>();
		Stack<String> stack = new Stack<String>();

		try {
			while ((st = br.readLine()) != null) {
				String [] words = st.split(" ");
				for (String s : words) {
					list.add(s);
					stack.add(s);
				}
			}
		} catch (IOException io) {
			System.out.println("File is empty.");
		}
		finally {
			if(fr != null)
				fr = null;
			if(br != null)
				br = null;
		}

		////////////// FIFO for LinkedList
		// enqueue
		list.addLast("Ditto!");

		// dequeue
		list.removeFirst();

		int curr = 0;
		while (curr < list.size()) {
			System.out.println(list.removeFirst());
		}


		////////////// LIFO for Stack
		// peek
		System.out.println(stack.peek());

		// push
		stack.push("Wowza!");

		// pop
		System.out.println(stack.pop());

		// search
		System.out.println("Tesla is in index: " + stack.search("Tesla"));

		// traverse
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}



	}

}
