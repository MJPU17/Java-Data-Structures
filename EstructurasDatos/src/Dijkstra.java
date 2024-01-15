
public class Dijkstra<T> {
	
	private final int INF = 1 << 30;
	private T source;
	private MyGraph<T> graph;
	MyPriorityQueue<Vertex> pq;
	private double[] distance;
	private int[] previous;
	private boolean[] visited;
	
	public Dijkstra(MyGraph<T> graph, T source) {
		this.graph=graph;
		this.source=source;
		pq=new MyPriorityQueue<>();
		distance=new double[graph.getNumNodes()];
		previous=new int[graph.getNumNodes()];
		visited=new boolean[graph.getNumNodes()];
	}

	public T getSource() {
		return source;
	}

	public void setSource(T source) {
		this.source = source;
	}

	public MyGraph<T> getGraph() {
		return graph;
	}

	public void setGraph(MyGraph<T> graph) {
		this.graph = graph;
	}

	public MyPriorityQueue<Vertex> getPq() {
		return pq;
	}

	public void setPq(MyPriorityQueue<Vertex> pq) {
		this.pq = pq;
	}

	public double[] getDistance() {
		return distance;
	}

	public void setDistance(double[] distance) {
		this.distance = distance;
	}

	public int[] getPrevious() {
		return previous;
	}

	public void setPrevious(int[] previous) {
		this.previous = previous;
	}

	public boolean[] getVisited() {
		return visited;
	}

	public void setVisited(boolean[] visited) {
		this.visited = visited;
	}

	public int getINF() {
		return INF;
	}
	
	public void init() {
		for(int i=0;i<graph.getNumNodes();i++) {
			distance[i]=INF;
			visited[i]=false;
			previous[i]=-1;
		}
	}
	
	public void relaxation(int current, int adjacent, double weigth) {
		if(distance[current] + weigth < distance[adjacent]) {
			distance[adjacent] = distance[current] + weigth;
			previous[adjacent] = current;
			pq.insert(new Vertex(adjacent, distance[adjacent]));
		}
	}
	
	public void runDijkstra() {
		init();
		int n=graph.nodeToNumber(source);
		pq.insert(new Vertex(n, 0));
		distance[n]=0;
		int current, adjacent;
		double weigth;
		while(!pq.isEmpty()) {
			current=pq.poll().getNumber();
			if(visited[current]) {
				continue;
			}
			visited[current]=true;
			for(int i=0;i<graph.getAdj().get(current).getSize();i++){
                adjacent=graph.getAdj().get(current).get(i).getNumber();
                weigth=graph.getAdj().get(current).get(i).getWeigth();
                if(!visited[adjacent]){
                    relaxation(current, adjacent, weigth);
                }
            }
		}
	}
	
	public double obtainDistance(T destination) {
		return distance[graph.nodeToNumber(destination)];
	}
	
	public boolean isPath(T destination) {
		return visited[graph.nodeToNumber(destination)];
	}
}
