// Subclass this class and name the new class Q1_<your student number
public class Q1_300012706 {

    public class IsPowerOfTwo {
        public boolean isPowerOfTwo(int n) {
            //Implement this
            if ((Math.log(n) / Math.log(2)) % 1 == 0) {
                return true;
            }

            return false;
        }
    }
}