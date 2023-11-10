/* The isBadVersion API is defined in the parent class VersionControl.
      fun isBadVersion(version: Int) : Boolean {} 

    first check if n/2 is bad 
    if it is bad that means that either this or one before it is the first bad version

    if it isn't bad, that means the first bad version has to be after this

    for this and guess Number (Leetcode 374, be careful when calculating mid, 
    l + r vs l + (r - l) to avoid overflow errors)
*/

class Solution: VersionControl() {
  override fun firstBadVersion(n: Int) : Int {
      var l = 0
      var r = n
      var lbv = -1

      while (l <= r) {
          val mid = l + (r - l) / 2
          if (isBadVersion(mid)) {
              r = mid - 1
              lbv = mid
          } else {
              l = mid + 1
          }
      }
      return lbv
}

/* The isBadVersion API is defined in the parent class VersionControl.
      fun isBadVersion(version: Int) : Boolean {} 

    first check if n/2 is bad 
    if it is bad that means that either this or one before it is the first bad version

    if it isn't bad, that means the first bad version has to be after this
*/

class Solution: VersionControl() {
    override fun firstBadVersion(n: Int) : Int {
        var l = 0
        var r = n
        var bv = 0
        while (l <= r) {
            val mid = l + (r - l) / 2
            when (isBadVersion(mid)) {
                false -> l = mid + 1
                else -> {
                    bv = mid
                    r = mid - 1
                }
            }
        }
        return bv
	}
}
