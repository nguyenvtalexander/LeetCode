class Solution {
    fun isValid(s: String): Boolean {
        val stack = mutableListOf<Char>()
        for (char in s) {
            when(char) {
                '(', '[', '{' -> stack.add(char)
                ')' -> if (stack.isEmpty() || stack.removeAt(stack.lastIndex) != '(') return false
                ']' -> if (stack.isEmpty() || stack.removeAt(stack.lastIndex) != '[') return false
                '}' -> if (stack.isEmpty() || stack.removeAt(stack.lastIndex) != '{') return false
            }
        }
        return stack.isEmpty()
    }
}
