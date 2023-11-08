/*
Handling the edge cases of the beginning and start of the flowerbed 
becomes simpler by adding a 0 to the end and beginning
this takes up more space, but substantially improves readability and lines of 
code
*/

class Solution {
  fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
      if (flowerbed.size < 2) {
          if (flowerbed[0] == 1) {
              return n <= 0
          } else {
              return n <= 1
          }
      }
      
      var count = 0

      if (flowerbed[0] == 0 && flowerbed[1] != 1) {
          count ++
          flowerbed[0] = 1
      } 

      if (flowerbed[flowerbed.lastIndex] == 0 && flowerbed[flowerbed.lastIndex - 1] != 1) {
          count ++
          flowerbed[flowerbed.lastIndex] = 1
      }

      for (i in 1..flowerbed.lastIndex - 1) {
          if (flowerbed[i] != 1 && flowerbed[i - 1] != 1 && flowerbed[i + 1] != 1) {
              count ++
              flowerbed[i] = 1
          }
      }

      return n <= count
  }
}

class Solution {
    fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
        var count = 0
        val bed = flowerbed.toMutableList()
        bed.add(0, 0)
        bed.add(0)

        for (i in 1..bed.lastIndex - 1) {
            if (bed[i] != 1 && bed[i - 1] != 1 && bed[i + 1] != 1) {
                count ++
                bed[i] = 1
            }
        }

        println(count)
        return count >= n
    }
}
