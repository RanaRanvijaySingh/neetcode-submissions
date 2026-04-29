class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var ns = ""
        var si = 0
        var max = 0
        var i=0
        while(i<s.length){
            val ch = s[i].toString()
            if(!ns.contains(ch)) {
                ns+=ch
                max = maxOf(max, ns.length)
            } else {
                ns = ""
                si++
                i = si-1
            }
            i++
        }
        return max
    }
}
