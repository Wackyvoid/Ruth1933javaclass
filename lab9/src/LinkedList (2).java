//Namita Nair, nair0025, 5461640
//Ruth Mesfin, mesfi020, 5616951

public class LinkedList<T extends Comparable <T>> implements List<T> {
    private Node<T> head;
    private boolean isSorted;

    public LinkedList() {
        head = null;
        isSorted = true;
    }

    public boolean add(T element) {
        if (element == null) {
            return false; //program stops and returns false
        } else if (head == null) { //case of adding to start of list
            Node<T> a = new Node<T>(element, null);
            head = a;
            return true;
        } else if (head != null) { //general case
            Node<T> currNode = head;
            while (currNode.getNext() != null) {
                currNode = currNode.getNext();
            }
            //After it finds the last node, it proceeds and makes a new node with the element and places it at the end
            Node<T> a = new Node<T>(element, null);
            currNode.setNext(a);

        }
        isSorted = this.isSorted();
        return true; //program stops and returns true
    }

//TEST for the one above:
    //Node test = head;
    //            while (test.getNext() != null) {
    //                System.out.println("n: \n"+test.getData());
    //                System.out.println("a: \n"+a.getData());
    //                test =test.getNext();
    //            }

    public boolean add(int index, T element) {
        int length = 0;
        Node<T> currNode = head;
        Node<T> nextN = head.getNext();

        if (element == null || index < 0 || index >= this.size() || this.isEmpty()) { // returns false if index is null or if index is out-of-bounds
            return false;
        } else if (index == 0) { //case if list is length one
            Node<T> a = new Node<T>(element, head);
            head = a;
            return true;
        } else if (head != null) { //general case
            Node<T> currN = head;
            int currindex = 0;

            for(int i = 0; i<index - 1; i++){ //traverses list up to index
                currN = currN.getNext();
                nextN = currN.getNext();
            }

            Node<T> a = new Node<T>(element,nextN); //creates new node pointing to node after index
            currN.setNext(a); //sets previous nodes index to new node

        }
        isSorted = this.isSorted();
        return true;
    }


    public void clear() {
        if (head != null) { //while loop to find the end and add the node
            head.setNext(null); //clears node
            head = null;
        }
        isSorted = true;
    }


    public T get(int index){ //Namita
        Node<T> currNode = head;
        if (index >= this.size() || index < 0) {
            return null;
        } else {
            while (index > 0) { //traverses list up to index
                currNode = currNode.getNext();
                index--;
            }
            return currNode.getData(); //returns value at index
        }
    }


    public int indexOf(T element) { //Not passing test even though calls in main are working.. could be missing an edge case
        int index = 0;
        if (element == null) {
            return -1;
        }
        if (isSorted == true) { //if array is sorted

            if (head == null || head.getData().compareTo(element) > 0) {
                return -1;
            } else { //traverses list and finds first index of element
                Node<T> currNode = head;
                while (currNode.getData() != element) {
                    System.out.println(index);
                    index++;
                    currNode = currNode.getNext();
                }
                return index;
            }
        } else { //if array is not sorted
            Node<T> currNode = head;
            while (currNode.getData() != element) {
                if (currNode.getNext() == null) {
                    return -1;
                }
                index++;
                currNode = currNode.getNext();
            }
            return index;
        }
    }


    public boolean isEmpty(){
        Node<T> currNode = head;
        if (head == null) { //if only one element and it is empty
            return true;
        }
        while (currNode != null) { //traverses list and returns false if any of the nodes are not empty
            if (currNode.getData() != null) {
                return false;
            }
            currNode = currNode.getNext();
        }
        return true;
    }

    public int size() {
        int size = 0;
        if (head == null) { //empty list
            return size;
        } else if (head != null) { //traverses list and increases size each node
            Node<T> currNode = head;
            int index = 0;
            while (currNode.getNext() != null) {
                index++;
                currNode = currNode.getNext();
            }
            size = index + 1;
        }
        return size;
    }

    public void sort() { //Incomplete method;; fails test
        Node<T> currNode = head;
        Node<T> ptr = head.getNext();
        Node<T> smallest = head.getNext();
        int count = 0;
        if (!this.isSorted()) {
            for (int i = 0; i < this.size(); i++) {
                while (currNode != null) {
                    if (currNode.getData().compareTo(smallest.getData()) < 0) {
                        smallest.setData(currNode.getData());
                        currNode.setData(smallest.getData());
                    }
                    currNode = currNode.getNext();
                }
            }
//            while (currNode.getNext() != null) {
//                if (count == 0) {
//                    System.out.println("0 case");
//                    if (currNode.getData().compareTo(smallest) < 0) {
//                        T temp = currNode.getData();
//                        currNode.setData(head.getData());
//                        head.setData(temp);
//                        count++;
//                    }
//                } else if (count < this.size()) {
//                    while (ptr.getNext() != null) {
//                        if (currNode.getData().compareTo(smallest) < 0) {
//                            System.out.println("other case");
//                            T temp = currNode.getData();
//                            currNode.setData(ptr.getData());
//                            ptr.setData(temp);
//                            currNode = currNode.getNext();
//                            ptr = currNode.getNext();
//                            count++;
//                        }
//                    }
//                }
//
//            }
            isSorted = true;
        }
    }

    public T remove(int index) { //incomplete method, fails unit test
        Node<T> currNode = head;
        Node<T> last = head;
        Node<T> next;
        int currindex = 0;
        if (index == 0) {
            head = head.getNext();
        } else if (index < 0 || index >= this.size()) {
            return null;
        }
        while (currindex != index) {
            if (currNode == null) { //might cause issues check to see if index is in size instead
                return null;
            }
            if (currindex == index - 1) { //nts: set the item before node to last
                last = currNode;
            }
            currindex++;
            currNode = currNode.getNext();
        }
        next = currNode.getNext(); //nts: set the item after node to next
        last.setNext(next); //nts: so the code skips over current node
        T temp = currNode.getData();

        return currNode.getData();
    }

    public void equalTo(T element) {
        Node<T> currNode = head;
        Node<T> nextNode = head.getNext();

        while (currNode.getNext() != null) { //traverses list and calls remove() method if the element is not equal
            if (currNode.getData() != element) {
                this.remove(this.indexOf(currNode.getData()));
                currNode.setNext(nextNode);
            }
            currNode = currNode.getNext();
            nextNode = currNode.getNext();
        }
        if (this.size() == 1) { //case if list is of length 1
            if (head.getData() != element) {
                this.remove(this.indexOf(head.getData()));
            }
        } else if (currNode.getNext() == null) { //case for when last item of the list is reached
            if (currNode.getData() != element) {
                this.remove(this.indexOf(currNode.getData()));
            }
        }
    }

    public void reverse() { //Incomplete
        Node<T> currNode = head;
        while (currNode.getNext() != null) {
            currNode = currNode.getNext();
        }
    }

    public void merge(List<T> otherList){ //Incomplete
    }

    //https://www.geeksforgeeks.org/rotate-a-linked-list/#:~:text=To%20rotate%20the%20linked%20list,and%20stop%20at%20kth%20node.
    public boolean rotate(int n) { //Incomplete
        if (n <= 0 || this.size() <= 1) {
            return false;
        } else {

            Node<T> currNode = head;
            int count = 1;
            while (count < n && currNode != null) {
                currNode = currNode.getNext();
                count++;
            }
            Node<T> endNode = currNode;
            while (currNode.getNext() != null) {
                currNode = currNode.getNext();
                currNode.setNext(head);
                head = endNode.getNext();
                endNode.setNext(null);
            }

//            for(int i = 1; i<=n; i++){
//                Node currNode = head;
//
//                while (currNode.getNext() != null) {
//                    currNode = currNode.getNext();
//                }

            //int currNodeindx = this.indexOf((T)currNode.getData());
//                for(int a=0; i<this.size();i++ ){
//
//                }


//                Node endNode = currNode;
//                while(currNode.getNext() != null){
//                    currNode.setNext(head);
//                    head = endNode;
//                    endNode.setNext(null);
//
//                }
//                System.out.println(head.getData());
            //Node last = currNode; //8

//                head.setData((T) currNode.getData());
//                currNode.setData();
//                System.out.println(head.getData());
        }
        if (isSorted == true) {
            isSorted = false;
        }
        return true;
    }

    public String toString(){
        Node<T> currNode = head;
        String s = "";
        int index = 0;
        while (currNode != null) { //traverses list and prints index and value of each node
            s += index + ": " + currNode.getData() + "\n";
            currNode = currNode.getNext();
            index++;
        }
        return s;
    }

    public boolean isSorted(){ //fails test because other methods fail, not sure if this one alone works
        Node<T> currNode = head;
        Node<T> nextN = head.getNext();
        while(nextN != null) {
            if (currNode.getData().compareTo(nextN.getData()) > 0) {
                isSorted = false;
            }
            currNode = currNode.getNext();
            nextN = currNode.getNext();
        }
        return isSorted;
    }

    public void removeEvery(int n) { //removes every nth element from the list, n >= 0, if n = 0 or n>size() do nothing
        if (n == 1) {
            head.setNext(null);
        } else if (n > 0) {
            int index = 0;
            Node<T> trailer = head;
            Node<T> ptr = head.getNext();
            while (ptr != null) {
                System.out.println(index);
                if (index == n - 1) {
                    trailer.setNext(ptr.getNext());
                } else {
                    trailer = ptr;
                }
                ptr = ptr.getNext();
                index = (index + 1) % n;
            }
        }

    }

//    public LinkedList<LinkedList<T>> extractGroupsOf(int n) { //returns a list of lists, each of size <= n
//        LinkedList<LinkedList<T>> outerList = new LinkedList<>();
//        if (n == 0) {
//            return outerList;
//        }
//        Node<LinkedList<T>> currentList = outerList.head;
//        Node<T> currentNode = head.getNext(); //first node of original list
//
//        int count = 0;
//        while (currentNode != null) { //counts number of nodes in the list
//            count++;
//            currentNode = currentNode.getNext();
//        }
//        currentNode = head.getNext();
//        Node<LinkedList<T>> innerList = new LinkedList<>();
        //Node<T> innerListCurrentNode = innerList.head;
//        for (int i = 0; i < count; i++) {
//            innerListCurrentNode.setNext(currentNode);
//            innerListCurrentNode = innerListCurrentNode.getNext();
//            currentNode = currentNode.getNext();
//            if ((i % n) == (n - 1)) { //adds the new list to the group list
//                innerListCurrentNode.setNext(null);
//                currentList.setNext(innerList);
//                currentList = currentList.getNext();
                //innerListCurrentNode = innerList.head;
//            }
//        }
//    }
//    


    public static void main(String[] args) { //main to test individual methods within the class
        LinkedList a = new LinkedList();
        a.add("head");
        a.add("hi");
        a.add("bye");
        a.add("howdy");
        a.add("hi");
//        System.out.println(a);
//        a.equalTo("bye");
        System.out.println(a);
        a.removeEvery(3);
        System.out.println(a);
//        a.size();
//        a.remove(3);
//        a.rotate(0);

//        LinkedList b = new LinkedList();
//        b.add(8);
//        b.add(45);
//        b.add(3);
//        b.add(4);
//        b.add(1);
//        b.add(3);
//        b.add(7);
//        b.add(2);
//        //b.rotate(2);
//        b.sort();
//        System.out.println(b);
    }
}