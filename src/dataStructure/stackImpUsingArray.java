package dataStructure;

public class stackImpUsingArray {
	
	int size;
	int[] arr;
	int top;
	
	stackImpUsingArray(int size){
		this.size = size;
		this.arr = new int[size];
		this.top=-1;
	}
	
	//isEmpty
	public boolean isEmpty() {
		return top==-1;
	}
	
	//isEmpty
	public boolean isFull() {
		return top==size-1;
	}
	
	//peek
	public int peek() {
		if(!isEmpty()) {
			System.out.println(arr[top]);
		return arr[top];
		}
		else{
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	//push
	public void push(int n) {
		if(!isFull()) {
			top++;
			arr[top] = n;
		}
		else {
			System.out.println("Stack is full");
		}
	}
	
	//pop
	public int pop() {
		if(!isEmpty()) {
			int returnedValue = arr[top];
			top--;
			System.out.println(arr[returnedValue]);
			return arr[returnedValue];
		}
		else{
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stackImpUsingArray st = new stackImpUsingArray(5);
				
		st.peek();
		st.pop();
		st.push(2);
		st.peek();
		System.out.println(st.isEmpty());
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		st.peek();
		System.out.println(st.isFull());

	}

}
