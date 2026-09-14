class Solution:
    def maxArea(self, heights: List[int]) -> int:
        front = 0
        back = len(heights) - 1

        maxArea = min(heights[front],heights[back]) * back - front
        while (front != back):
            if (heights[front] <= heights[back]):
                front += 1
                maxArea = max(maxArea, (min(heights[front],heights[back]) * (back - front)))
            if (heights[front] > heights[back]):
                back -= 1
                maxArea = max(maxArea, (min(heights[front],heights[back]) * (back - front)))
            
        return maxArea