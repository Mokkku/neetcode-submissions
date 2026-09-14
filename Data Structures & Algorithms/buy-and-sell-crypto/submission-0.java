class Solution {
    public int maxProfit(int[] prices) {

        int maxGain = 0;
        int sum = 0;

        int front = 0;
        int back = 0;

        for (int i = 0; i < prices.length; i++) {
            sum = prices[front] - prices[back];
            if (sum > maxGain){
                maxGain = sum;
            }

            if (prices[front] < prices[back]){
                back = front;
            }

            front++;

        }

        return maxGain;
            
        
    }
}
