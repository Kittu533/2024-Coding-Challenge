public class grow {
    static void grow(int[] x) {
        int[] result = new int[x.length + 1];
        for(int i = 1; i < result.length; i++){
            result[i] = i;
            System.out.print(result[i]);
        }
    }
    public static void main(String[] args) {
        grow(new int[5]);
    }
}
