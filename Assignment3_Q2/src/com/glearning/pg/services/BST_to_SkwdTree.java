package com.glearning.pg.services;

public class BST_to_SkwdTree {
	
	public static Node node;
    static Node prevNode = null;
    public static Node headNode = null;
   
    /* Function to to flatten the binary search tree into a skewed tree
     * in increasing order */
    
    public static void bstToSkwdTree(Node root) {
       
        /* consider the root is null */
    
    	if(root == null)
            return;

        bstToSkwdTree(root.left);
        
        Node rightNode = root.right;
       
        /* Condition to check if the root Node 
         * of the skewed tree is not defined
         */
        
        if(headNode == null) {
            headNode = root;
            root.left = null;
            prevNode = root;
        }
        else {
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }

        bstToSkwdTree(rightNode);
        
    }

}
