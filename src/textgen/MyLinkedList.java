package textgen;

import java.util.AbstractList;

/**
 * A class that implements a doubly linked list
 * 
 * @author UC San Diego Intermediate Programming MOOC team
 *
 * @param <E>
 *            The type of the elements stored in the list
 */
public class MyLinkedList<E> extends AbstractList<E> {
	LLNode<E> head;
	LLNode<E> tail;
	int size;

	/** Create a new empty LinkedList */
	public MyLinkedList() {
		head = new LLNode<E>(null);
		tail = new LLNode<E>(null);
		head.next = tail;
		tail.prev = head;
		size = 0;
	}

//	public void printList() {
//		LLNode<E> n = head;
//		for (int i = 0; i < size; i++) {
//			n = n.next;
//			System.out.print(n.data + " ");
//		}
//		System.out.println();
//	}

	/**
	 * Appends an element to the end of the list
	 * 
	 * @param element
	 *            The element to add
	 */
	public boolean add(E element) {
		if(element==null){
			throw new NullPointerException();
		}
		LLNode<E> newNode = new LLNode<E>(element);
		LLNode<E> last = tail.prev;
		last.next = newNode;
		newNode.prev = last;
		newNode.next = tail;
		tail.prev = newNode;
		size++;
		return false;
	}

	/**
	 * Get the element at position index
	 * 
	 * @throws IndexOutOfBoundsException
	 *             if the index is out of bounds.
	 */
	public E get(int index) {
		if (index < 0 || index >= size || size == 0) {
			throw new IndexOutOfBoundsException();
		}
		LLNode<E> n = head;
		for (int i = 0; i < (index + 1); i++) {
			n = n.next;
		}
		return n.data;
	}

	/**
	 * Add an element to the list at the specified index
	 * 
	 * @param The
	 *            index where the element should be added
	 * @param element
	 *            The element to add
	 */
	public void add(int index, E element) {
		if(element==null){
			throw new NullPointerException();
		}
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		LLNode<E> n = head;
		//System.out.println(head.next);
		System.out.println("index="+index);
		for (int i = 0; i < (index + 1); i++) {
			n = n.next;
			
		}
		LLNode<E> newNode=new LLNode<E>(element);
//		System.out.println("["+n+"]");
//		System.out.println("[["+n.prev+"]]");
//		System.out.println("[[["+n.prev.next+"]]]");
		n.prev.next=newNode;
		newNode.prev=n.prev;
		newNode.next=n;
		n.prev=newNode;
		size++;
	}

	/** Return the size of the list */
	public int size() {
		// TODO: Implement this method
		return size;
	}

	/**
	 * Remove a node at the specified index and return its data element.
	 * 
	 * @param index
	 *            The index of the element to remove
	 * @return The data element removed
	 * @throws IndexOutOfBoundsException
	 *             If index is outside the bounds of the list
	 * 
	 */
	public E remove(int index) {
		// TODO: Implement this method
		if (index < 0 || index >= size || size == 0) {
			throw new IndexOutOfBoundsException();
		}
		LLNode<E> n = head;
		for (int i = 0; i < (index + 1); i++) {
			n = n.next;
		}
		E result=n.data;
		n.next.prev=n.prev;
		n.prev.next=n.next;
		size--;
		return result;
	}

	/**
	 * Set an index position in the list to a new element
	 * 
	 * @param index
	 *            The index of the element to change
	 * @param element
	 *            The new element
	 * @return The element that was replaced
	 * @throws IndexOutOfBoundsException
	 *             if the index is out of bounds.
	 */
	public E set(int index, E element) {
		if(element==null){
			throw new NullPointerException();
		}
		if (index < 0 || index >= size || size == 0) {
			throw new IndexOutOfBoundsException();
		}
		LLNode<E> n = head;
		for (int i = 0; i < (index + 1); i++) {
			n = n.next;
		}
		n.data=element;
		return n.data;
	}
}

class LLNode<E> {
	LLNode<E> prev;
	LLNode<E> next;
	E data;

	// TODO: Add any other methods you think are useful here
	// E.g. you might want to add another constructor

	public LLNode(E e) {
		this.data = e;
		this.prev = null;
		this.next = null;
	}

}
