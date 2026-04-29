class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if(nums.size <=0) return 0
        val s = nums.toSet()
        if(s.size == 1) return 1
        // [2,20,4,10,3,4,5]
        var long = 0
        var count = 0
        var initVal = false
        var i = 0
        
        while(i<s.size) {
            var item = s.elementAt(i)
            if(!initVal) {
                if(!s.contains(item - 1)) { // -1
                    println("Find the initial value, ${item} set the count to 1")
                    count = 1
                    initVal = true // t
                } else {
                    i++ 
                }
            } else {
                if(s.contains(item + count)){ // 3, 4 5 6
                    println("Next value found ${item+count}, increment count ${count+1}")
                    count++ // 2 3 4
                } else {
                    if(long < count) long = count // 4
                    println("NO next value ${item + count}. Save longest $long")
                    i++
                    count = 0
                    initVal = false
                }
            }
        }
        return long
    }
}
