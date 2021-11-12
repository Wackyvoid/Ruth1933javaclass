public class MyTicket implements TicketInterface {
    private String color;
    private static int number;


    public MyTicket(String s) {
        this.color = s;
    }

    @Override
    public int getNumber() {
        return number++;
    }

    @Override
    public String getColor() {
        return color;
    }

    public String toString() {
        return getColor() +": " + getNumber();
    }
}

    public static int getInfo(Cell[][] board, int col) {
        int rows = board[0].length;

        for (int i = 0; i < rows; i++) {
            if (board[i][col].getStatus == 'b') {
                return i;
            }
        }
        return -1;
    }

    public int count() {
         int count = 0;
    NGen<T> currNode = begin;

    if (currNode == null) { //empty list case
        return count;
    } else if (currentNode.getNext() == null) { //case that list only contains one node
        if (currNode.getData() != null) {
            count = 1;
        }
        return count;
    } else { //general case
        while (currNode.getNext() != null) { //increase count for each non null value
            if (currNode.getData() != null) {
                count++;
            }
            currNode = currNode.getNext()
        }
        if (currNode.getData() != null) { //checking last node in list (points to null so not incl. above)
            count++;
        }
        return count;
    }
    }

    public int count() {
        int count = 0;
        NGen<T> currNode = begin;

        if (currNode == null) { //empty list case
            return count;
        } else if (currentNode.getNext() == null) { //case that list only contains one node
            if (currNode.getData() != null) {
                count = 1;
            }
            return count;
        } else {
            while (currNode.getNext() != null) { //increase count for each non null value
                if (currNode.getData() != null) {
                    count++;
                }
                currNode = currNode.getNext()
            }
            if (currNode.getData() != null) { //checking last node in list (points to null so not incl. above)
                count++;
            }
            return count;
        }
    }