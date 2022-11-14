package org.greatlearning.services;

public class PrintRightSkewedTree {
	public static void printRightSkewed(Node root) {

		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		printRightSkewed(root.right);
	}
}
