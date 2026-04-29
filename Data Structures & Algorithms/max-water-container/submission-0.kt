class Solution {
    fun maxArea(heights: IntArray): Int {
        var i = 0
        var j = heights.size-1
        var max = 0
        println("Start with $i and $j positions")
        while(i<=j){
            var l = j-i
            var min = minOf(heights[i],heights[j])
            max = maxOf(max, (l*min))
            println("Length is $l and min is $min and max is $max")
            if(heights[i] < heights[j]){
                println("${heights[i]} is less move i to next big index")
                i++
            } else {
                println("${heights[j]} is less move j to next big index")
                j--
            }
        }
        return max
    }
}
