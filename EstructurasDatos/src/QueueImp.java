import java.util.Iterator;

public class QueueImp<T> implements Iterable<T>{
	
	private DequeList<T> infos;
	
	public QueueImp() {
		infos = new DequeList<>();
	}
	
	public void enqueue(T info) {
		infos.insertLast(info);
	}
	
	public T dequeue() {
		return infos.removeFirst();
	}
	
	public int size() {
		return infos.getSize();
	}
	
	public boolean isEmpty() {
		return infos.isEmpty();
	}
	
	public T peek() {
		return infos.getHead().getInfo();
	}
	
	public void clear() {
		infos.clear();
	}

	@Override
	public Iterator<T> iterator() {
		return infos.iterator();
	}

}
