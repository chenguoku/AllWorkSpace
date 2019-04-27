package com.hh.dome.loop;

import java.util.Arrays;

import com.hh.dome.common.Node;
import com.hh.dome.recursion.LinkedListCreator;

public class LinkedListDeletor {

	/**
	 * 
	 * @Title: deleteIfEquals @Description: 给一个链表，并删除 和给出的 value值，一样的
	 *         节点 @param @param head @param @param value @param @return @return
	 *         Node @throws
	 */
	public Node deleteIfEquals(Node head, int value) {

		while (head != null && head.getValue() == value) {
			head = head.getNext();
		}
		if (head == null) {
			return null;
		}

		Node prev = head;
		// 保证 prev 是新链表的最后一个，并且新链表中没有 要删除的节点
		while (prev.getNext() != null) {
			if (prev.getNext().getValue() == value) {
				prev.setNext(prev.getNext().getNext());
			} else {
				prev = prev.getNext();
			}
		}

		return head;
	}

	public static void main(String[] args) {

		LinkedListCreator creator = new LinkedListCreator();
		LinkedListDeletor deletor = new LinkedListDeletor();

		Node.printLinkedList(deletor.deleteIfEquals(creator.createLinkList(Arrays.asList(1, 2, 3, 3, 4)), 3));
		Node.printLinkedList(deletor.deleteIfEquals(creator.createLinkList(Arrays.asList(2, 2, 3, 2, 4)), 2));
		Node.printLinkedList(deletor.deleteIfEquals(creator.createLinkList(Arrays.asList(1, 2, 3, 3, 3)), 3));

	}

}
