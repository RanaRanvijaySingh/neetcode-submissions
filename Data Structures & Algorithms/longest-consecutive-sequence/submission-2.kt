class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if(nums.size <= 0) return 0
        nums.sort()
        val a = nums
        // [9,1,-3,2,4,8,3,-1,6,-2,-4,7]
        // [-4,-3,-2,-1,1,2,3,4,6,7,8,9]
        var i=1; var c=1; var longest = 1;
        while(i < a.size){
            if(a[i]-a[i-1]==0) {
                println("Do nothing $c")
            } else if(a[i]-a[i-1]==1){
                println("Increment count $c")
                c++
            } else {
                println("Reset counter $longest $c ")
                if(longest <= c) {
                    longest = c
                    c = 1
                }
            }
            i++
        }
        return if(c>longest) c else longest
    }
}
