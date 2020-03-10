package dataStructures.linked_list;

import dataStructures.linked_list.ImpLinkedList;
import junit.framework.TestCase;


public class ImplLinkedListTest extends TestCase {
	
	public void testAddE() {
		ImpLinkedList<String> empty = new ImpLinkedList<String>();
		assertEquals(empty.size, 0);
		empty.add("New");
		empty.add("Content");
		assertEquals(empty.size, 2);
		assertEquals(empty.add(null), false);
		
	}

	public void testGet() {
		ImpLinkedList<String> shortList = new ImpLinkedList<String>();
		assertEquals(shortList.get(0), null);
		shortList.add("One");
		shortList.add("Two");
		shortList.add("Three");
		assertEquals("One", shortList.get(0));
		assertEquals("Three", shortList.get(2));
		assertEquals(shortList.get(-1), null);
		
	}

	public void testAddEInt() {
		ImpLinkedList<String> numberedList = new ImpLinkedList<String>();
		numberedList.add("One");
		numberedList.add("Three");
		numberedList.add("Four");
		assertEquals(3, numberedList.size);
		assertEquals("Three", numberedList.get(1));
		numberedList.add("Two", 1);
		assertEquals(4, numberedList.size);
		assertEquals("Two", numberedList.get(1));
		
	}

	public void testRemove() {
		ImpLinkedList<String> list = new ImpLinkedList<String>();
		list.add("a1");
		list.add("b2");
		list.add("a2");
		list.add("a3");
		assertEquals(4, list.size);
		assertEquals("b2", list.get(1));
		list.remove(1);
		assertEquals(3, list.size);
		assertEquals("a2", list.get(1));
	}

	public void testSet() {
		fail("Not yet implemented");
	}

	public void testSize() {
		ImpLinkedList<Integer> list = new ImpLinkedList<Integer>();
		assertEquals(0, list.size());
		list.add(1);
		list.add(2);
		assertEquals(2, list.size());
		assertEquals(list.size, list.size());
	}

}
