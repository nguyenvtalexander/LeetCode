class MyStack() {
  val stack = ArrayDeque<Int>()

  fun push(x: Int) {
      stack.addFirst(x)
      for (i in stack.indices - 1) {
          stack.addFirst(stack.removeLast())
      }
  }

  fun pop(): Int {
      return stack.removeLast()
  }

  fun top(): Int {
      return stack.last()
  }

  fun empty(): Boolean {
      return stack.isEmpty()
  }

}

/**
* Your MyStack object will be instantiated and called as such:
* var obj = MyStack()
* obj.push(x)
* var param_2 = obj.pop()
* var param_3 = obj.top()
* var param_4 = obj.empty()
*/