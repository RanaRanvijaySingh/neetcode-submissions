class Solution {

    fun encode(strs: List<String>): String? {
        if(strs.size <= 0) return null
        var sb = StringBuilder()
        for(i in strs) {
            for(j in i) {
                sb.append(j-1)
            }
            sb.append("-_-")
        }
        return sb.substring(0,sb.length - 3)
    }

    fun decode(str: String?): List<String> {
        if(str == null) return ArrayList<String>()
        val a = str.split("-_-")
        val l = ArrayList<String>()
        for(i in a){
            var s=StringBuilder()
            for(j in i){
                s.append(j+1)
            }
            l.add(s.toString())
        }
        return l
    }
}
