class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        // Create empty array for a-z
        val a = IntArray(26){0}
        // Set array for target value
        for(ch in s1) {
            a[(ch-'a')] = a[(ch-'a')] + 1
        }
        display(a)
        val win = s1.length
        for (i in 0..s2.length-win) {
            // Pick char at i check if it is present in target
            val c = s2[i]
            if(s1.contains(c)){
                // If present in target, then check if the substring is a match
                val end = if(i+win >= s2.length)s2.length else i+win
                val sub = s2.substring(i, end)
                println("Substring is $sub")
                // If is a match then return true
                var arr = a.copyOf()
                if(isMatch(sub, arr)) {
                    return true
                }
            }
        }
        return false
    }

    fun isMatch(sub: String, a: IntArray): Boolean {
        for(ch in sub) {
            val pos = ch - 'a'
            a[pos] = a[pos] - 1
        }
        display(a)
        for(i in a) {
            if(i>0 || i<0) {
                return false
            }
        }
        return true
    }

    fun display(a: IntArray) {
        for(i in a) print("$i ")
        println()
    }
}
