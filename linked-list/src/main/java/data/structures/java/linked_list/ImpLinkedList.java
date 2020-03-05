package data.structures.java.linked_list;

public class ImpLinkedList<E> {
	
	// doubly linked list
	// minimum unit is node
	// TODO Constructor
	LLNode<E> head;
	LLNode<E> tail;
	int size;
	
	public ImpLinkedList() {
		head = new LLNode<E>(null);
		tail = new LLNode<E>(null);
		size = 0;
		head.nextNode = tail;
		tail.prevNode = head;
	}
		
	//TODO add
	public boolean add(E data) {
		return false;
	}
	
	//TODO get
	public LLNode<E> get(int index){
		return head;
		
	}
	
	//TODO add (given an index)
	public void add(E data, int index) {
		
	}
	
	//TODO remove
	public LLNode<E> remove(int index){
		return null;
	}
	
	//TODO set
	public LLNode<E> set(E data, int index){
		return null;
	}
	
	public int size() {
		return 0;
	}
	

}
