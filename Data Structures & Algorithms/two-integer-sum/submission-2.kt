class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val m = HashMap<Int, Int>()
        val r = ArrayList<Int>()
        for(i in 0..nums.size-1) {
            val s = target-nums[i]
            if(m.containsKey(s)) {
                r.add(m.getValue(s))
                r.add(i)
                return r.toIntArray()
            } else {
                m.put(nums[i],i)
            }
        }
        return r.toIntArray()
    }
}
