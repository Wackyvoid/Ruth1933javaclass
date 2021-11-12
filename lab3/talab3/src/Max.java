public class Max {
    static int max = 0;

    public static int recursiveMaxDigit(int num) {
        if (num%10 == num) {
            return max;
        } else if (num%10 > max) {
            max = num % 10;
            return recursiveMaxDigit(num / 10);
        } else {
            return recursiveMaxDigit(num/10);
        }
    }

     public static int iterativeMaxDigit(int num) {
        int max = 0;
        int temp = num;
        while(temp>0){
            if(temp%10>max){
                max=temp%10;
            }
            temp = temp / 10;
        }
        return max;
     }

    public static void main(String[] args) {
        //scanner prompt lol
        System.out.println(recursiveMaxDigit(6253742));
        System.out.println(iterativeMaxDigit(6253742));

    }
}
