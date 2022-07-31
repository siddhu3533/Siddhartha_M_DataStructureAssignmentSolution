package com.greatlearning.dataStructureAssignmentSolution.Question2;

public class RightSkewedTree {
	static TreeNode rightSkewedTreeRoot;
	static TreeNode rightSkewedTreeLast;
	//This method is used to do inorder traversal to get ascending order.
	public void convertToRightSkewedTree(TreeNode root) {
		if(root!=null) {
			convertToRightSkewedTree(root.left);
			insertIntoRightSkewedTree(root);
			convertToRightSkewedTree(root.right);
		}
	}
	//This method is used to insert tree nodes into right skewed tree. 
	public void insertIntoRightSkewedTree(TreeNode node) {
		if(rightSkewedTreeRoot==null) {
			rightSkewedTreeRoot = node;
			rightSkewedTreeLast = node;
		}
		else {
			rightSkewedTreeLast.right = node;
			rightSkewedTreeLast = rightSkewedTreeLast.right;
		}
	}
	//This method is used to print the data in right skewed tree.
	public void printRightSkewedTree() {
		TreeNode temp = rightSkewedTreeRoot;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.right;
		}
	}
}
