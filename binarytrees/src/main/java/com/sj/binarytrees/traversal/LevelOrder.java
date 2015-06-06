package com.sj.binarytrees.traversal;

import java.util.LinkedList;
import java.util.Queue;

import com.sj.binarytrees.BinaryTree;
import com.sj.binarytrees.Node;

public class LevelOrder {

	public static <T> void levelOrder(BinaryTree<T> btree){
		Node<T> root = btree.getRoot();
		if(root == null)
			return;

		Queue<Node<T>> queue = new LinkedList<Node<T>>();
		queue.add(root);
		queue.add(null);

		while(!queue.isEmpty()){			
			Node<T> node = queue.poll();
			
			if(node == null){
				System.out.println();
				if(!queue.isEmpty())
					queue.add(null);
				continue;
			}
			
			System.out.print(node.getValue() + "\t");
			if(node.getLeft() != null){
				queue.add(node.getLeft());
			}
			if(node.getRight() != null){
				queue.add(node.getRight());
			}
		}
	}
	
	public static void main(String[] args) {
		Integer[]  arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		BinaryTree<Integer> btree = new BinaryTree<Integer>(arr);
		
		levelOrder(btree);
	}
}
