package dataStructure;

public class QueueImpUsingArray {
	
	int size;
	int arr[];
	int rear;
	int front;
	
	
	QueueImpUsingArray(int size) {
		this.size = size;
		this.arr = new int[size];
		this.rear = 0;
		this.front = 0;
	}
	
	
	//isEMpty
	public boolean isEmpty() {
		return front==rear;
	}
	
	//isFull
	public boolean isFull() {
		return rear>size-1;
	}
	
	//front
	public int front() {
		if(!isEmpty()) {
		return arr[front];
		}
		else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	public void enqueue(int n) {
		if(!isFull()) {
			arr[rear]= n;
			rear++;
			System.out.println(n+" added");
		}
		else {
			System.out.println("Queue is full");
		}
	}
	
	public void dequeue() {
		if(!isEmpty()) {
			System.out.println(arr[front]+" removed");
			for(int i=0;i<rear-1;i++) {				
				arr[i]= arr[i+1];
				
			}
			rear--;
		}
		else {
			System.out.println("Queue Empty");
		}
		
	}
	
	public void display() {
		for(int i=front;i<rear;i++) {
			System.out.println(arr[i]);
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueImpUsingArray q = new QueueImpUsingArray(3);
		
		q.dequeue();
		q.enqueue(4);
		q.display();
		q.dequeue();
		System.out.println(q.isEmpty());
		q.enqueue(10);
		q.enqueue(1);
		q.enqueue(5);
		q.enqueue(11);
		q.display();
		q.dequeue();
		q.display();
		q.enqueue(12);
		q.display();

	}

}
