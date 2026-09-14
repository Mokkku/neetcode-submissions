class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        intCount = {}
        KFrequent = []
        for num in nums:
            intCount[num] = 0
        for num in nums:
            intCount[num] = intCount[num] + 1

        for iteration in range(k):
            most_frequent = max(intCount.values())
            for key in intCount.keys():
                if intCount[key] == most_frequent:
                    KFrequent.append(key)
                    intCount.pop(key)
                    break
        return KFrequent
