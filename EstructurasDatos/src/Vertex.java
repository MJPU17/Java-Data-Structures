
public class Vertex implements Comparable<Vertex>{
	
	private int number;
	private double weigth;
	
	public Vertex(int number, double weigth) {
		this.number = number;
		this.weigth = weigth;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}

	@Override
	public int compareTo(Vertex o) {
		if(weigth>o.weigth)return 1;
		else if(weigth<o.weigth)return -1;
		return 0;
	}

}
