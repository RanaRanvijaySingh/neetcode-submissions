class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length!=t.length) return false
        val sa = s.toList().sorted()
        val ta = t.toList().sorted()
        for(i in 0..sa.size-1){
            if(sa[i] != ta[i]) return false
        }
        return true
    }
}
