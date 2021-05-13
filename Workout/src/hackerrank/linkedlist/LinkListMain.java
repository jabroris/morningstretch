package hackerrank.linkedlist;

import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}

class LinkListMain {

    public static  Node insert(Node head,int data) {
    
    	//Node tail = head;
        if(head==null)
        {
        	//System.out.println("head is null");
        	head = new Node(data);
        	System.out.println(head.next);
        }
        else
        {
        	Node n = new Node(data);
        	Node last = head;
        	while(last.next!=null)
        	{
        		last = last.next;
        	}
        	last.next = n;
        	//return n;
        }
        return head;
    }

	public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
        System.out.println();
    }
	
	public static Node removeDuplicates(Node head) {
		
		if(head == null)
			return head;
		Node curr = null;
		while(head != null)
		{
			curr = head;
			System.out.println(head.data);
			while(curr.next != null)
			{
				System.out.println(head.data + "<>" + curr.next.data);
				if(head.data == curr.next.data)
				{
					curr.next = curr.next.next;
				}
				else
					curr = curr.next;
				
			}
			head = head.next;
			
		}
		
		return head;
	}

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = -1; //sc.nextInt();
        int [] testData = {1,2,2,3,3,4};
        while(N++ < 5) {
            int ele = (int) (N + Math.random()*10); //sc.nextInt();
            head = insert(head,testData[N]);
        }
        
        display(head);
        
        removeDuplicates(head);
        System.out.println();
        display(head);
        sc.close();
    }
}