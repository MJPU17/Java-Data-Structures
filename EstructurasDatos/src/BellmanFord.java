
public class BellmanFord<T> {
	
	private T source;
	private MyGraph<T> graph;
	private int[] previous;
	private double[] distance;
	private final int INF= 1 << 30;
	private boolean negativeCicle;
	
	public BellmanFord() {}
	
	public BellmanFord(MyGraph<T> graph, T source) {
		this.graph=graph;
		this.source=source;
		negativeCicle=false;
		previous=new int[graph.getNumNodes()];
		distance=new double[graph.getNumNodes()];
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

	public int[] getPrevious() {
		return previous;
	}

	public void setPrevious(int[] previous) {
		this.previous = previous;
	}

	public double[] getDistance() {
		return distance;
	}

	public void setDistance(double[] distance) {
		this.distance = distance;
	}

	public boolean isNegativeCicle() {
		return negativeCicle;
	}

	public void setNegativeCicle(boolean negativeCicle) {
		this.negativeCicle = negativeCicle;
	}

	public int getINF() {
		return INF;
	}
	
	public void init() {
		this.negativeCicle=false;
		for (int i = 0; i < graph.getNumNodes(); i++) {
			distance[i]=INF;
			previous[i]=-1;
		}
	}
	
	public boolean relaxation(int current, int adjacent, double weigth) {
		if(distance[current] + weigth < distance[adjacent]) {
			distance[adjacent] = distance[current] + weigth;
			previous[adjacent] = current;
			return true;
		}
		return false;
	}
	
	public void initBellmanFord() {
		init();
		distance[graph.nodeToNumber(source)]=0;
		for(int i=0;i<graph.getNumNodes()-1;i++){
            for(int current=0; current<graph.getNumNodes();current++){
                for(int j=0;j<graph.getAdj().get(current).getSize();j++){
                    int adjacent=graph.getAdj().get(current).get(j).getNumber();
                    double weigth=graph.getAdj().get(current).get(j).getWeigth();
                    relaxation(current,adjacent,weigth);
                }
            }
        }
        for(int current=0; current<graph.getNumNodes();current++){
            for(int j=0;j<graph.getAdj().get(current).getSize();j++){
                int adjacent=graph.getAdj().get(current).get(j).getNumber();
                double weigth=graph.getAdj().get(current).get(j).getWeigth();
                if(relaxation(current,adjacent,weigth)){
                    negativeCicle=true;
                    return;
                }
            }
        }
	}
	
	public double obtainDistance(T destination) {
		return distance[graph.nodeToNumber(destination)];
	}
	
	public boolean isPath(T destination) {
		int current=graph.nodeToNumber(destination);
		while(previous[current]!=-1)current=previous[current];
		return current==graph.nodeToNumber(source);
	}

}
