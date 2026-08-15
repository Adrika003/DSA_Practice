public class _1_array_largestValue {
    public static void main(String[] args) {
        int[] arr = { 7, 3, 9, 2, 9, 5 };

        int i;
        int largest = arr[0];
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            } 
        }
        System.out.println(largest);
    }
}