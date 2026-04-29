class Solution {
    fun minWindow(s: String, t: String): String {
        var win = t.length
        var res = ""
        val pos = getPositions(s, t)
        var found = false
        while(win <= s.length){
            println("Check for window of size $win")
            for(i in pos) {
                val j = if(i+win <= s.length-1) i+win else s.length
                val sub = s.substring(i,j)
                if(sub.length >= win){
                    println("Check substring $sub at position $i")
                    val found = isSubstringFound(sub, t)
                    if(found) return sub
                }
            }
            win++
        }
        return res
    }

    fun isSubstringFound(sub: String, t: String): Boolean{
        val map = hashMapOf<Char, Int>()
        for(i in t){
            if(map.containsKey(i)){
                val v = map.getValue(i)
                map.put(i, v+1)
            }else {
                map.put(i,1)
            }
        }
        for(i in sub){
            if(map.containsKey(i)){
                val v = map.getValue(i)
                map.put(i, v-1)
            }
        }
        for((k,v) in map){
            if(v>0) return false
        }
        return true
    }

    fun getPositions(s: String, t: String): List<Int> {
        val pos = arrayListOf<Int>()
        for(i in 0..s.length-t.length){
            if(t.contains(s[i])) pos.add(i)
        }
        println("Find all positions of i $pos")
        return pos
    }
}
