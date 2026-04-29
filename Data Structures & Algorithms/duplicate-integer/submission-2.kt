class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var s = HashSet<Int>()
        for(i in nums){
            if(s.contains(i)) return true else s.add(i)            
        }
        return false
    }
}
