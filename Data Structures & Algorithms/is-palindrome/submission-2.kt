class Solution {
    fun isPalindrome(s: String): Boolean {
        var l : Int= 0
        var r : Int= s.length-1
        println("left $l right $r")
        while(l<r){
            while (l<r && !isValid(s[l])) {
                l++
                println("Moved left to $l")
            }
            while (l<r && !isValid(s[r])) {
                r--
                println("Moved right to $r")
            }
            println("compare ${s[l]} to ${s[r]}")
            if(s[l].lowercase()!=s[r].lowercase()) return false
            l++
            r--
        }
        return true
    }

    fun isValid(c: Char) : Boolean {
        return (c>='a'&&c<='z') || (c>='A'&&c<='Z') || (c>='0'&&c<='9')
    }
}
