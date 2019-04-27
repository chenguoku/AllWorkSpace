package com.hh.dome.tree;

public class TreeTraversal {

	public void preOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.print(root.value);
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}

	public void inOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		inOrder(root.getLeft());
		System.out.print(root.value);
		inOrder(root.getRight());
	}

	public void postOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		postOrder(root.getLeft());
		postOrder(root.getRight());
		System.out.print(root.value);
	}

	public String postOrder(String preOrder, String inOrder) {
		if (preOrder.isEmpty()) {
			return "";
		}

		char rootValue = preOrder.charAt(0);
		int rootIndex = inOrder.indexOf(rootValue);

		return postOrder(preOrder.substring(1, 1 + rootIndex), inOrder.substring(0, rootIndex))
				+ postOrder(preOrder.substring(1 + rootIndex), inOrder.substring(1 + rootIndex)) 
				+ rootValue;

	}

	public static void main(String[] args) {

		TreeCreator creator = new TreeCreator();
		TreeTraversal traversal = new TreeTraversal();
		TreeNode root = creator.createSampleTree();
		traversal.preOrder(root);
		System.out.println();
		traversal.inOrder(root);
		System.out.println();
		traversal.postOrder(root);
		System.out.println();
		System.out.println("===");
		TreeNode tree = creator.createTree("ABDEGCF", "DBGEAFC");
		traversal.postOrder(tree);

	}

}
