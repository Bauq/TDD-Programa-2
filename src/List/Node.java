package List;

public class Node {
	double x;
	double y;
	Node previous;
	Node next;
	
	public Node(double xData, double yData){
		this.x = xData;
		this.y = yData; 
		previous = null;
		next = null;
	}
}
