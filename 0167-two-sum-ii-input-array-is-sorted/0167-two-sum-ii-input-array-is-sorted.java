class Solution {
    public int[] twoSum(int[] numbers, int target) {
         HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }
        for (int i = 0; i < numbers.length; i++) {
            int x = target - numbers[i];
               if (map.containsKey(x) && map.get(x) != i) {
               return new int[]{i+1, map.get(x)+1};
            }
        } 
        return null;
    }
}