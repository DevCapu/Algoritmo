fun twoSum(nums: IntArray, target: Int): IntArray {
    val result: IntArray = intArrayOf(0, 0)

    nums.forEachIndexed { index, num ->
        for (j in index + 1..<nums.size) {
            if (target == (num) + nums[j]) {
                result[0] = index
                result[1] = j
            }
        }
    }

    return result
}
