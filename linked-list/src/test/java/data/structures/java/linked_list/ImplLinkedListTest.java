package data.structures.java.linked_list;

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
		fail("Not yet implemented");
	}

	public void testRemove() {
		fail("Not yet implemented");
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
