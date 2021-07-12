public class App {
    static int calculateMax(int a, int b) {
        return a > b ? a : b;
    }

    static int calculateGeneralMax(int len, int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = calculateMax(max, arr[i]);
        }
        return max;
    }

    public static void main(String[] args) throws Exception {
        int len = 5;
        int arr[] = new int[] {3, -9, -8, 7, 5};
        System.out.println(calculateGeneralMax(len, arr));
    }
}
