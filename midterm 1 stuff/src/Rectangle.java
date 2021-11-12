public class Rectangle {
    int area;
    int perimeter;
    boolean match;

    public Rectangle(int area, int perimeter) {
        this.perimeter = perimeter;
        this.area = area;
    }

    public int addArea(Rectangle other) {
        area = this.area + other.area;
        return area;
    }

    public String toString() {
        String s = "Area: " + area + "\nPerimeter: " + perimeter;
        return s;
    }

    public boolean andequals(Rectangle other) {
        match = false;
        if (this.area == other.area) {
            if (this.perimeter == other.perimeter) {
                match = true;
            }
        }
        return match;
    }

    public static void main(String[] args) {
        Rectangle wow = new Rectangle(24, 46);
        Rectangle oop = new Rectangle(24, 46);
        Rectangle hehe = new Rectangle(10, 26);
        System.out.println(wow);
        System.out.println(wow.andequals(hehe));

    }
}
