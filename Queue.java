
public class Queue<T> implements QueueADT<T> {

	LinkedList<T> list = new LinkedList<T>();
	Listnode<T> tail = list.getHeaderNode();
	

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void enqueue(Object data) throws IllegalArgumentException {
		if(list.isEmpty()){
			throw new IllegalArgumentException();
		}
		
		list.add((T) data);
		//possibly check in here for an error
		//update the tail reference
		tail = tail.getNext();
		
	}

	public T dequeue() throws EmptyQueueException {
		if(list.isEmpty()){
			throw new EmptyQueueException();
		}
		
		Listnode<T> temp = (Listnode<T>) list.remove(0);
		
		return temp.getData();
	}

	public T element() throws EmptyQueueException {
		if(list.isEmpty()){
			throw new EmptyQueueException();
		}
		
		Listnode<T> temp = (Listnode<T>) list.get(0);
		
		return temp.getData();
	
	}

}
