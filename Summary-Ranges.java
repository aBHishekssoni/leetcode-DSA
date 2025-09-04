class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList<>();
        }

        List<String> ranges = new ArrayList<>();
        int start = nums[0], end = nums[0];

        for (int i = 0; i < nums.length; i++) {
            end = nums[i];

            if (i == nums.length - 1 || nums[i + 1] != nums[i] + 1) {
                ranges.add(generateRange(start, end));

                if (i != nums.length - 1) {
                    start = nums[i + 1];
                }
            }
        }
        
        return ranges;
    }

    private String generateRange(int start, int end) {
        return start != end
            ? new StringBuilder().append(start).append("->").append(end).toString() 
            : new StringBuilder().append(end).toString();
    }
}