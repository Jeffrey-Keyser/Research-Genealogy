import java.util.EmptyStackException;

public class Stack<T> implements StackADT {

	 LinkedList<T> list = new LinkedList<T>();
	
	
	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public void push(Object data) throws IllegalArgumentException {
		if (data == null)
			throw new IllegalArgumentException();
		
		list.add((T) data);
	}

	@Override
	public Object peek() throws EmptyStackException {
		if (isEmpty())
			throw new EmptyStackException();
		
		return list.get(0);
	}

	@Override
	public Object pop() throws EmptyStackException {
		if (isEmpty())
			throw new EmptyStackException();
		
		Listnode<T> temp = (Listnode<T>) list.remove(0);
		
		return temp;
	}

	@Override
	public StackADT reverse() {
			return null;
		
		
	}

}
