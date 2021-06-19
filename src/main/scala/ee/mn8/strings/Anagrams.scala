package ee.mn8.strings

object Anagrams {

  def checkAnagrams(sa: String, sb: String): Boolean = ???

  def testCheckAnagrams() = {
    println(checkAnagrams("desserts", "stressed"))
    println(checkAnagrams("Scala", "Haskell"))
  }

  def main(args: Array[String]): Unit = {
    testCheckAnagrams()
  }
}
