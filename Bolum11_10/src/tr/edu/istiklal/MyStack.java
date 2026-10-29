package tr.edu.istiklal;

import java.util.ArrayList;

public class MyStack extends ArrayList<Object> {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int getSize() {
        return size();
    }

    public Object peek() {
        return get(getSize() - 1);
    }

    public Object pop() {
        Object o = get(getSize() - 1);
        remove(getSize() - 1);
        return o;
    }

    public void push(Object o) {
        add(o);
    }

    public int search(Object o) {
        return lastIndexOf(o);
    }

    @Override
    public String toString() {
        return  super.toString();
    }
}