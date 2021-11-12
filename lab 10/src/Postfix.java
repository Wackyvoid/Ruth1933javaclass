public class Postfix {

    public static double evaluate(String[] expression) {
        double value;
        Stack newStack = new Stack(expression.length);
        for (String i:expression) {
            if (!i.equals("+") && !i.equals("-") && !i.equals("/") && !i.equals("*")) {
                newStack.push(i);
            } else {
                double num1 = (double)newStack.pop();
                double num2 = (double)newStack.pop();
                switch (i) {
                    case "+":
                        value = num1 + num2;
                        break;
                    case "-":
                        value = num1 - num2;
                        break;
                    case "*":
                        value = num1 * num2;
                        break;
                    default:
                        value = num1 / num2;
                        break;
                }
                newStack.push(value);
            }
        }
        return (double)newStack.pop();
    }

    public static void main(String[] args) {
        String[] newString = {"1", "+", "8", "+", "9", "*", "4"};
        evaluate(newString);
    }
}
