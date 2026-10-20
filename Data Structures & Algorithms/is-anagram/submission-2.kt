class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val charMap = HashMap<Char, Int>()

        for(chr in s) {
            charMap[chr] = charMap.getOrDefault(chr, 0) + 1
        }

        for (chr in t) {
            charMap[chr] = charMap.getOrDefault(chr, 0) - 1
        }

        return charMap.values.all { it == 0 }
    }
}
