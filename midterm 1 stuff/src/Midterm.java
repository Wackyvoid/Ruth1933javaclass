public class Midterm {
    public int sumDivisible(int num) {
        if (num == 0) {
            return 0;
        } else if (num % 2 == 0) {
            return num + sumDivisible(num - 1);
        } else {
            return sumDivisible(num - 1);
        }
    }

    public static void main(String[] args) {
        int b = 9;
        System.out.println(sumDivisible(b));
    }
}