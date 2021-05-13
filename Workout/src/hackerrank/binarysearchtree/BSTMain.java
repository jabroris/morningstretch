package hackerrank.binarysearchtree;

import java.util.*;
import java.io.*;

class Node {
    Node left, right;
    int data;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BSTMain {

	public static int getHeight(Node root) {
      //Write your code here
		if(root == null)
			return -1;
		return 1 + Math.max(getHeight(root.right), getHeight(root.left));
    }

    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        }
        else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            }
            else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
    
    public static void levelOrder(Node root)
    {
    	Queue<Node> q = new LinkedList<Node>();
    	
    	q.add(root);
    	while(!q.isEmpty())
    	{
    		Node tempNode = q.poll();
    		System.out.println(tempNode.data);
    		
    		if(tempNode.left != null)
    		{
    			q.add(tempNode.left);
    		}
    		
    		if(tempNode.right != null)
    		{
    			q.add(tempNode.right);
    		}
    	}
    }
    
    public static void printLevel(Node root, int level)
    {
    	if(root == null)
    		return;
    	if(level == 1)
    		System.out.print(root.data + " ");
    	else if (level > 1)
    	{
    		printLevel(root.left, level--);
    		printLevel(root.right, level--);
    	}
    }
    
    public static void printLevelOrder(Node root)
    {
    	int h = getHeight(root);
    	for(int i = 1; i <= h; i++)
    	{
    		printLevel(root, i);
    	}
    	
    }
    
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    int T = 9; //sc.nextInt();
	    Node root = null;
	    while(T-- > 0) {
	        int data = (int) (T + Math.random()*10);//sc.nextInt();
	        root = insert(root, data);
	    }
	    int height = getHeight(root);
	    System.out.println(height);
	    System.out.println();
	    printLevelOrder(root);
	    System.out.println("\n");
	    
	    levelOrder(root);
	    
	    
	}
}

