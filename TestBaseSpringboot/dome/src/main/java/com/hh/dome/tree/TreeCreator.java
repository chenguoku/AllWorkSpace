package com.hh.dome.tree;

import org.junit.Test;

public class TreeCreator {

	public TreeNode createSampleTree() {
		TreeNode root = new TreeNode('A');
		root.setLeft(new TreeNode('B'));
		root.getLeft().setLeft(new TreeNode('D'));
		root.getLeft().setRight(new TreeNode('E'));
		root.getLeft().getRight().setLeft(new TreeNode('G'));
		root.setRight(new TreeNode('C'));
		root.getRight().setLeft(new TreeNode('F'));

		return root;
	}
	
	public TreeNode createTree(String preOrder,String inOrder) {
		if (preOrder.isEmpty()) {
			return null;
		}
		
		char rootValue = preOrder.charAt(0);
		int rootIndex = inOrder.indexOf(rootValue);
		
		TreeNode root = new TreeNode(rootValue);
		root.setLeft(createTree(preOrder.substring(1, 1+rootIndex),inOrder.substring(0,rootIndex)));
		root.setRight(createTree(preOrder.substring(1+rootIndex), inOrder.substring(1+rootIndex)));
	
		return root;
		
	}
	
	@Test
	public void test() {
		TreeCreator treeCreator = new TreeCreator();
		int[] pre = {1,2,4,7,3,5,6,8};
		int[] in = {4,7,2,1,5,3,8,6};
		TreeNode reConstructBinaryTree = treeCreator.reConstructBinaryTree(pre,in);
		System.out.println(1);
	}
	
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
    	
    	if (pre.length == 0) {
			return null;
		}
    	
        String preStr = changeString(pre);
        String inStr = changeString(in);
        char rootValue = preStr.charAt(0);
        int rootIndex = inStr.indexOf(rootValue);
        
        TreeNode rootTree = new TreeNode(rootValue);
        
        rootTree.left = reConstructBinaryTree(change(preStr.substring(1,1+rootIndex)),change(inStr.substring(0,rootIndex)));
        rootTree.right = reConstructBinaryTree(change(preStr.substring(1+rootIndex)),change(inStr.substring(1+rootIndex)));
        return rootTree;
    }
    private String changeString(int [] arr) {
    	StringBuffer str = new StringBuffer();
    	for (int s : arr) {
    		str.append(s);
    	}
    	return str.toString();
    }
    private int[] change(String string){
        int[] in = new int[string.length()];

        for (int i = 0; i < string.length(); i++) {
            in[i] = Integer.parseInt(string.substring(i, i+1));
        }
        return in;
    }
}
