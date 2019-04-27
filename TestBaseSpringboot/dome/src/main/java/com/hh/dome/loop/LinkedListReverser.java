package com.hh.dome.loop;

import java.util.Arrays;

import com.hh.dome.common.Node;
import com.hh.dome.recursion.LinkedListCreator;

public class LinkedListReverser {

	public static Node reverseLinkedList(Node head) {
		Node newHead = null;
		Node curHead = head;

		// loop invariant:
		// newHead points to the linked list already reversed.
		// curHead points to the linked list not yet reversed.
		while (curHead != null) {
			// Loop invariant holds.
			Node next = curHead.getNext();
			curHead.setNext(newHead);
			newHead = curHead;
			curHead = next;
			// Loop invariant holds.
		}
		// Loop invariant holds.

		return newHead;

	}

	public static void main(String[] args) {
		LinkedListCreator creator = new LinkedListCreator();
		Node.printLinkedList(reverseLinkedList(creator.createLinkList(Arrays.asList(1, 2, 3, 4))));
	}

}
