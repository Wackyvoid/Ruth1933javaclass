public class Stack<T extends Comparable<T>>{
    private int size;
    private Node<T> node = null;
    private int currSize;
    //private Node node = null;
    public Stack() {
        this.size = 5;
    }

    public Stack(int size) {
        this.size = size;
    }

    public T pop() {
         if (node == null) {
             throw new RuntimeException("Tried to pop an empty stack");
         } else {
             T data = (T) node.getData();
             node = node.getNext();
             return data;
         }
    }

    public void push(T item)throws StackException {
        if (node == null) {
            node = new Node<T>(item, null);
            currSize = 1;
        } else {
            if (currSize <= size) {
                try {
                    Node<T> newNode = new Node<T>(item, node);
                    currSize++;
                    throw new StackException(size);
                } catch (StackException e) {
                    System.out.println("Exceeds stack size");
                }
            }
        }
    }

}
