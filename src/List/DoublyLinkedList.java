package List;

public class DoublyLinkedList {
	Node head;
	Node end;
	
	public DoublyLinkedList(){
		head = null;
		end = null;
	}
	
	public boolean isEmpty(){
		boolean empty = false;
		if(head == null){
			empty = true;
		}
		return empty;
	}
	
	private void link(Node nodeA, Node nodeB){
		nodeA.next = nodeB;
		nodeB.previous = nodeA;
	}
	
	public void insertStart(double xData, double yData){
		Node newNode = new Node(xData, yData);
		if(this.isEmpty()){
			head = newNode;
			end = newNode;
		}else{
			link(newNode, head);
			head = newNode;
		}
	}
	
	public void insertEnd(double xData, double yData){
		Node newNode = new Node(xData, yData);
		if(this.isEmpty()){
			head = newNode;
			end = newNode;
		}else{
			link(end, newNode);
			end = newNode;
		}
	}
	
	public void deleteFirstElement(){
		if(!this.isEmpty()){
			Node first = head.next;
			if(first == null){
				head = null;
				end = null;
			}else{
				first.previous = null;
				head = first;
			}
		}
	}
	
	public void deleteLastElement(){
		if(!this.isEmpty()){
			Node last = end.previous;
			if(last == null){
				head = null;
				end = null;
			}else{
				last.next = null;
				end = last;
			}
		}
	}
	
	public double getXInElement(int location){
		double element = 0;
		if(location >= 0){
			int position = 0;
			Node iterator = head;
			while(iterator != null){
				if(position == location){
					element = iterator.x;
					break;
				}
				iterator = iterator.next;
				position++;
			}
		}
		return element;
	}
	
	public double getYInElement(int location){
		double element = 0;
		if(location >= 0){
			int position = 0;
			Node iterator = head;
			while(iterator != null){
				if(position == location){
					element = iterator.y;
					break;
				}
				iterator = iterator.next;
				position++;
			}
		}
		return element;
	}
	
	public int size(){
		int size = 0;
		if(!this.isEmpty()){
			Node iterator = head;
			while(iterator != null){
				iterator = iterator.next;
				size++;
			}
		}
		return size;
	}
}
