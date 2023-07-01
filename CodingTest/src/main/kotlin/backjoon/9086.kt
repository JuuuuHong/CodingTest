package backjoon

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()

    for (i: Int in 1..a) {
        val b = sc.next()
        println("${b[0]}${b[b.length - 1]}")
    }
}