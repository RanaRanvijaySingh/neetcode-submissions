class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val res = IntArray(nums.size)
        for(i in 0..nums.size-1) {
            var p = 1
            for(j in 0..nums.size-1){
                if(i!=j) p=p*nums[j]
            }
            res[i] = p
        }
        return res
    }
}
