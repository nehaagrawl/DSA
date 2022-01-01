public class StackUsingLinkedList { 
		static class Node {
			//Stack represntation using Linkedlist
			int data;
			Node next;	
		public Node(int d, Node n) {
				data = d;
				next = n;
			}
		}
		//Representing top node and size of stack
		public Node top;
	     public int size;
	
		public StackUsingLinkedList() {
			//assinging top node as null & size is 0 because no node is there..
			top = null;
			size = 0;
		}
	
		public int Length() {
	      //Returning size
			return size;
		}
	
		public boolean isEmpty() {
			//checking is stack is empty
			return size == 0;
		}
	
		public void Push(int d)
		{
			//inserting data in stack
			Node newNode = new Node(d, null);
			if (!isEmpty()) {
				
				newNode.next = top;
			}
			top = newNode;
			size = size + 1;
		}
	
		public int Pop()
		{
			//poping data from stack
			if(isEmpty()) {
				System.out.println("Stack is Empty");
				return -1;
			}
			int d = top.data;
			top = top.next;
			size = size - 1;
			return d;
		}
	
		public int Top()
		{
			if(isEmpty())
			{
				//Is stack is empty is Checking if yes then return -1 
				System.out.println("Stack is Empty");
				return -1;
			}
			//otherwise returing data
			return top.data;
		}
	
		public void Display()
		{
			//creating p as node to traversal whole stack
			Node p = top;
			while(p!=null)//if p pointer is not null until traverse 
			{
				System.out.print(p.data + "---->");
				p = p.next;
			}
			System.out.println("Null");
		}
	
		public static void main(String[] args) {
			StackUsingLinkedList s = new StackUsingLinkedList();
			System.out.println("Is Stack is Empty :"+s.isEmpty());
			s.Push(1);
			s.Push(2);
			s.Push(3);
			s.Push(4);
			s.Push(5);
			s.Push(6);
			s.Push(7);
			s.Display();
			System.out.println("Element  is Popped: " + s.Pop());
			System.out.println("Element is  Popped: " + s.Pop());
			s.Push(8);
			s.Push(10);
			s.Display();
			System.out.println("Eelement is on Top: " + s.Top());
			s.Display();
			System.out.println("Length of Stack :"+s.Length());
			System.out.println("Is Stack is Empty :"+s.isEmpty());
		}
	
	}
	