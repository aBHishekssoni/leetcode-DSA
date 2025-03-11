class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k%n;
        Reverse(nums, 0 ,n-k-1);
        Reverse(nums, n-k ,n-1);
        Reverse(nums, 0 ,n-1);
        // for(int j=0;j<k;j++){
        //     int last = nums[n-1];
        //     for(int i=n-2;i>=0;i--){
        //         nums[i+1] = nums[i];
        //     }
        //     nums[0] = last;
        // }
  }
    public static void Reverse(int[] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
