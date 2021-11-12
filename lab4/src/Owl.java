public class Owl {
    private String name;
    private int age;
    private double weight;

    public Owl(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean equals(Owl other) {
        if ((this.name.equals(other.name)) && this.age == other.age && this.weight == other.weight) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Owl owl1 = new Owl("Steve", 40, 10.5);
        Owl owl2 = new Owl("Stacy", 25, 10.5);
        Owl owl3 = new Owl("Bob", 30, 9.0);
        System.out.println(owl1.equals(owl2));
        System.out.println(owl1.equals(owl1));
        System.out.println(owl2.equals(owl3));
    }
}
