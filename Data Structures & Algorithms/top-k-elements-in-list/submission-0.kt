class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val m = HashMap<Int, Int>()
        for(i in nums){
            if(m.containsKey(i)){
                // If map has the key, increment the value 
                val v = m.getValue(i)
                m.put(i, v+1)
            }else {
                // Add the key with value as 1
                m.put(i, 1)
            }
        }
        // Map is not shorted so we do not know which is of most frequency. 
        // Sort the map based on its values. 
        val sm = m.entries.sortedByDescending { it.value }.associate {it.toPair()}
        val res = ArrayList<Int>()
        val nm = sm.entries.take(k)
        for((k,v) in nm){
            res.add(k)
        }
        return res.toIntArray()
    }
}
