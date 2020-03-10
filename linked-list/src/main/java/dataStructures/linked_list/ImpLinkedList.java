package dataStructures.linked_list;

public class ImpLinkedList<E> {
	
	// doubly linked list
	// minimum unit is node
	// TODO Constructor
	LLNode<E> head;
	LLNode<E> tail;
	public int size;
	
	public ImpLinkedList() {
		head = new LLNode<E>(null);
		tail = new LLNode<E>(null);
		size = 0;
		head.nextNode = tail;
		tail.prevNode = head;
	}
		
	public boolean add(E data) {
		if (data != null) {
			// create new node
			LLNode<E> newNode = new LLNode<E>(data);
			// change links
			//	newNode -> next (tail)
			//			-> prev (tail.prev)
			newNode.nextNode = tail;
			newNode.prevNode = tail.prevNode;
			//	prev	-> next (newNode)
			tail.prevNode.nextNode = newNode;
			//	tail	-> prev (newNode)	
			tail.prevNode = newNode;
			
			// increase size
			size += 1;
			
			return true;
		}
		return false;
	}
	
	
	public E get(int index){
		if (index >= 0 && index < this.size && this.size != 0) {
			LLNode<E> currentNode = this.head.nextNode;
			for (int i = 0; i < index; i++) {
				currentNode = currentNode.nextNode;
			}
			return currentNode.data;
		}
		return null;
	}
	
	// helper method
	private LLNode<E> getNode(int index){
		if (index >= 0 && index < this.size && this.size != 0) {
			LLNode<E> currentNode = this.head.nextNode;
			for (int i = 0; i < index; i++) {
				currentNode = currentNode.nextNode;
			}
			return currentNode;
		}
		return null;
	}
	
	//TODO add (given an index)
	public void add(E data, int index) {
		if (data != null && index >= 0 && index < this.size) {
			// find node in index
			LLNode<E> oldNode = getNode(index);
			// create new node in index
			LLNode<E> newNode = new LLNode<E>(data);
			// change links
			oldNode.prevNode.nextNode = newNode;
			newNode.prevNode = oldNode.prevNode;
			newNode.nextNode = oldNode;
			oldNode.prevNode = newNode;
			// increase size
			this.size += 1;
		}
	
	}
	
	//TODO remove
	public LLNode<E> remove(int index){
		if (index >= 0 && index < this.size) {
			LLNode<E> nodeToRemove = getNode(index);
			// change references
			nodeToRemove.prevNode.nextNode = nodeToRemove.nextNode;
			nodeToRemove.nextNode = nodeToRemove.prevNode.nextNode;
			// decrease size
			this.size -= 1;
		}
		return null;
	}
	
	//TODO set
	public LLNode<E> set(E data, int index){
		return null;
	}
	
	public int size() {
		return this.size;
	}
	

}
