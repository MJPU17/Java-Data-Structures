
public class GTNode<T> {
	
	private T key;
	private MyDoubleLinkedList<GTNode<T>> childs;
	
	public GTNode() {}
	
	public GTNode(T key, MyDoubleLinkedList<GTNode<T>> childs) {
		this.key = key;
		this.childs = childs;
	}

	public GTNode(T key) {
		this.key = key;
		this.childs = new MyDoubleLinkedList<>();
	}

	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

	public MyDoubleLinkedList<GTNode<T>> getChilds() {
		return childs;
	}

	public void setChilds(MyDoubleLinkedList<GTNode<T>> childs) {
		this.childs = childs;
	}
	
}
