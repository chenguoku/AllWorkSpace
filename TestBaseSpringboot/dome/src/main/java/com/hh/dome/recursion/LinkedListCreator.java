package com.hh.dome.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.hh.dome.common.Node;

/**
 * 创建一个链表
 */
public class LinkedListCreator {

	/**
	 * Creates a linked list.
	 * 
	 * @param data the data to create the list.
	 * @return head of the linked list. The returned linked list ends with last node
	 *         with getNext() == null.
	 */
	public Node createLinkList(List<Integer> data) {
		if (data.isEmpty()) {
			return null;
		}
		Node firstNode = new Node(data.get(0));
		Node headOfSublist = createLinkList(data.subList(1, data.size()));
		firstNode.setNext(headOfSublist);
		return firstNode;
	}

	public Node createLargeLinkedList(int size) {

		Node prev = null;
		Node head = null;
		// prev 指向 新建好的 链表最后一个
		// head 指向 新建好的链表第一个

		for (int i = 1; i <= size; i++) {
			Node node = new Node(i);
			if (prev != null) {
				prev.setNext(node);
			} else {
				head = node;
			}
			prev = node;
		}

		return head;
	}

	public static void main(String[] args) {
		LinkedListCreator creator = new LinkedListCreator();
		Node.printLinkedList(creator.createLinkList(new ArrayList<Integer>()));
		Node.printLinkedList(creator.createLinkList(Arrays.asList(1)));
		Node.printLinkedList(creator.createLinkList(Arrays.asList(1, 2, 3, 4)));

	}

}
