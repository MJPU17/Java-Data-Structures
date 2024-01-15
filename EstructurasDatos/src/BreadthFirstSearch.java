
public class BreadthFirstSearch<T> {
	
	private MyGraph<T> graph;
	private T source;
	private int[] distance,previous;
	
	public BreadthFirstSearch() {}
	
	public BreadthFirstSearch(MyGraph<T> graph, T source) {
		this.graph = graph;
		this.source = source;
		distance=new int[graph.getNumNodes()];
		previous=new int[graph.getNumNodes()];
	}

	public MyGraph<T> getGraph() {
		return graph;
	}

	public void setGraph(MyGraph<T> graph) {
		this.graph = graph;
	}

	public T getSource() {
		return source;
	}

	public void setSource(T source) {
		this.source = source;
	}

	public int[] getDistance() {
		return distance;
	}

	public void setDistance(int[] distance) {
		this.distance = distance;
	}

	public int[] getPrevious() {
		return previous;
	}

	public void setPrevious(int[] previous) {
		this.previous = previous;
	}
	
	public void init() {
		for(int i=0;i<graph.getNumNodes();i++){
            distance[i]=-1;
            previous[i]=-1;
        }
	}
	
	public void runSearch() {
		init();
		QueueImp<Integer> queue=new QueueImp<>();
		distance[graph.nodeToNumber(source)]=0;
		queue.enqueue(graph.nodeToNumber(source));
		while(!queue.isEmpty()) {
			int u=queue.dequeue();
			for(Vertex v: graph.getAdj().get(u)) {
				if(distance[v.getNumber()]==-1) {
					distance[v.getNumber()]=distance[u]+1;
					previous[v.getNumber()]=u;
					queue.enqueue(v.getNumber());
				}
			}
		}
	}
	
	public int obtainDistance(T destination) {
		return distance[graph.nodeToNumber(destination)];
	}
	
	public T obtainPrevious(T node) {
		int n=graph.nodeToNumber(node);
		return graph.numberToNode(previous[n]);
	}

}
