class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        println("Input array is [-1,0,1,2,-1,-4]")
        val m = HashMap<Int, Int>()
        val res = HashSet<List<Int>>()
        nums.sort()
        if(nums.size >= 3){
            for(i in 1..nums.size-2) {
                println("Check in hash map and put -1 or (${nums[i-1]} in map ")
                if(!m.containsKey(nums[i-1])) m.put(nums[i-1], i-1)
                for(j in i+1..nums.size-1) {
                    val tar = 0 - (nums[i] + nums[j])
                    println("Look for target $tar in map")
                    if(m.containsKey(tar)) {
                        val v = m.getValue(tar)
                        println("Target found, add value in res ${nums[v]} ${nums[i]} ${nums[j]}j")
                        res.add(listOf(nums[v], nums[i], nums[j]))
                    }
                }
            }
        }
        return res.toList()
    }
}
