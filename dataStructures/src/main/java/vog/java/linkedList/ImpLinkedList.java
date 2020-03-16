package vog.java.linkedList;


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
	
	//TODO get
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
	
	public LLNode<E> getNode(int index){
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
		if (data == null) {
			throw new NullPointerException();
		}
		else if (index < 0 || (this.size != 0 && index > this.size-1)) {
			throw new IndexOutOfBoundsException();
		}
		// Simplest case scenario
		else if (this.size == 0) {
			this.add(data);
		}
		// TODO: implement the logic of this method. Maybe you can use the get method to get the prev
		// and next nodes and change their relationships
		else {
			if (index == 0) {
				LLNode<E> nextNode = this.getNode(index);
				LLNode<E> newNode = new LLNode<E>(data);
				// TODO: write the relationships between the nodes
				// new node
				newNode.prevNode = head;
				newNode.nextNode = nextNode;
				// prev node
				head.nextNode = newNode;
				
				// next node
				nextNode.prevNode = newNode;
				// TODO: increase the size of the list
				this.size +=1;
			}
			else {
				LLNode<E> prevNode = this.getNode(index-1);
				LLNode<E> nextNode = this.getNode(index);
				LLNode<E> newNode = new LLNode<E>(data);
				// TODO: write the relationships between the nodes
				// new node
				newNode.prevNode = prevNode;
				newNode.nextNode = nextNode;
				// prev node
				prevNode.nextNode = newNode;
				
				// next node
				nextNode.prevNode = newNode;
				// TODO: increase the size of the list
				this.size +=1;
			}
			
		}
		
	}
	
	//TODO remove
	public E remove(int index){
		if (index < 0 || index > this.size-1) {
			throw new IndexOutOfBoundsException();
		}
		LLNode <E> nodeToBeRemoved = getNode(index);
		LLNode <E> prevNode = nodeToBeRemoved.prevNode;
		LLNode <E> nextNode = nodeToBeRemoved.nextNode;
		// build relationships excluding nodeToBeRemoved
		prevNode.nextNode = nextNode;
		nextNode.prevNode = prevNode;
		nodeToBeRemoved.prevNode = null;
		nodeToBeRemoved.nextNode = null;
		// change size
		size -=1;
		return nodeToBeRemoved.data;
	}
	
	//TODO set
	public E set(E data, int index){
		if (index <0 || index > this.size -1) {
			throw new IndexOutOfBoundsException();
		}
		if (data == null) {
			throw new NullPointerException();
		}
		LLNode <E> nodeToBeReplaced = getNode(index);
		E oldElement = nodeToBeReplaced.data;
		//change relationships
		nodeToBeReplaced.data = data;
		
		return oldElement;
	}
	
	public int size() {
		return this.size;
	}
	

}
