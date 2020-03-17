package vog.java.circularList;

public class CircularNode<E> {
	E data;
	// singly
	CircularNode<E> nextNode;
	
	public CircularNode(E e){
		this.data = e;
		// the most basic circular list will be a single element circular list
		// pointing to itself  
		this.nextNode = null;
	}

}
