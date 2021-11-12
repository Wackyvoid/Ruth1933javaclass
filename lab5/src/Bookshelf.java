public class Bookshelf {
    Book[] bookshelf;
    private int nextEmpty = 0;


    public Bookshelf() {
        bookshelf = new Book[20];
    }

    public Bookshelf(int shelfSize) {
        bookshelf = new Book[shelfSize];
    }

    public boolean add(Book newBook) {
        if (nextEmpty == (bookshelf.length)) {
            return false;
        }else{
            bookshelf[nextEmpty] = newBook;
            nextEmpty++;
            return true;
        }

    }

    public Bookshelf getBooksByAuthor(String author) {
        int shelfLength = 0;
        for (int i=0; i < bookshelf.length; i++) { //to get the size of the array with books that have the same author
            if (bookshelf[i].getAuthor().equals(author)) {
                shelfLength++;
            }
        }
        Bookshelf bookshelf2 = new Bookshelf(shelfLength);
        for (int i=0; i < bookshelf.length; i++) {
            if (bookshelf[i].getAuthor().equals(author)) {
                bookshelf2.add(bookshelf[i]);
            }
        }
        return bookshelf2;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < (bookshelf.length); i++) {
            s += ("Title: " + bookshelf[i].getTitle() + ", ");
            s += ("Author: " + bookshelf[i].getAuthor() + ", ");
            s += ("Rating: " + bookshelf[i].getRating() + "\n");
        }
        return s;
    }

    public void sort(char sortBy) { //m2
        Book n;
        int counter = 0;
        int check;

        for (int i = 1; i < nextEmpty; i++) {
            n = bookshelf[i];
            for (int j = i - 1; j >= 0; j--) {
                //counter++;
                check = n.compareTo(bookshelf[j], sortBy);
                System.out.println(check );
                if (check < 0) {
                    bookshelf[j + 1] = bookshelf[j];
                    bookshelf[j] = n;
                }
            }
        }
        //System.out.println(counter);
    }

    public static void main(String[] args) {
        Book book1 = new Book("E", "A", 80);
        Book book2 = new Book("G", "C", 90);
        Book book3 = new Book("Three", "D", 90);
        Book book4 = new Book("F", "B", 75);

        Bookshelf bookshelfNew = new Bookshelf(4);

        //t/f
        System.out.println(bookshelfNew.add(book1));
        System.out.println(bookshelfNew.add(book2));
        System.out.println(bookshelfNew.add(book3));
        System.out.println(bookshelfNew.add(book4));

        //list
        System.out.println(bookshelfNew);

        bookshelfNew.sort('t');
        System.out.println(bookshelfNew);
    }

}
