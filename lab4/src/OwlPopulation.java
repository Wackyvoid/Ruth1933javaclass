import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class OwlPopulation {
    private String fileName;
    private Owl[] data;


    public int populateData() throws FileNotFoundException {
        File f = new File(fileName);
        Scanner scanner = new Scanner(f);

        int numLines = 0;
        while(scanner.hasNextLine()){
            numLines++;
            String s = scanner.nextLine();
        }
        scanner.close();

        data = new Owl[numLines];   //data is is allocated the exact amount of space it needs
        scanner = new Scanner(f);

        //TODO: Populate the data with owls constructed from the lines of the file given
        int index = 0;
        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] stringArray = s.split(",");
            data[index] = new Owl(stringArray[0], Integer.parseInt(stringArray[1]), Double.parseDouble(stringArray[2]));
            index++;
        }

        return numLines;

    }

    public OwlPopulation(String fileName) throws FileNotFoundException{//constructor
        //TODO: Populate the class variables in OwlPopulation
        this.fileName = fileName;
        populateData();
    }

    public double averageAge(){
        //TODO: implement
        int totalAge = 0;
        for (int i = 0; i < data.length; i++) {
            totalAge += data[i].getAge();
        }
        return Double.parseDouble(String.valueOf(totalAge/data.length));
    }

    public Owl getYoungest(){
        //TODO: implement
        int youngest = data[0].getAge();
        int owlIndex = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i].getAge() < youngest) {
                youngest = data[i].getAge();
                owlIndex = i;
            }
        }
        return data[owlIndex];
    }

    public Owl getHeaviest(){
        //TODO: implement
        double heaviest = data[0].getWeight();
        int owlIndex = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i].getWeight() > heaviest) {
                heaviest = data[i].getWeight();
                owlIndex = i;
            }
        }
        return data[owlIndex];
    }

    public String toString(){
        //TODO: implement
        String s = "";
        s += ("The youngest Owl is named " + getYoungest().getName() + " with age " + getYoungest().getAge() + "\n");
        s += ("The heaviest Owl is named " + getHeaviest().getName() + " with weight " + getHeaviest().getWeight() + "\n");
        s += ("The average age of the population is " + averageAge());
        return s;
    }

    public boolean containsOwl(Owl other){
        //TODO: method you can implement as a helper function to your merge method
        for (int i = 0; i < this.popSize(); i++) {
            if (other.equals(this.data[i])) {
                return true;
            }
        }
        return false;
    }
    public void printmerge(){ //to see in terminal -- test not apart of lab but cool to see
        for(int i=0; i< this.popSize();i++){
            System.out.print(this.data[i].getName()+","+this.data[i].getAge()+","+this.data[i].getWeight()+"\n");
        }
    }
    public void merge(OwlPopulation other){
        //TODO: a brief overview of what you can do to implement this method is given below:

        //1) determine (and store) the distinct owls in the other population.
        Owl[] newPop = new Owl[this.popSize() + other.popSize()];
        //boolean check = true;
        int owlNum = 0;
        for (int i = 0; i < this.popSize(); i++) {
            newPop[owlNum] = this.data[i];
            owlNum++;
        }


        for (int i = 0; i < other.popSize(); i++) { //duplicate check
            if (!containsOwl(other.data[i])) {
              //System.out.println("owl" + other.data[i].getName());
              newPop[owlNum] = other.data[i];
              owlNum++;
            }
        }

        //2) make a new data array to hold the correct number of owls for the merged population
        Owl[] merged = new Owl[owlNum]; //gets rid of any empty spots from new pop (because of the duplicate checker)
        System.out.println("Merged population stats: ");

        //3) copy over the distinct owls from each population to the data array
        for (int i = 0; i < merged.length; i++) {
            merged[i] = newPop[i];
        }

        //4) set the new data array to "this" data (where is the merged population? what happens to the original populations?)

        this.data = merged; //sets the data array to the new merged version
    }

    // HONORS MILESTONE
    // This method is only required if you are in the honors section, but everyone is welcome to try it
    public void merge(OwlPopulation other, String fileName) throws IOException {
        //TODO: a brief overview of what you can do to implement this method is given below:

        //1) Merge population with OwlPopulation other

        //2) Write to the CSV file with fw.append();

        //3) NOTE: Leave fw.flush() and fw.close() at the end of your code

        File f = new File(fileName);
        f.createNewFile();
        FileWriter fw = new FileWriter(f);

        /*
            Code for appending goes here
         */

        fw.flush();
        fw.close();
    }

    public int popSize(){
        return data.length;
    }

    public static void main(String[] args) {
        try {

            //The following should run when you are complete. Feel free to comment out as you see fit while you work.
            OwlPopulation pop1 = new OwlPopulation("owlPopulation1.csv");
            System.out.println(pop1);
            System.out.println(pop1.popSize());
            //System.out.println(pop1.averageAge());

            OwlPopulation pop2 = new OwlPopulation("owlPopulation2.csv");
            System.out.println(pop2);
            System.out.println(pop2.popSize());
            //System.out.println(pop2.averageAge());

            pop1.merge(pop2);
            //bobpop.merge(susanpop);
            System.out.println(pop1);
            System.out.println(pop1.popSize());

            pop1.printmerge(); //test not apart of lab but cool to see


            // Test code for Honors Milestone
            // Be sure to uncomment the catch (IOException) block 
            /*
            pop1 = new OwlPopulation("owlPopulation1.csv");
            pop1.merge(pop2);
            OwlPopulation pop3 = new OwlPopulation("owlPopulation3.csv");
            System.out.println(pop3);
             */

        }
        catch (FileNotFoundException f){
            System.out.println("File not found.");
        }
        /*
        Only uncomment this catch block if you have implemented the honors milestone merge function
        catch (IOException e) {
            System.out.print("File IO exception");
        }
         */
    }


}
