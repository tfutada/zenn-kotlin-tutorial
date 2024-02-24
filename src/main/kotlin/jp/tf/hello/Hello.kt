package jp.tf.hello

fun main() {
    repeat(3) {
        val hello = "Hello $it"
        println(hello)
    }
}