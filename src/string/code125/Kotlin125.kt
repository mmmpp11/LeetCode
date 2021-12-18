package string.code125

class Kotlin125 {
    fun isPalindrome(s: String): Boolean {
        val str = StringBuilder()
        s.toLowerCase().toCharArray().filter { c: Char ->
            c.isLetterOrDigit()
        }.forEach{ c: Char ->
            str.append(c)
        }
        return str.toString() == str.toString().reversed()
    }
}

fun main() {
    println(Kotlin125().isPalindrome(
        "A man, a plan, a canal: Panama"))
}