class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        // HashSet<Integer> hs = new HashSet<Integer>();
        int a=duration;
        for(int i=1;i<timeSeries.length;i++){
            // for(int j=timeSeries[i];j<timeSeries[i]+duration;j++){
            //     hs.add(j);
            // }
            if(timeSeries[i]-timeSeries[i-1]>=duration)
            a= a+duration;
            else
            a+= timeSeries[i]-timeSeries[i-1];
        }
        // return hs.size();
        return a;
    }
}