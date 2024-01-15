import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T>{
	
	private Node<T> first;
	private int size;
	
	public MyLinkedList() {
		this.first=null;
		size=0;
	}

	public Node<T> getFirst() {
		return first;
	}

	public void setFirst(Node<T> first) {
		this.first = first;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	boolean isEmpty() {
        return (size == 0);
    }
	
	public void add(T info) {
		Node<T> newNode=new Node<T>(info, first);
		first = newNode;
		size++;
	}
	
	public Node<T> getLast(){
		Node<T> current = first;
		while(!isEmpty() && current.getNext()!=null) {
			current=current.getNext();
		}
		return current;
	}
	
	public void addLast(T info) {
		Node<T> newNode=new Node<T>(info);
		if(isEmpty()) {
			first = newNode;
		}
		else {
			getLast().setNext(newNode);
		}
		size++;
	}
	
	public Node<T> getNode(int n){
		Node<T> current = first;
		int count=0;
		if(n<0 || n>=size)throw new IndexOutOfBoundsException(n);
		while(!isEmpty() && count<n) {
			current=current.getNext();
			count++;
		}
		return current;
	}
	
	public T get(int n) {
		if(n<0 || n>=size)throw new IndexOutOfBoundsException(n);
		return getNode(n).getInfo();
	}
	
	public void remove(int n) {
		if(n<0 || n>=size)throw new IndexOutOfBoundsException(n);
		if(n==0) {
			if(first.getNext()!=null)first=first.getNext();
			else first=null;
		}
		else {
			getNode(n-1).setNext(getNode(n).getNext());
		}
		size--;
	}
	
	public void set(int n, T info) {
		if(n<0 || n>=size)throw new IndexOutOfBoundsException(n);
		getNode(n).setInfo(info);
	}
	
	public void clear() {
		while(!isEmpty()) {
			remove(0);
		}
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {
			
			int index=0;
			
			@Override
			public boolean hasNext() {
				return index<size;
			}

			@Override
			public T next() {
				return get(index++);
			}
			
		};
	}

}
