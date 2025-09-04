class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
           boolean[] seen=new boolean[1001];
        for(int num : nums1){
            seen[num]=true;
        }
       int[] result= new int[nums1.length];
       int index=0;
       for(int num : nums2){
        if(seen[num]==true){
            seen[num]=false;
            result[index++]=num;
        }
       }
        return Arrays.copyOfRange(result,0,index);
    }
}
