class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        hashmap = set()
        maxSequence = 0
        for num in nums:
            hashmap.add(num)
        if not hashmap:
            return maxSequence

        while (hashmap):
            currentSequence = 0
            currentKey = list(hashmap)[0]
            # Get the start of a sequence
            while (currentKey-1) in hashmap:
                currentKey -= 1 
            # Begin checking size of current sequence
            while (currentKey + 1 in hashmap):
                currentSequence += 1
                hashmap.remove(currentKey)
                currentKey += 1
            hashmap.remove(currentKey)
            if (currentSequence > maxSequence):
                maxSequence = currentSequence
        return maxSequence + 1
        