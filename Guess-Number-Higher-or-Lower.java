1/** 
2 * Forward declaration of guess API.
3 * @param  num   your guess
4 * @return 	     -1 if num is higher than the picked number
5 *			      1 if num is lower than the picked number
6 *               otherwise return 0
7 * int guess(int num);
8 */
9
10public class Solution extends GuessGame {
11    public int guessNumber(int nn) {
12        int l = 1,r = Integer.MAX_VALUE,c=0;
13
14        while(true){
15            int mid = l + (r - l)/2;
16            int n = guess(mid);
17            c++;
18            if(n==0) return mid;
19            else if(n == 1) l = mid+1;
20            else r = mid-1;
21        }
22    }
23}