/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int nn) {
        int l = 1,r = Integer.MAX_VALUE,c=0;

        while(true){
            int mid = l + (r - l)/2;
            int n = guess(mid);
            c++;
            if(n==0) return mid;
            else if(n == 1) l = mid+1;
            else r = mid-1;
        }
    }
}