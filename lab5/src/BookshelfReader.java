import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class BookshelfReader {
    //private Bookshelf bookshelf;


    public static Bookshelf readBooksFromFile(String fileName) {
        Scanner s = null;
        try {
            s = new Scanner(new File(fileName));
        } catch (Exception e) {
            Bookshelf bookshelf = new Bookshelf(0);
            return bookshelf;
        }

        int numLines = 0; // to get the amount of books
        while(s.hasNextLine()) {
            String str = s.nextLine();
            numLines++;
        }
        s.close();
        Book[] data = new Book[numLines]; //each index has book info
        System.out.println(data.length); //
        try {
            s = new Scanner(new File(fileName));
        } catch (Exception e) {
            Bookshelf bookshelf = new Bookshelf(0);
            return bookshelf;
        }

        int index = 0;

        while (s.hasNextLine()){
            String a = s.nextLine();
            System.out.println(a);
            String[] stringArray = a.split(", ");
            System.out.println(stringArray[0]);
            data[index] = new Book(stringArray[0], stringArray[1], Double.parseDouble(stringArray[2]));
            index++;
        }

        Bookshelf bookshelf = new Bookshelf(index);
        for (int i = 0; i< index; i++) {
            bookshelf.add(data[i]);
        }

        return bookshelf;

    }

//    public BookshelfReader(String fileName) {
//        this.fileName = fileName;
//        Bookshelf newBook = new Bookshelf(readBooksFromFile(fileName));
//    }

    public static void writeShelfToFile(Bookshelf b, String fileName) {
        PrintWriter p = null;
        try {
            p = new PrintWriter(new File(fileName));
            p.println(b.toString());

        } catch (Exception e) {
            int idk = 1 + 2;
        }
        p.close();
    }

    public static void main(String[] args) {
        Bookshelf newShelf = readBooksFromFile("bookinput.txt");
        System.out.println(readBooksFromFile("bookinput.txt"));
        newShelf.sort('R');
        writeShelfToFile(newShelf, "output.txt");
    }
}
