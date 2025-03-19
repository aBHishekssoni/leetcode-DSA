/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int lo = 1;
        int ans = 0;
        while(lo<=n){
            int mid = lo + (n - lo)/2;
            if(isBadVersion(mid)==true){
                ans = mid ;
                n = mid - 1;
            }
            else{
                lo = mid + 1;
            }
        }
        return ans;
    }
}