public class Main {
    public static void main(String[] args) {
        //initial variables
        int[] A = {-1,0,1,3,5};
        int n= 2;

        //loop through to find index
        //if not found,find where it should go
        int low = 0;
        int high = A.length - 1;

        while (low <= high) {
            int midpoint = (low + high) / 2;

            if (A[midpoint] == n) {
                System.out.print(midpoint);
                return;
            } else if (A[midpoint] < n) {
                low = midpoint + 1;
            } else {
                high = midpoint - 1;
            }
        }
        System.out.print(low);
    }
}