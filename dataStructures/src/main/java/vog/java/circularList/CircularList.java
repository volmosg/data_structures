package vog.java.circularList;

public class CircularList<E> {
	// singly circular list
	private int size;
	
	public CircularList(){
		size = 0;
	}
	
	//TODO add
	public boolean add(E data) {
		if (data == null) {
			throw new NullPointerException();
		}
		if (this.size == 0) {
			CircularNode<E> newNode = new CircularNode<E>(data);
			size +=1;
			return true;
		}
		else {
			CircularNode<E> newNode = new CircularNode<E>(data);
			//TODO need to add a last pointer
		}
		
		return false;
		
	}
	
	//TODO remove  
	
	//TODO get
	
	//TODO set
	
	//TODO add E int
	
	//TODO size

}
