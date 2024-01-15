
public class MyGraph<T> {
	
	private int numNodes,numEdges;
	private MyMap<T, Integer> traduct;
	private MyMap<Integer, T> inverseTraduct;
	private MyDoubleLinkedList<MyDoubleLinkedList<Vertex>> adj;
	
	public MyGraph() {
		numNodes=0;
		numEdges=0;
		traduct=new MyMap<>();
		inverseTraduct=new MyMap<>();
		adj=new MyDoubleLinkedList<>();
	}

	public int getNumNodes() {
		return numNodes;
	}

	public void setNumNodes(int numNodes) {
		this.numNodes = numNodes;
	}

	public int getNumEdges() {
		return numEdges;
	}

	public void setNumEdges(int numEdges) {
		this.numEdges = numEdges;
	}

	public MyMap<T, Integer> getTraduct() {
		return traduct;
	}

	public void setTraduct(MyMap<T, Integer> traduct) {
		this.traduct = traduct;
	}

	public MyMap<Integer, T> getInverseTraduct() {
		return inverseTraduct;
	}

	public void setInverseTraduct(MyMap<Integer, T> inverseTraduct) {
		this.inverseTraduct = inverseTraduct;
	}

	public MyDoubleLinkedList<MyDoubleLinkedList<Vertex>> getAdj() {
		return adj;
	}

	public void setAdj(MyDoubleLinkedList<MyDoubleLinkedList<Vertex>> adj) {
		this.adj = adj;
	}
	
	public void addNode(T node) {
		traduct.put(node, numNodes);
		inverseTraduct.put(numNodes, node);
		adj.add(new MyDoubleLinkedList<Vertex>());
		numNodes++;
	}
	
	public void addEdge(T source, T destination,double weigth) {
		adj.get(traduct.getValue(source)).add(new Vertex(traduct.getValue(destination), weigth));
		numEdges++;
	}
	
	public int nodeToNumber(T node) {
		if(traduct.containsKey(node)) {
			return traduct.getValue(node);
		}
		return -1;
	}
	
	public T numberToNode(int node) {
		return inverseTraduct.getValue(node);
	}
	
	public void clear() {
		numNodes=0;
		numEdges=0;
		traduct.clear();
		inverseTraduct.clear();
		adj.clear();
	}

}
