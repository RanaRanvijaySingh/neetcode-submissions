class Solution {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        // [1,8,1,0,4,2,6]    k=3
        val res = mutableListOf<Int>()
        var max = nums[0]
        for(i in 0..nums.size-k){
            var j = i+k-1
            println("Set j=$j")
            println("Find & check if max=$max is not from i-1=${i-1} position")
            if(i==0){
                max = findMax(nums, i, j)
            } else if(max==nums[i-1]){
                max = findMax(nums, i, j)
                println("Find new max=$max again from whole array")
            } else {
                println("Check if the last position element ${nums[j]} which is new add to array is greater than max=$max")
                max = if(max < nums[j]) nums[j] else max
            }
            println("Adding to array $max")
            res.add(max)
            
            
            
        }
        return res.toIntArray()
    }

    fun findMax(nums: IntArray, i: Int, j:Int): Int {
        var max = nums[i]
        for(k in i..j){
            max = if(max<nums[k]) nums[k] else max
        }
        return max
    }
}
