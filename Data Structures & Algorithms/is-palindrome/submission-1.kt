class Solution {
    fun isPalindrome(s: String): Boolean {
        println("If string lenght is one return true")
        if(s.length<=1) return true
        
        println("Convert all to lower case")
        val sl = s.lowercase()
        println("Remove all special characters, keep only a-z A-Z 0-9")
        val sb = StringBuilder()
        for (ch in sl) {
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9'))
                sb.append(ch)
        }
        val str = sb.toString()
        val l = sb.length
        if(l<=1) return true
        val m = l / 2
        print("Find mid element $m")
        
        print("Loop from start to mid")
        for( i in 0.. m){
            println("return false if not equal ${str[i]} and ${str[l-i-1]}")
            if(str[i]!=str[l-i-1]) return false
        }
        println("return true at the end of function")
        return true
    }
}
