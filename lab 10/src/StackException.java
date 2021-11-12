public class StackException extends Exception {
    private int size;

    StackException(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
