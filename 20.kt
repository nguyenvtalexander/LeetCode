/*
Classic stack problem
iterate through string
If it's an opening bracket, add it to the stack
If it's a closing bracket, check if the stack is empty
if it's not, pop the top of the stack and check if it's not equal to the matching opening bracket
return false 
If we fully interate through the string, check if there are any remaining opening brackets in the stack
Return a check for whether of not the stack is empty

loop is O(N) where N is the size of the input string
space is O(N) because N can be up to the size of the stack

Final:
Time - O(N)
Space - O(N)
 */

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
