class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        int[] dummy = {0,0};
        for (int i = 0; i < nums.length; i++){
            int difference = target - nums[i];
            if (indexMap.containsKey(difference)){
                int[] indices = {indexMap.get(difference), i};
                return indices;
            } else{
                indexMap.put(nums[i], i);
            }
        }
        return dummy;
    }
}
