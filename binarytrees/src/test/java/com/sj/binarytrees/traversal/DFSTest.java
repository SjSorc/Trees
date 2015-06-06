package com.sj.binarytrees.traversal;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.sj.binarytrees.BinaryTree;
import com.sj.binarytrees.traversal.DFS;
import com.sj.binarytrees.traversal.DFS.TraversalType;

public class DFSTest {
	
	private static DFS<Integer> dfs;
	
	private void setUp(){
		Integer[]  arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		BinaryTree<Integer> btree = new BinaryTree<Integer>(arr);
		dfs = new DFS<Integer>(btree);
	}
	
	private void tearDown(){
		dfs = new DFS<Integer>(new BinaryTree<Integer>());
	}
	
	@Test
	public void inOrderTest() {
		setUp();
		assertArrayEquals(new Integer[]{8, 4, 9, 2, 10, 5, 1, 0, 3, 2}, dfs.traverse(TraversalType.INORDER));
		tearDown();
	}
	
	@Test
	public void preOrderTest() {
		setUp();
		assertArrayEquals(new Integer[]{1, 2, 4, 8, 9, 5, 10, 3, 6, 7}, dfs.traverse(TraversalType.PREORDER));
		tearDown();
	}
	
	@Test
	public void postOrderTest() {
		setUp();
		assertArrayEquals(new Integer[]{8, 9, 4, 10, 5, 2, 6, 7, 3, 1}, dfs.traverse(TraversalType.POSTORDER));
		tearDown();
	}
	
	@Test
	public void emptyTest(){
		tearDown();
		assertArrayEquals(new Integer[]{}, dfs.traverse(TraversalType.INORDER));
		assertArrayEquals(new Integer[]{}, dfs.traverse(TraversalType.PREORDER));
		assertArrayEquals(new Integer[]{}, dfs.traverse(TraversalType.POSTORDER));
	}
}
