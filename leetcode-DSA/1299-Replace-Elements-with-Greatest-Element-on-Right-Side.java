class Solution {
    public int[] replaceElements(int[] arr) {
        int g=-1,p=-1;
          for (int i=arr.length-1;i>=0 ;i-- ) {
        if(i==arr.length-1){
            p=  arr[i];
      arr[i]=-1;
        }
        else{
        if (p>g) {
          g=p;
          p= arr[i];
          arr[i]= g;    
        }else{
                 p=   arr[i];
          arr[i]=g;
        }
      }}
      return arr;
    }
}