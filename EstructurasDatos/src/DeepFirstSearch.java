
public class DeepFirstSearch<T> {
	
	private MyGraph<T> graph;
	private T source;
	private int[] discover, termination;
	private int time;
	
	public DeepFirstSearch() {}
	
	public DeepFirstSearch(MyGraph<T> graph, T source) {
		super();
		this.graph = graph;
		this.source = source;
		discover=new int[graph.getNumNodes()];
		termination=new int[graph.getNumNodes()];
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

	public int[] getDiscover() {
		return discover;
	}

	public void setDiscover(int[] discover) {
		this.discover = discover;
	}

	public int[] getTermination() {
		return termination;
	}

	public void setTermination(int[] termination) {
		this.termination = termination;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	public void runSearchUtil(int u) {
		discover[u]=time++;
		for(Vertex v: graph.getAdj().get(u)) {
			if(discover[v.getNumber()]==0) {
				runSearchUtil(v.getNumber());
			}
		}
		termination[u]=time++;
	}
	
	public void runSearch() {
		for (int i = 0; i < graph.getNumNodes(); i++) {
			discover[i]=0;
			termination[i]=0;
		}
		time=1;
		runSearchUtil(graph.nodeToNumber(source));
	}
	
	public int obtainDiscover(T node) {
		return discover[graph.nodeToNumber(node)];
	}
	
	public int obtainTermination(T node) {
		return termination[graph.nodeToNumber(node)];
	}

}
