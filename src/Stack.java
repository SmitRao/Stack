import java.util.ArrayList;
import java.util.List;

public class Stack {
	
	private List data = new ArrayList<Object>();
	private Object top;
	
	public Stack() {
		this.top = top;
		this.data = data;
	}
	
	public Stack(Object obj) {
		this.top = obj;
		this.data.add(obj); 
	}
	
	public void push(Object item) {
		this.top = item;
		this.data.add(item);
	}
	
	public int size() {
		return this.data.size();
	}
	
	public Object pop() throws EmptyStackError {
		if(this.size() == 0) {
			throw new EmptyStackError("Stack is empty.");
		} else if(this.size() == 1) {
			
				this.top = null;
				return this.data.remove(this.data.size()-1);
			} 
		else {
			this.top = this.data.get(this.data.size()-2);
			return this.data.remove(this.data.size()-1);
		}
	}
	
	public static void main(String[] args) throws EmptyStackError {
		Stack s = new Stack("Hello");
		System.out.println("Top: " + s.top + " Size: " + s.size() + " Data: " + s.data);
		System.out.println(s.pop());
		System.out.println("Top: " + s.top + " Size: " + s.size() + " Data: " + s.data);
		System.out.println(s.pop()); // Throw EmptyStackError here.
	}
	
}