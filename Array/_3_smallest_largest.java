public class _3_smallest_largest {
    public static void main(String[] args) {
        int[] arr = { 8, 3, 12, 5, 1, 9 };
        int i;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for(i=0; i<arr.length; i++){
            if (arr[i]<smallest) {
                smallest=arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}
