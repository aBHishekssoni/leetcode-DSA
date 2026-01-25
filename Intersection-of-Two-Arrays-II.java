1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3
4        HashMap<Integer, Integer> map = new HashMap<>();
5
6        // Count frequency of nums1
7        for (int num : nums1) {
8            map.put(num, map.getOrDefault(num, 0) + 1);
9        }
10
11        ArrayList<Integer> result = new ArrayList<>();
12
13        // Check nums2 against map
14        for (int num : nums2) {
15            if (map.containsKey(num) && map.get(num) > 0) {
16                result.add(num);
17                map.put(num, map.get(num) - 1);
18            }
19        }
20
21        // Convert ArrayList to array
22        int[] res = new int[result.size()];
23        for (int i = 0; i < result.size(); i++) {
24            res[i] = result.get(i);
25        }
26
27        return res;
28    }
29}
30