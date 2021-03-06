package vog.java.linkedList;

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
		ImpLinkedList<String> shortList = new ImpLinkedList<String>();
		assertEquals(shortList.get(0), null);
		shortList.add("One");
		shortList.add("Two");
		shortList.add("Three");
		assertEquals(shortList.size, 3);
		shortList.add("Zero", 0);
		assertEquals(shortList.size, 4);
		assertEquals(shortList.get(0), "Zero");
		assertEquals(shortList.get(1), "One");
		shortList.add("New", 1);
		assertEquals(shortList.size, 5);
		assertEquals(shortList.get(1), "New");
		
	}

	public void testRemove() {
		ImpLinkedList<String> shortList = new ImpLinkedList<String>();
		assertEquals(shortList.get(0), null);
		shortList.add("One");
		shortList.add("Two");
		shortList.add("Three");
		assertEquals(shortList.size, 3);
		assertEquals(shortList.get(0), "One");
		shortList.remove(0);
		assertEquals(shortList.size, 2);
		assertEquals(shortList.get(0), "Two");
	}

	public void testSet() {
		ImpLinkedList<String> shortList = new ImpLinkedList<String>();
		assertEquals(shortList.get(0), null);
		shortList.add("One");
		shortList.add("Two");
		shortList.add("Three");
		shortList.set("New", 0);
		assertEquals(shortList.size, 3);
		assertEquals(shortList.get(0), "New");
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
