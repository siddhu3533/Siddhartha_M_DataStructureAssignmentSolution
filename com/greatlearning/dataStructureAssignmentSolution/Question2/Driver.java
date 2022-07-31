package com.greatlearning.dataStructureAssignmentSolution.Question2;

public class Driver {

	public static void main(String[] args) {
		TreeNode root;
		RightSkewedTree rightSkewedTreeObj = new RightSkewedTree();
		root = new TreeNode(50);
		root.left = new TreeNode(30);
		root.right = new TreeNode(60);
		root.left.left = new TreeNode(10);
		root.right.left = new TreeNode(55);
		rightSkewedTreeObj.convertToRightSkewedTree(root);
		rightSkewedTreeObj.printRightSkewedTree();
	}

}
