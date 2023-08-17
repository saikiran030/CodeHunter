package tree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;
}

public class Tree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = null; 
		Tree t = new Tree();
		head = t.BSTinsert(head, 4);
		head = t.BSTinsert(head, 2);
		head = t.BSTinsert(head, 7);
		head = t.BSTinsert(head, 1);
		head = t.BSTinsert(head, 3);
		head = t.BSTinsert(head, 6);
		t.print(head);
		t.preOrder(head);
		System.out.println();
		t.inOrder(head);
		System.out.println();
		t.postOrder(head);
		System.out.println();
	}
	
	Node BSTinsert(Node head,int data){
		Node new_node = new Node();
		new_node.data = data;
		new_node.left = null;
		new_node.right = null;
		if(head == null){
			head = new_node;
		}else{
			Queue<Node> q=new LinkedList<Node>();
			q.add(head);
			while(!q.isEmpty()){
				Node temp = q.remove();
				if(temp.data >= data){
					if(temp.left != null)
						q.add(temp.left);
					else{
						temp.left = new_node;
						break;
					}
				}else{
					if(temp.right != null)
						q.add(temp.right);
					else{
						temp.right = new_node;
						break;
					}
				}
			}
		}
		return head;
	}
	//insert
	Node insert(Node head,int data){
		Node new_node = new Node();
		new_node.data = data;
		new_node.left = null;
		new_node.right = null;
		if(head == null){
			head = new_node;
		}else{
			Queue<Node> q=new LinkedList<Node>();
			q.add(head);
			while(!q.isEmpty()){
				Node temp = q.remove();
				if(temp.left != null)
					q.add(temp.left);
				else{
					temp.left = new_node;
					break;
				}
				
				if(temp.right != null)
					q.add(temp.right);
				else{
					temp.right = new_node;
					break;
				}
					
			}
		}
		return head;
	}
	//print
	void print(Node head){
		Queue<Node> q=new LinkedList<Node>();
		q.add(head);
		Node temp = new Node();
		while(!q.isEmpty()){
			temp=q.remove();
			System.out.print(temp.data+"\t");
			if(temp.left!=null)
				q.add(temp.left);
			if(temp.right!=null)
				q.add(temp.right);
		}
		System.out.println();
	}
	//preorder
	void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
        
	}
	//inorder
	void inOrder(Node root) {
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
	}
	//postOrder
	void postOrder(Node root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
	}	
	
}
