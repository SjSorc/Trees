package com.sj.binarytrees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree <T>{
	private Node<T> root;
	
	public BinaryTree(){
		
	}
	
	public BinaryTree(T [] inputArray){
		for(T t: inputArray){
			add(t);
		}
	}
	
	/**
	 * adds an element into the binary tree
	 */
	public void add(T value){
		
		if(root == null){
			root = new Node<T>(value);
		}
		else{
			addChild(value);
		}
	}
	

	private void addChild(T value){
		
		Node<T> child = new Node<T>(value);
		Queue<Node<T>> queue = new LinkedList<Node<T>>();
		queue.add(root);
		
		while(!queue.isEmpty()){			
			Node<T> node = queue.poll();
			
			if(node.getLeft() == null){
				node.setLeft(child);
				break;
			}
			else if(node.getRight() == null){
				node.setRight(child);
				break;
			}
			else{
				queue.add(node.getLeft());
				queue.add(node.getRight());
			}			
		}
	}
	
	public Node<T> getRoot() {
		return root;
	}
	
}
