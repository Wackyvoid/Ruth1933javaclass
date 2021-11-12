public class Review {
    private static Node head;
    private boolean isSorted;

    public Review() {
        head = null;
        isSorted = true;
    }
    public boolean add(int element) {
        if(head==null){
            Node a = new Node( element,null);
            head = a;
            return true;

        }else if(head!=null) {//while loop to find the end and add the node
            Node currNode = head;
            while (currNode.getNext() != null) {
                currNode = currNode.getNext();
            }
            Node a = new Node(element, null); //can I just say element or do I need a T?

            currNode.setNext(a);
        }
        return true; //program stops and returns true
    }
    public static void removeEvery(int n){
        if(n==1){ //if n = 1 then get rid of the whole list
            head.setNext(null);
        }else if (n > 0){//if n is an int greater than 0, continue
            int indx = 0;
            Node trailer = head; //since its a headed list this is behind the current node
            Node ptr = head.getNext();//in front of trailer
            while(ptr != null){ //this while loop goes to the end of the headed linked list then stops
                if(indx == n -1) { //get rid of every n
                    trailer.setNext(ptr.getNext());
                }else{//if not every nth
                    trailer = ptr;
                }
                ptr = ptr.getNext();
                indx = (indx + 1) % n;//formula for while loop
            }
        }

    }
    public String toString(){
        String s = "";
        Node test = head;
        while(test.getNext() != null){
            s += "Node: " + test.getData() + '\n';
            //System.out.println("CurrNode: " + test.getData());
            test = test.getNext();
        }
        return s;
    }

    /*
    public LinkedList<LinkedList<T>> extractGroupsOf(int n){
     LinkedList<LinkedList<T>> outerList = new LinkedList<>();
     if (n == 0) { //returns empty list
         return outerList;
     }
     LinkedList<T> currentList = outerList.head;
     Node<T> currentNode = head.getNext(); //first node of original list

     int count = 0;
     while (currentNode != null) {  //counts the number of nodes in the list
        count++;
        currentNode = currentNode.getNext();
      }
    currentNode = head.getNext();
    LinkedList<T> innerList = new LinkedList<>();
    Node<T> innerListCurrentNode = innerList.head;
    for (int i = 0; i < count; i++) {
        innerListCurrentNode.setNext(currentNode);
        innerListCurrentNode = innerListCurrentNode.getNext();
        currentNode = currentNode.getNext();
        if ((i % n) == (n - 1)) {  //adds the new list to the group list
            innerListCurrentNode.setNext(null);
            currentList.setNext(innerList);
            currentList = currentList.getNext();
            innerList = new LinkedList<>();
            innerListCurrentNode = newList.head;
         }
     }
     currentList.setNext(newList);
     return outerList;
     }

    }

     */
    public static void main(String[] args){

        Review b = new Review();
        b.add(-1);
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);
        b.add(6);
        b.add(7);
        b.add(8);
        b.removeEvery(3);
        System.out.print(0%3);
        //Review.removeEvery(2);
    }
}
