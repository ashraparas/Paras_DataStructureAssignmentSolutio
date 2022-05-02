package com.glearning.pg.main;

import com.glearning.pg.services.BST_to_SkwdTree;
import com.glearning.pg.services.Node;
import com.glearning.pg.services.PRNRightSkwdTree;

@SuppressWarnings("unused")/* To ignore warnings */

public class Driver {
	
	public static void main(String[] args) {
		
    	/*
    	BST_to_SkwdTree tree = new BST_to_SkwdTree();
    	PRNRightSkwdTree printRightSkewed = new PRNRightSkwdTree();
    	*/
    	
        BST_to_SkwdTree.node = new Node(50);
        BST_to_SkwdTree.node.left = new Node(30);
        BST_to_SkwdTree.node.right = new Node(60);
        BST_to_SkwdTree.node.left.left = new Node(10);
        BST_to_SkwdTree.node.right.left = new Node(55);
       
        BST_to_SkwdTree.bstToSkwdTree(BST_to_SkwdTree.node);
        
        PRNRightSkwdTree.printRightSkewed(BST_to_SkwdTree.headNode);
        
	}

}
