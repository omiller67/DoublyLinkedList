
public class DoublyLinkedList<T> {

	private DoublyLinkedListNode<T> first;
	private DoublyLinkedListNode<T> last;

	public DoublyLinkedList() {
	    first = null;
	    last = null;
	}

	//Adds element on to the back of the list
	public void add(T new_element) {
	    DoublyLinkedListNode<T> new_node = new DoublyLinkedListNode<T>(new_element);

	    // Check if list is empty
	    if(last == null) {
	      first = new_node;
	      last = new_node;
	    }
	    // List is not empty
	    else{
	      last.setRight(new_node);
	    }
	}

	//Returns length of list
	public int size(){
		DoublyLinkedListNode<T> node1 = first;
		int size = 0;
		while(node1!=null){
			size++;
			node1 = node1.getRight();
		}
		return size;
	}

	//Adds element to the front of the list
	  public void addFirst(T firstElement){
		  DoublyLinkedListNode<T> newFirst = new DoublyLinkedListNode<T>(firstElement);

		  //Check if list is empty
		  if(first == null){
			  first = newFirst;
			  last = newFirst;
		  }
		  //If list is not empty
		  else{
			  newFirst.setRight(first);
			  first = newFirst;
		  }
	  }

	//Checks to see if list contains a specified element
	  public boolean checkFor(T targetElement){
		  DoublyLinkedListNode<T> currentNode = first;
		  DoublyLinkedListNode<T> targetNode = new DoublyLinkedListNode<T>(targetElement);
		  int listLength = size();
		  boolean contains = false;
		  while(listLength>0){
			  if(currentNode.getElement() == targetNode.getElement()){
				  contains = true;
				  listLength = 0;
			  }
			  else{
				  currentNode = currentNode.getRight();
				  listLength--;
			  }
		  }
		  return contains;
	  }

	//Adds element after a certain element in the list
	  public void addAfter(T leftElement, T newElement){
		  DoublyLinkedListNode<T> currentNode = first;
		  DoublyLinkedListNode<T> newNode = new DoublyLinkedListNode<T>(newElement);
		  int length = size();
		  while(length>0){
			  if(currentNode.getElement() == leftElement){
				  newNode.setRight(currentNode.getRight());
				  newNode.getRight().setLeft(newNode);
				  newNode.setLeft(currentNode);
				  currentNode.setRight(newNode);
				  length = 0;
			  }
			  else{
			  	currentNode = currentNode.getRight();
			  	length--;
			  }
		  }
	  }

	//Inserts a new element at a certain position
	  public void insert(T newElement, int position){
		  DoublyLinkedListNode<T> node1 = first;
		  DoublyLinkedListNode<T> newNode = new DoublyLinkedListNode<T>(newElement);
		  int currentPosition = 1;
		  int length = size();
		  while(length>0){
			  if(currentPosition == position){
				  newNode.setRight(node1.getRight());
				  newNode.setLeft(node1);
				  node1.setRight(newNode);
				  length = 0;
			  }
			  else{
				  node1 = node1.getRight();
				  currentPosition++;
				  length--;
			  }
		  }
	  }

	//Removes first element
	  public void removeFirst(){
		  if(first!=null){
			  first = first.getRight();
		  }
	  }

	  //Removes last element
	  public void removeLast(){
		  if(last!=null){
			  last = last.getLeft();
		  }
	  }

	  //Returns first node
	  public DoublyLinkedListNode<T> getFirst(){
		  return first;
	  }

	//Returns last node
	  public DoublyLinkedListNode<T> getLast(){
		  return last;
	  }

	public static void main(String[] args) {


	}

}
