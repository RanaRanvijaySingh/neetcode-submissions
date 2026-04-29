class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        var res = HashSet<List<Int>>()
        nums.sort()
        var sum = 0
        for(i in 0..nums.size-3){
            for (j in i+1..nums.size-2) {
                for(k in j+1..nums.size-1){
                    if((nums[i]+nums[j]+nums[k]) == 0) {
                        res.add(arrayListOf(nums[i], nums[j], nums[k]))
                    }
                }
            }
        }
        return res.map{ it.toList() }
    }
}
