package vog.java.circularList;

import java.util.List;

import junit.framework.TestCase;

public class CircularListTest extends TestCase {
	
	public void testAdd() {
		CircularList<String> cl = new CircularList<String>();
		assertEquals(cl.size(), 0);
		cl.insert("One");
		assertEquals(cl.size(), 1);
		cl.insert("Two");
		assertEquals(cl.size(), 2);
		String expected = "OneTwo";
		assertEquals(cl.display(), expected);
	}
	
	public void testRemove() {
		CircularList<String> cl2 = new CircularList<String>();
		cl2.insert("One");
		cl2.insert("Two");
		assertEquals(cl2.size(),2);
		cl2.removeFirst();
		assertEquals(cl2.size(), 1);
		assertEquals(cl2.display(), "Two");
		cl2.removeFirst();
		assertEquals(cl2.size(), 0);
	}

}
