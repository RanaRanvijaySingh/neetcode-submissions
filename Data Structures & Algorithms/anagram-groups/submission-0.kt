class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val res = ArrayList<List<String>>()
        for(i in 0..strs.size-1){
            val sub = ArrayList<String>()
            if(!isTaken(strs[i], res)){
                sub.add(strs[i])
                for(j in i+1..strs.size-1){
                    if(isAnagram(strs[i],strs[j]) && !isTaken(strs[j], res)) {
                        sub.add(strs[j])
                    }
                }
                res.add(sub)
            }
        }
        return res
    }

    fun isAnagram(s: String, t: String) : Boolean {
        if(s.length != t.length) return false
        val ss = s.toList().sorted()
        val ts = t.toList().sorted()
        for(i in 0..ss.size-1) { 
            if(ss[i]!=ts[i]) return false
        }
        return true
    }

    fun isTaken(s: String, l: List<List<String>>): Boolean{
        if(l.size<=0) return false
        for (i in l){
            for (j in i) {
                if(s.equals(j)) return true
            }
        }
        return false
    }
}
