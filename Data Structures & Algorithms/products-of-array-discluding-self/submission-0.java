class Solution {
    public int[] productExceptSelf(int[] nums) {
        int totalProduct = 1;
        int[] output = new int[nums.length];
        int zeroCount = 0;
        int indexOfZero = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                zeroCount ++;
                indexOfZero = i;
            }
        }
        if (zeroCount == 0){
            for (int i = 0; i < nums.length; i++){
                totalProduct *= nums[i];
            }

            for (int i = 0; i < output.length; i++){
                if (nums[i] == 0){
                    output[i] = totalProduct;
                }else {
                    output[i] = totalProduct / nums[i];
            }
        }
        } else if (zeroCount == 1){
            for (int i = 0; i < nums.length; i++){
                if (nums[i] != 0){
                    totalProduct *= nums[i];
                }
            }

            for (int i = 0; i < output.length; i++){
                if (nums[i] == 0){
                    output[i] = totalProduct;
                }else {
                    output[i] = 0;
            }
        }
        } else {
            totalProduct = 0;
            for (int i = 0; i < output.length; i++){
                output[i] = 0;
            }
        }
        return output;
    }
}  
