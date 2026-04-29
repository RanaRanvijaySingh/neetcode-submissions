class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val s = nums.toSet()
        return s.size<nums.size
    }
}
