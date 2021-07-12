public class App {
    static int calculateHCF(int a, int b) {
        if (a == 0) return b;
        return calculateHCF(b % a, a);
    }

    static int calculateGeneralHCF(int len, int[] arr) {
        int hcf = arr[0];
        for (int i = 1; i < arr.length; i++) {
            hcf = calculateHCF(hcf, arr[i]);
        }
        return hcf;
    }

    public static void main(String[] args) throws Exception {
        int len = calculateHCF(25, 15);
        int[] arr = new int[] {14, 21, 28, 42, 63};
        System.out.println(calculateGeneralHCF(len, arr));
    }
}
