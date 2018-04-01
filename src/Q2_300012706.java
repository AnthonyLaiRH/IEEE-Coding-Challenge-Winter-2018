import java.util.Arrays;

public class Q2_300012706 {
    public class MissingInt {
        public int missingInt(int[] A, int[] B){
            //Implement this
            String str;
            int [] arr;

            if (A.length < B.length) {
                str = Arrays.toString(A);
                arr = B;
            }else{
                str = Arrays.toString(B);
                arr = A;
            }
            Integer missingNum = null;

            for (int i = 0; i < arr.length; i++){
                if (str.indexOf(arr[i])==-1){
                    missingNum = arr[i];
                }
            }
            return missingNum;
        }
    }
}
