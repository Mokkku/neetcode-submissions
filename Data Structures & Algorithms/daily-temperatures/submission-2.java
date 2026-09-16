class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        for (int i = temperatures.length - 1; i >= 0; i--){
    
            int daysCount = 0;
            int currentDay = i;
            int currentTemperature = temperatures[i];

            if (!stack.empty()){
                while (!stack.empty() && currentTemperature >= temperatures[stack.peek()]){
                    stack.pop();
                }
                if (!stack.empty()){
                    daysCount = stack.peek() - currentDay;
                } else {
                    daysCount = 0;
                }
                stack.push(currentDay);
            } else{
                stack.push(currentDay);
            }

            result[i] = daysCount;
        
        } 
    return result;
    }
}
