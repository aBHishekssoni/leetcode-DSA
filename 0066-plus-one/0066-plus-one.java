class Solution {
    public int[] plusOne(int[] digits) {
//         int[] arr= new int[digits.length+1];
//         for(int i=0;i<digits.length;i++){
//             arr[i]=digits[i];
//         }
//                 for(int i=0;i<digits.length;i++){
                    
//         if(digits[digits.length-1-i]>8){
//           arr[digits.length-1-i]=1;
//           arr[digits.length-i]=0;
//         }else{
//           digits[digits.length-1]+=1;
//             return digits;
            
//         }
//                 }
//     return arr;
    for (int i = digits.length - 1; i >= 0; i--) {
	if (digits[i] < 9) {
		digits[i]++;
		return digits;
	}
	digits[i] = 0;
}

digits = new int[digits.length + 1];
digits[0] = 1;
return digits; 
    }
}