
public class GenericTree<T> {
	
	private GTNode<T> root;
	private MyLinkedList<T> route;
	private MyMap<Integer, MyLinkedList<T>> levels;
	private boolean add;
	
	public GenericTree() {
		root=null;
		add=false;
		route=new MyLinkedList<>();
		levels=new MyMap<>();
	}

	public GTNode<T> getRoot() {
		return root;
	}

	public void setRoot(GTNode<T> root) {
		this.root = root;
	}

	public MyLinkedList<T> getRoute() {
		return route;
	}

	public void setRoute(MyLinkedList<T> route) {
		this.route = route;
	}

	public MyMap<Integer, MyLinkedList<T>> getLevels() {
		return levels;
	}

	public void setLevels(MyMap<Integer, MyLinkedList<T>> levels) {
		this.levels = levels;
	}
	
	public GTNode<T> searchNodeUtil(GTNode<T> root, T search){
		if(root.getKey()==search) {
			return root;
		}
		GTNode<T> aux;
		for (int i = 0; i < root.getChilds().getSize(); i++) {
			aux=searchNodeUtil(root.getChilds().get(i), search);
			if(aux!=null)return aux;
		}
		return null;
	}
	
	public GTNode<T> searchNode(T search){
		return searchNodeUtil(root, search);
	}
	
	public void addChild(GTNode<T> node, T father, T child) {
		if(node.getKey()==father) {
			GTNode<T> aux=new GTNode<>(child);
			node.getChilds().add(aux);
			add=true;
		}
		for (int i = 0; !add && i < node.getChilds().getSize(); i++) {
			addChild(node.getChilds().get(i), father, child);
		}
	}
	
	public void addNode(T root) {
		this.root=new GTNode<T>(root);
	}
	
	public boolean addNode(T father, T child) {
		add=false;
		if(searchNode(child)==null)addChild(this.root, father, child);
		return add;
	}
	
	public void levelOrder(GTNode<T> root) {
		if(root==null)return;
		int level=0;
		route.clear();
		levels.clear();
		QueueImp<GTNode<T>> q=new QueueImp<>();
		q.enqueue(root);
		while(!q.isEmpty()) {
			int n=q.size();
			MyLinkedList<T> aux=new MyLinkedList<>();
            while(n>0){
                GTNode<T> current=q.dequeue();
                aux.addLast(current.getKey());
                for (int i = 0; i < current.getChilds().getSize(); i++) {
					q.enqueue(current.getChilds().get(i));
				}
				n--;
            }
            levels.put(level,aux);
            level++;
		}
	}
	
	public void preOrderRec(GTNode<T> root) {
		if(root!=null) {
			route.addLast(root.getKey());
			for(GTNode<T> child:root.getChilds()) {
				preOrderRec(child);
			}
		}
	}
	
	public void postOrderRec(GTNode<T> root) {
		if(root!=null) {
			for(GTNode<T> child:root.getChilds()) {
				postOrderRec(child);
			}
			route.addLast(root.getKey());
		}
	}
	
	public MyLinkedList<T> preOrder(GTNode<T> root){
        route.clear();
        preOrderRec(root);
        return route;
    }
	
	public MyLinkedList<T> postOrder(GTNode<T> root){
        route.clear();
        postOrderRec(root);
        return route;
    }
	
	void removeLeaves(GTNode<T> root){
        if(root!=null){
            for(GTNode<T> child: root.getChilds()){
                removeLeaves(child);
            }
            root.getChilds().clear();
            root=null;
        }
    }
	
	void clear(){
        removeLeaves(root);
        root=null;
        route.clear();
    }

}
