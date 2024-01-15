
public class MyPriorityQueue<T extends Comparable<T>> {
	
	private MyDoubleLinkedList<T> datas;
	
	public MyPriorityQueue() {
		datas=new MyDoubleLinkedList<>();
	}
	
	public void insert(T info) {
		for(int i=0;i<datas.getSize();i++) {
			if(datas.get(i).compareTo(info)>0) {
				datas.add(i,info);
				return;
			}
		}
		datas.add(info);
	}
	
	public T poll() {
		return datas.remove(0);
	}
	
	public int size() {
		return datas.getSize();
	}
	
	public boolean isEmpty() {
		return datas.isEmpty();
	}
	
	public void clear() {
		datas.clear();
	}
	
}
