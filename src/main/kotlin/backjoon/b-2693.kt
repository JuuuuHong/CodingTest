package backjoon

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val array = Array(10, {0})

    for (i in 0 until a) {
        for (j in 0 until 10) {
            val b = sc.nextInt()
            array[j] = b
        }
        array.sort()
        println(array[7])
    }
}