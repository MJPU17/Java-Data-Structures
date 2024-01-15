
public class DNode<T> {
	
	private T info;
	private DNode<T> previous,next;
	
	public DNode() {}

	public DNode(T info, DNode<T> previous, DNode<T> next) {
		this.info = info;
		this.previous = previous;
		this.next = next;
	}
	
	public DNode(T info) {
		this.info = info;
		this.previous = null;
		this.next = null;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public DNode<T> getPrevious() {
		return previous;
	}

	public void setPrevious(DNode<T> previous) {
		this.previous = previous;
	}

	public DNode<T> getNext() {
		return next;
	}

	public void setNext(DNode<T> next) {
		this.next = next;
	}

}
