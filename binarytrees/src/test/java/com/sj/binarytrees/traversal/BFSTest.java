package com.sj.binarytrees.traversal;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.sj.binarytrees.BinaryTree;
import com.sj.binarytrees.traversal.BFS;

public class BFSTest {

	@Test
	public void traverseTest(){
		Integer[]  arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		BinaryTree<Integer> btree = new BinaryTree<Integer>(arr);
		BFS<Integer> bfs = new BFS<Integer>(btree);
		
		List<Integer> list =  bfs.traverse();
		assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, list.toArray(new Integer[list.size()]));
	}
	
	@Test 
	public void traverseEmptyTest(){
		BFS<Integer> bfs = new BFS<Integer>(new BinaryTree<Integer>());
		assertNull(bfs.traverse());
	}
	
}
