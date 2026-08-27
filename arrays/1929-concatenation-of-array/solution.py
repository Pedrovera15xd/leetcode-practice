class Solution(object):
    def getConcatenation(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """

        if nums is None:
            return None

        ans = [0] * len(nums) * 2

        for i in range(len(nums)):
            ans[i] = nums[i]
            
            ans[len(nums) + i] = nums[i]

        return ans

