/**
 * sda
 */
public class reverseSeq {

    public static void reverseSeq(int n) {
        int[] result = new int[n];
        for (int i = n ; i >= 1; i--) {
            result[n - i] = i;
            System.out.print(result[n - i]);
        }
    }

    public static void main(String[] args) {
        reverseSeq(5);
    }

}