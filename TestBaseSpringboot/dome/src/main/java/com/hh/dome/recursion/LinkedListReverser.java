package com.hh.dome.recursion;

import java.util.Arrays;

import com.hh.dome.common.Node;

/**
 * <p>Title: LinkedListReverser</p> 
 * <p>Description: 链表的反转</p>   
 * @author chenguoku   
 * @date 2019年3月11日
 */
public class LinkedListReverser {

	public static Node reverseLinkedList(Node node) {
		if (node == null || node.getNext() == null) {
			return node;
		}
		
		Node newHead = reverseLinkedList(node.getNext());
		node.getNext().setNext(node);
		node.setNext(null);

		return newHead;

	}

	public static void main(String[] args) {
		LinkedListCreator creator = new LinkedListCreator();
		Node.printLinkedList(reverseLinkedList(creator.createLinkList(Arrays.asList(1, 2, 3, 4))));
	}

}
