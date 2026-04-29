class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val m = HashMap<Int, Int>()
        var count = k
        for(i in nums) {
            m[i] = m.getOrDefault(i,0) + 1
        }
        var buk = mutableListOf<Pair<Int, Int>>()
        for((k,v) in m) {
            buk.add(Pair(v, k))
        }
        buk.sortByDescending { it.first }
        
        var res = IntArray(k)
        for(i in 0 until k){
            res[i] = buk[i].second
        }
        return res
    }
}
