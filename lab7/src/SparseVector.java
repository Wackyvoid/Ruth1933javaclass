public class SparseVector {

	private Node head;
	private int length;

	public SparseVector(int len){
		head = null;
		length = len;
	}

	// Prints out a sparse vector (including zeros)
	public String toString(){

		String result = "";
		Node currNode = head;
		int currIndex = 0;
		while( currNode != null ){
			int idx = currNode.getIndex();

			// Pad the space between nodes with zero
			while( currIndex < idx ){
				result += "0, ";
				currIndex++;
			}
			result += currNode;
			currNode = currNode.getNext();
			currIndex++;

			// Only add a comma if this isn't the last element
			if( currNode != null ){ result += ", "; }
		}
		return result;
	}

	// TODO: Implement me for milestone 1
	public void addElement(int index, double value) {
		if (index<0 || index >= length){
			System.out.println("Invalid input, try again");

		} else if(head==null){
			head = new Node(index, value);

		}else if(head!=null){//while loop to find the end and add the node
			Node a = new Node(index, value);
			Node currNode = head;

			while( currNode.getNext() != null ){

				currNode = currNode.getNext();
			}

			currNode.setNext(a);

		}
	}


// nair0025
	//milestone 2
	//Explain the difference between Step Over and Step Into:
	//Step Over: If the next line of code is a method, then execute that method. (When a method is referenced in main Step Over continues in main to the next line)
	//Step Into: If the next line of code is a method, then move into that method. (When a method is referenced in main step into goes to where that method is in the class file)
// Step over would be better than step into when you want to execute a method call without stepping through it.
	// Step out lets you move back to the calling function. For when you don't want to step through the rest of a method.



	// TODO: Implement me for milestone 3
	public static double dot( SparseVector x, SparseVector y ){
		double result = 0.0;
		if(x.length == y.length && x.length > 0 && y.length > 0){

			if(x.head != null && y.head != null){
				int currIndex = 0;
				int currIndex2 = 0;
				Node currNode = x.head;
				Node currNode2 = y.head;
				while(currNode!= null && currNode2 != null ){

					if(currNode == null ){
						currIndex++;
					}
					if(currNode2 == null){
						currIndex2 ++;
					}
//					System.out.println(currNode.getIndex()== currNode2.getIndex());

					if(currIndex == currIndex2) {
						System.out.println("currNode inx: " + currIndex + "currNode2 inx: " + currIndex2);
						System.out.println("currNode: " + currNode.getValue()+ "currNode2: " + currNode2.getValue());
						result += currNode.getValue() * currNode2.getValue();
					}

					currNode = currNode.getNext();
					currNode2 = currNode2.getNext();
					currIndex++;
					currIndex2++;

				}
				//System.out.println(currIndex);
			}else if(x.head == null && y.head == null){
				System.out.println("Head is null");
			}

		}
		return -result;
	}

	//for milestone 4
	//public void removeElement(int index){
//		if (index<0 || index >= length){
//			System.out.println("Invalid input, try again");
//
//		} else if(head==null){
//			head = new Node(index, value);
//
//		}else if(head!=null){//while loop to find the end and add the node
//			Node a = new Node(index, value);
//			Node currNode = head;
//
//			while( currNode.getNext() != null ){
//
//				currNode = currNode.getNext();
//			}
//
//			currNode.setNext(a);
//
//		}
	// }


	// TODO: Test out your code here!
	public static void main(String[] args) {
//		SparseVector vect = new SparseVector(6);
//		vect.addElement(0,10.0);
//		vect.addElement(3,-1.1);
//		vect.addElement(5,32.0);
//		System.out.println(vect);
//		SparseVector x = new SparseVector(10);
//		x.addElement(0, 1.0);
//		x.addElement(7, 3.0);
//		x.addElement(8, -2.0);
//		SparseVector y = new SparseVector(10);
//		y.addElement(0, 2.0);
//		y.addElement(8, -4.0);
//		double result = dot(x, y);
//		System.out.println(result);
		//System.out.println("pie!");


		SparseVector x = new SparseVector(100000000);
		x.addElement(0, 1.0);
		x.addElement(10000000, 3.0);
		x.addElement(10000001, -2.0);
		SparseVector y = new SparseVector(100000000);
		y.addElement(0, 2.0);
		y.addElement(10000001, -4.0);
		double result = dot(x, y);
		System.out.println(result);
	}
}


