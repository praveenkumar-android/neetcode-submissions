class Solution {

    fun encode(strs: List<String>): String {
        val result = StringBuilder()

        for(str in strs) {
            result.append(str.length)
            result.append('#')
            result.append(str)
        }

        return result.toString()
    }

    fun decode(str: String): List<String> {
        val result = mutableListOf<String>()
        var i = 0

        while (i < str.length) {
            val separator = str.indexOf('#', i)
            val length = str.substring(i, separator).toInt()
            val start = separator + 1
            val end = start + length

            val word = str.substring(start, end)
            result.add(word)

            i = end
        }

        return result
    }
}
