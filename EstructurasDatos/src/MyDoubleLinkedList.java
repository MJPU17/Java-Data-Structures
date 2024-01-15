import java.util.Iterator;

public class MyDoubleLinkedList<T> implements Iterable<T>{
	
	protected DNode<T> head, current;
	protected int position, size;
	
	public MyDoubleLinkedList() {
		position=-1;
		size=0;
		head=null;
		current=null;
	}

	public DNode<T> getHead() {
		return head;
	}

	public void setHead(DNode<T> head) {
		this.head = head;
	}

	public DNode<T> getCurrent() {
		return current;
	}

	public void setCurrent(DNode<T> current) {
		this.current = current;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	boolean isEmpty() {
		return (size==0);
	}
	
	public void forward(int numposition){
        if(numposition>0 && this.head!=null){
            int positionForward=numposition;
            if(this.current==null){
                current=head;
                positionForward--;
                position++;
            }
            while (current.getNext()!=null && positionForward>0){
                current=current.getNext();
                positionForward--;
                position++;
            }
        }
    }
	
	public void backward(int numposition){
        if(numposition<=0 || head==null || current==null) return;
        int positionBackward=numposition;
        while (current!=null && positionBackward>0){
            current=current.getPrevious();
            positionBackward--;
            position--;
        }  
    }
	
	public void insert(T info){
        DNode<T> temp=new DNode<T>(info);
        if(this.current==null){
            temp.setNext(head);
            if(this.head!=null)head.setPrevious(temp);
            head=temp;
        }
        else {
            temp.setNext(current.getNext());
            temp.setPrevious(current);
            if(current.getNext()!=null)current.getNext().setPrevious(temp);
            current.setNext(temp);
        }
        current=temp;
        position++;
        size++;
    }
	
	public T extract(){
        T info=null;
        if(this.current!=null){
            info=current.getInfo();
            if(this.head==this.current)head=current.getNext();
            else current.getPrevious().setNext(current.getNext());
            if(current.getNext()!=null)current.getNext().setPrevious(current.getPrevious());
            current=current.getNext();
            if(size-1==position)position=-1;
            size--;
        }
        return info;
    }
	
	public T remove(int index){
        if(position>index)backward(Math.abs(position-index));
        else forward(Math.abs(position-index));
        return extract();
    }
	
	public void addInit(T info){
        backward(size);
        insert(info);
    }
	
	public void add(T info){
        forward(size);
        insert(info);
    }

	public void add(int index, T info){
        index-=1;
        if(position>index)backward(Math.abs(position-index));
        else forward(Math.abs(position-index));
        insert(info);
    }
	
	public T get(int index){
        if(position>index)backward(Math.abs(position-index));
        else forward(Math.abs(position-index));
        return current.getInfo();
    }
	
	public void set(int index, T info){
        if(position>index)backward(Math.abs(position-index));
        else forward(Math.abs(position-index));
        current.setInfo(info);
    }
	
	public void clear(){
        while(!isEmpty()){
            remove(0);
        }
    }

	@Override
	public Iterator<T> iterator() {
		return  new Iterator<T>() {
			
			int index=0;
			
			@Override
			public boolean hasNext() {
				return index<size;
			}

			@Override
			public T next() {
				return get(index++);
			}
			
		};
	}
	
}
