public interface TicketInterface {
    // Interface for a class to produce customer waiting queue tickets with
    // a number and a color.
    // Numbers are generated sequentially starting with 0, colors are
    // independent of the numbers, and they are specified by a String
    // argument to the constructor.

    int getNumber();  // returns a ticket's number

    String getColor();  // returns a ticket's color

    String toString();  // returns color followed by ":" followed by number
}