package Easy;

public class ClimbStairs {
    public int climbStairs(int n) {
        int[] seen = new int[n];

        return search(n, seen);
    }

    public int search(int n, int[] seen){
        if( n == 1 || n==0){
            return 1;
        }
        if( n <= -1){
            return 0;
        }
        
        if(seen[n-1] != 0){
            return seen[n-1];
        }

        seen[n-1] = search(n-1, seen) + search(n-2, seen);
        return seen[n-1];
    }
}
