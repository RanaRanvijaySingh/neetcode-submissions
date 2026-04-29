class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        for(i in 0..nums.size-2) {
            for (j in i+1..nums.size-1){
                if(nums[i]==nums[j]) return true
            }
        }
        return false
    }
}
