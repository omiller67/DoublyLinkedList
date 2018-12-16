
public class DoublyLinkedListNode<T> {
	private T element;
	private DoublyLinkedListNode<T> rightNeighbor;
	private DoublyLinkedListNode<T> leftNeighbor;

	public DoublyLinkedListNode(T setElement) {
	    element = setElement;
	    rightNeighbor = null;
	    leftNeighbor = null;
	  }

	  public DoublyLinkedListNode<T> getRight() {
	    return rightNeighbor;
	  }

	  public DoublyLinkedListNode<T> getLeft(){
		  return leftNeighbor;
	  }


	  public void setRight(DoublyLinkedListNode<T> new_right) {
	    rightNeighbor = new_right;
	  }

	  public void setLeft(DoublyLinkedListNode<T> new_left){
		  leftNeighbor = new_left;
	  }

	  public T getElement() {
	    return element;
	  }

	  public String toString() {
	    return element.toString();
	  }
	}
