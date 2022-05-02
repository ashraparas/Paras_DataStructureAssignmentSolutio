package com.glearning.pg.services;

public class PRNRightSkwdTree {
	
	/* Function to traverse the right skewed tree using recursion 
	 */
	
    public static void printRightSkewed(Node root) {
    	
        if(root == null) {
            return;
        }
        System.out.print(root.val + " ");
        printRightSkewed(root.right);       
    }

}
