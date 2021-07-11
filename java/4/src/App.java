// QUESTION:
//4. Write a Java program to print the result of the following operations. Go to the editor
        // Test Data:
        // a. -5 + 8 * 6
        // b. (55+9) % 9
        // c. 20 + -3*5 / 8
        // d. 5 + 15 / 3 * 2 - 8 % 3

public class App {
    static void printExpression(int expression) {
        System.out.println(expression);
      }
    public static void main(String[] args) throws Exception {
    int[] arr = new int[] {-5 + 8 * 6, (55+9) % 9, 20 + -3*5 / 8, 5 + 15 / 3 * 2 - 8 % 3};
    for (int i = 0; i < arr.length; i++) 
        System.out.println(arr[i]);

        //or 

        printExpression(-5 + 8 * 6);
        printExpression((55+9) % 9);
        printExpression(20 + -3*5 / 8);
        printExpression(5 + 15 / 3 * 2 - 8 % 3);
    }
}

// NOTES: 
// 1.) We can't define methods inside other methods, unlike in languages like JS