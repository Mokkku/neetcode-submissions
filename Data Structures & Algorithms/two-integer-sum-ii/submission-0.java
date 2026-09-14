class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int front = 0;
        int back = numbers.length - 1;

        int sum = numbers[front] + numbers[back];
        while (sum != target) {
            if (sum > target){
                back -= 1;
            } else{
                front += 1;
            }
            sum = numbers[front] + numbers[back];
        }
        int[] indices = {front + 1, back + 1};
        return indices;
    }
}
