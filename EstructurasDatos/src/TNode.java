
public class TNode<T> {
	
	private T key;
	private TNode<T> left, right;
	
	public TNode() {}
	
	public TNode(T key, TNode<T> left, TNode<T> right) {
		this.key = key;
		this.left = left;
		this.right = right;
	}
	
	public TNode(T key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}

	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

	public TNode<T> getLeft() {
		return left;
	}

	public void setLeft(TNode<T> left) {
		this.left = left;
	}

	public TNode<T> getRight() {
		return right;
	}

	public void setRight(TNode<T> right) {
		this.right = right;
	}
	
	

}
