public class _2_secondLargest {
    public static void main(String[] args) {
        int[] arr = { 7, 3, 9, 2, 9, 5 };
        int i;

        int largest = Integer.MIN_VALUE;
        int sec_largest = Integer.MIN_VALUE;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                sec_largest = largest;
                largest = arr[i];
            } else if (arr[i] != largest && arr[i] > sec_largest) {
                sec_largest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(sec_largest);
    }
}
