import java.util.Iterator;

public class StackImp<T> implements Iterable<T>{
	
	private DequeList<T> infos;
	
	public StackImp() {
		infos=new DequeList<>();
	}
	
	public void push(T info) {
		infos.insertLast(info);
	}
	
	public T pop() {
		return infos.removeLast();
	}
	
	public T peek() {
		return infos.getTail().getInfo();
	}
	
	public int size() {
		return infos.getSize();
	}
	
	public boolean isEmpty() {
		return infos.isEmpty();
	}
	
	public void clear() {
		infos.clear();
	}

	@Override
	public Iterator<T> iterator() {
		return infos.iterator();
	}

}
