public class Tester {
    public static void main(String[] args) {
        MyTicket t1 = new MyTicket("blue");
        MyTicket t2 = new MyTicket("blue");
        MyTicket t3 = new MyTicket("white");
        MyTicket t4 = new MyTicket("green");
        MyTicket t5 = new MyTicket("white");

        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
        System.out.println(t4.toString());
        System.out.println(t5.toString());
    }
}
