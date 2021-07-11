public class App {
    static void evaluateNumbers(int num1, int num2) {
        String[] arr = new String[] {"+", "-", "*", "/", "mod"};
        for (int i=0; i < arr.length; i++) {
            System.out.print(String.format("%s %s %s = ", num1, arr[i], num2));
            // System.out.println(num1 if (arr[i] == "+"));
            System.out.println(extracted(num1, num2, arr, i));            
        }
        // System.out.println(num1 + resolveOperand(arr[i]) + num2);
    }

    private static int extracted(int num1, int num2, String[] arr, int i) {
        return evaluateNumbers(num1, num2, arr[i]);
    }

    // static 
    public static void main(String[] args) throws Exception {
        evaluateNumbers(125, 24);
    }

    static int evaluateNumbers(int num1, int num2, String operand) {
        if (operand == "+")
            return (num1 + num2);
        else if (operand == "-") 
            return (num1 - num2);
        else if (operand == "*")
            return (num1 * num2);
        else if (operand == "/")
            return (num1 / num2);
        else 
            return (num1 % num2);
    }
}
