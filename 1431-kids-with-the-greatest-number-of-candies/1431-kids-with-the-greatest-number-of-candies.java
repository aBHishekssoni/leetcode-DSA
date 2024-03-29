class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
          int g=0;
        
        ArrayList<Boolean> car = new ArrayList<Boolean>();
        for(int i=0;i<candies.length;i++){
            if(g<=candies[i]){
                g=candies[i];
            }
        }
          for(int i=0;i<candies.length;i++){
              if(g<=candies[i]+extraCandies){
                  car.add(true);
                  
              }
              else{
                  car.add(false);
              }
          }
    return car ;
    }
}