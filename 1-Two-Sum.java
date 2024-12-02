class Solution {
    public int[] twoSum(int[] arr, int target) {
        // int[] arr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        for (int i = 0; i < arr.length; i++) {
            int x = target - arr[i];
                // arr[0] = i;
                // arr[1] = x;
            if (map.containsKey(x) && map.get(x) != i) {
                // return arr;
                  return new int[]{i, map.get(x)};
            }
        } 
        return null;
    }
}