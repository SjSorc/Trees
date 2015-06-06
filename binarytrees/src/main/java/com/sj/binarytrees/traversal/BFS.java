package com.sj.binarytrees.traversal;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.sj.binarytrees.BinaryTree;
import com.sj.binarytrees.Node;

public class BFS<T> {

	private BinaryTree<T> btree;

	public BFS(BinaryTree<T> btree){
		this.btree = btree;
	}

	public List<T> traverse(){

		Node<T> root = btree.getRoot();
		if(root == null)
			return null;

		LinkedList<T> result = new LinkedList<T>();		
		Queue<Node<T>> queue = new LinkedList<Node<T>>();
		queue.add(root);

		while(!queue.isEmpty()){			
			Node<T> node = queue.poll();
			result.add(node.getValue());
			if(node.getLeft() != null){
				queue.add(node.getLeft());
			}
			if(node.getRight() != null){
				queue.add(node.getRight());
			}
		}

		return result;
	}

}
