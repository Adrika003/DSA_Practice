public class reverse_an_array {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 9, 1 };
        int i, n = arr.length;
        int[] rev_arr = new int[arr.length];

        for (i = 0; i < arr.length; i++) {
            rev_arr[n - 1 - i] = arr[i];
        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(rev_arr[i] + " ");
        }
    }
}
