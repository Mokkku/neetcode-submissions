class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        hash_table = {}
        for num in nums:
            hash_table[num] = 0
        for num in nums:
            if hash_table[num] == 1:
                return True
            else:
                hash_table[num] = 1
        return False
        