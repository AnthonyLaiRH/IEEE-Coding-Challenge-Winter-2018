public class test {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(2048));
        int[] a = {1,2,3};
        System.out.print(a.toString());
    }
    public static boolean isPowerOfTwo(int n) {
        //Implement this
        if ((Math.log(n) / Math.log(2)) % 1 == 0) {
            return true;
        }

        return false;
    }
}
