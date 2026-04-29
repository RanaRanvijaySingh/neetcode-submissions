class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val m = HashMap<String, MutableList<String>>()

        for(s in strs) {
            val key = IntArray(26)
            val value = ArrayList<String>()
            for(ch in s.toCharArray()) {
                val index = ch - 'a'
                key[index] = key[index] + 1
            }
            if(!m.containsKey(key.contentToString())) {
                value.add(s)
                m.put(key.contentToString(), value)
            } else {
                val l = m.getValue(key.contentToString())
                l.add(s)
                m.put(key.contentToString(), l)
            }
        }
        val res = ArrayList<List<String>>()
        for((k,v) in m){
            res.add(v)
        }
        return res
    }
}
