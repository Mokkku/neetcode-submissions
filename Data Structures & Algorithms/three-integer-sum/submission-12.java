class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int front;
        int back;
        List<Integer> solution = new ArrayList<>();
        List<List<Integer>> output = new ArrayList<>();

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length - 1; i++){
            if (i == 0 || i > 0 && nums[i] != nums[i-1]){
                front = i + 1;
                back = nums.length - 1;
                while (front < back && front != back){
                    int sum = nums[i] + nums[front] + nums[back];
                    if (sum < 0 || front != i + 1 && nums[front] == nums[front - 1]){
                        front++;
                    } else if (sum > 0 || back != nums.length - 1 && nums[back] == nums[back + 1]){
                        back--;
                    }else{
                        solution.clear();
                        solution.add(nums[i]);
                        solution.add(nums[front]);
                        solution.add(nums[back]);

                        output.add(new ArrayList<>(solution));
                        front++;
                    }
                }
            }
        }
        return output;
    }
}
