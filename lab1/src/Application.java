public class Application {
    public static int bob(String defualt){
        return defualt.length();
    }
    public static void main (String[ ] args){
        String x = "Apple";
        //int numberoflettersinx = bob(x);

        System.out.println (x);
        System.out.println(bob(x));
//
//        System.out.println ("CSCI 1933");
//        System.out.println("c");
//        System.out.println ("---------");
//        System.out.println ("CSCI 2011");
//        System.out.println ("---------");
//        System.out.println ("CSCI 2033");
    }
}
