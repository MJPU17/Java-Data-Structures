
public class DequeList<T> extends MyDoubleLinkedList<T>{
	
	private DNode<T> tail;
	
	public DequeList() {
		super();
		tail=new DNode<T>();
        this.head=new DNode<T>();
        this.head.setNext(tail);
        tail.setPrevious(this.head);
	}

	public DNode<T> getTail() {
		return tail;
	}

	public void setTail(DNode<T> tail) {
		this.tail = tail;
	}
	
	public void insertLast(T info){
        DNode<T> t=this.tail;
        DNode<T> temp=new DNode<T>(info);
        temp.setPrevious(t);
        t.setNext(temp);
        this.current=temp;
        tail=temp;
        if(this.size==0)this.head=temp;
        this.size++;
        this.position=this.size-1;
    }
	
	public T removeLast(){
        T value = null;
        if(tail==null)return value;
        value=tail.getInfo();
        tail=tail.getPrevious();
        if(tail!=null)tail.setNext(null);
        this.size--;
        this.position=this.size-1;
        this.current=tail;
        if(this.size==0){
            tail=new DNode<T>();
            this.head=new DNode<T>();
            this.head.setNext(tail);
            tail.setPrevious(this.head);      
        }
        return value;
    }
	
	public void insertFirst(T info){
        DNode<T> h=this.head;
        DNode<T> temp=new DNode<T>(info);
        temp.setNext(h);
        h.setPrevious(temp);
        this.current=temp;
        this.head=temp;
        if(this.size==0)tail=temp;
        this.size++;
        this.position=0;
    }
	
	public T removeFirst(){
        T value=null;
        if(this.head==null) return value;
        value=this.head.getInfo();
        this.head=this.head.getNext();
        if(this.head!=null)this.head.setPrevious(null);
        this.size--;
        this.position=0;
        this.current=this.head;
        if(this.size==0){
            tail=new DNode<T>();
            this.head=new DNode<T>();
            this.head.setNext(tail);
            tail.setPrevious(this.head);      
        }
        return value;
    }

}
