public class MinMax {

    public static class Pair {
        int min;
        int max;
    }

    static void getMinMax(int arr[], int len, Pair result) {
        result.min = arr[0];
        result.max = arr[0];

        for (int i = 1; i < len; i++) {
            if (arr[i] > result.max) {
                result.max = arr[i];
            } else if (arr[i] < result.min) {
                result.min = arr[i];
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {10, 12, 8, 7, 3, 5, 11, 45};
        int len = arr.length;
        Pair allah = new Pair();
        getMinMax(arr, len, allah);
        System.out.println("Maximum=" + allah.max);
        System.out.println("Minimum=" + allah.min);
    }
}
