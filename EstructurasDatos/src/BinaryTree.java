
public class BinaryTree<T extends Comparable<T>> {
	
	private TNode<T> root;
	private MyLinkedList<T> route;
	
	public BinaryTree() {
		this.root=null;
		this.route=new MyLinkedList<>();
	}

	public TNode<T> getRoot() {
		return root;
	}

	public void setRoot(TNode<T> root) {
		this.root = root;
	}

	public MyLinkedList<T> getRoute() {
		return route;
	}

	public void setRoute(MyLinkedList<T> route) {
		this.route = route;
	}
	
	public TNode<T> insertRec(TNode<T> root, T key){
		if(root==null) {
			root=new TNode<T>(key);
			return root;
		}
		if(key.compareTo(root.getKey())<=0) {
			root.setLeft(insertRec(root.getLeft(), key));
		}
		else if(key.compareTo(root.getKey())>0) {
			root.setRight(insertRec(root.getRight(), key));
		}
		return root;
	}
	
	public void insert(T key) {
		root=insertRec(root, key);
	}
	
	public void inOrderRec(TNode<T> root) {
		if(root != null) {
			inOrderRec(root.getLeft());
			route.addLast(root.getKey());
			inOrderRec(root.getRight());
		}
	}
	
	public void postOrderRec(TNode<T> root) {
		if(root!=null) {
			postOrderRec(root.getLeft());
			postOrderRec(root.getRight());
			route.addLast(root.getKey());
		}
	}
	
	public void preOrderRec(TNode<T> root) {
		if(root!= null) {
			route.addLast(root.getKey());
			preOrderRec(root.getLeft());
			preOrderRec(root.getRight());
		}
	}
	
	public MyLinkedList<T> inOrder(){
		route.clear();
		inOrderRec(root);
		return route;
	}
	
	public MyLinkedList<T> preOrder() {
		route.clear();
		preOrderRec(root);
		return route;
	}
	
	public MyLinkedList<T> postOrder() {
		route.clear();
		postOrderRec(root);
		return route;
	}
	
	public void removeLeaves(TNode<T> root) {
		if(root!=null) {
			removeLeaves(root.getLeft());
            removeLeaves(root.getRight());
            root=null;
		}
	}
	
	public void clear() {
		removeLeaves(root);
		root=null;
		route.clear();
	}

}
