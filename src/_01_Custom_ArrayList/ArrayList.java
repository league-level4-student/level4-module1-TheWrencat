package _01_Custom_ArrayList;

import java.util.Stack;

@SuppressWarnings("unchecked")

public class ArrayList<T> {

	Stack<T> stk = new Stack<T>();
	

	public T get(int loc) throws IndexOutOfBoundsException {
		T thing = stk.get(loc);
		return thing;
	}

	public void add(T val) {
		stk.add(val);
		
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		stk.insertElementAt(val, loc);
	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		stk.set(loc, val);
	}

	public void remove(int loc) throws IndexOutOfBoundsException {
			stk.remove(loc);
	}

	public boolean contains(T val) {
		boolean con = false;
		if(stk.contains(val)) {
			con = true;
		}
		return con;
	}

	public int size() {
		int count= stk.size();
		return count;
	}
	

}