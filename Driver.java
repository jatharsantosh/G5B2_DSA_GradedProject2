package org.greatlearning.services.main;

import org.greatlearning.services.BSTtoSkewedTree;
import org.greatlearning.services.Node;
import org.greatlearning.services.PrintRightSkewedTree;

public class Driver {

	public static void main(String[] args) {

		BSTtoSkewedTree.node = new Node(50);
		BSTtoSkewedTree.node.left = new Node(30);
		BSTtoSkewedTree.node.right = new Node(60);
		BSTtoSkewedTree.node.left.left = new Node(10);
		BSTtoSkewedTree.node.right.left = new Node(55);

		BSTtoSkewedTree.bstToSkewedTree(BSTtoSkewedTree.node);

		PrintRightSkewedTree.printRightSkewed(BSTtoSkewedTree.headNode);

	}

}