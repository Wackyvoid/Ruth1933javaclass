import java.util.Scanner;

public class HistogramApp {

    public static void main(String[] args) {
        System.out.println("--Histogram Console-- \n");
        System.out.println("Options \n" + "add - used to add numbers in a histogram \n" +
                "print - prints the histogram to the screen \n" + "quit - leaves the program \n");

        System.out.println("What is your lowerbound?"); //lower
        Scanner myScanner = new Scanner(System.in);
        int lowerinput = myScanner.nextInt();

        System.out.println("What is your upperbound?");//upper
        int upperinput = myScanner.nextInt();

        Histogram newHisto = new Histogram(lowerinput, upperinput);//new histo made

        System.out.println("Enter command:");
        String check = myScanner.nextLine();
        String userInput = myScanner.nextLine();
        while (!(userInput.equals("quit"))) {
            if (userInput.equals("add")) {
                System.out.println("Enter number:");
                int addInput = myScanner.nextInt();
                if (addInput <= upperinput && addInput >= lowerinput) {
                    newHisto.add(addInput);
                } else {
                    System.out.println(addInput + " is not in the range");
                }
                check = myScanner.nextLine();
                System.out.println("Enter command:");
                userInput = myScanner.nextLine();
            } else if (userInput.equals("print")) {
                System.out.println(newHisto);
                System.out.println("Enter command:");
                userInput = myScanner.nextLine();
            } else {
                System.out.println("Options \n" + "add - used to add numbers in a histogram \n" +
                        "print - prints the histogram to the screen \n" + "quit - leaves the program");
                check = myScanner.nextLine();
                System.out.println("Enter command:");
                userInput = myScanner.nextLine();
            }
        }
        System.out.println("Bye!");
    }
}
