package com.sj.binarytrees.traversal;

import com.sj.binarytrees.BinaryTree;

public class DFS<T> {

	public enum TraversalType{
		INORDER, PREORDER, POSTORDER;
	};
	
	public DFS(BinaryTree<T> btree){
		
	}
	
	public T[] traverse(TraversalType type){
		
		if(type == TraversalType.INORDER)
			return inOrder();
		else if(type == TraversalType.PREORDER)
			return preOrder();
		else if(type == TraversalType.POSTORDER)
			return postOrder();
		else
			return null; 
	}
	
	private T[] inOrder(){
		return null;
	}
	
	private T[] preOrder(){
		return null;
	}
	
	private T[] postOrder(){
		return null;
	}
}
